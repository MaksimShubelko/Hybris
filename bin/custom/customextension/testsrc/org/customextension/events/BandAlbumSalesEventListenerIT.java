package org.customextension.events;

import de.hybris.bootstrap.annotations.IntegrationTest;
import de.hybris.platform.core.Registry;
import de.hybris.platform.servicelayer.ServicelayerTransactionalTest;
import de.hybris.platform.servicelayer.exceptions.ModelSavingException;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import org.customextension.model.BandModel;
import org.customextension.model.NewsModel;
import org.junit.Before;
import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

@IntegrationTest
public class BandAlbumSalesEventListenerIT extends ServicelayerTransactionalTest {

    private String FIND_NEWS_ORDER_BY_CREATIONTIME_DESC = """
            SELECT {News.PK} FROM
            {
                News
            } ORDER BY
            {
                News.CREATIONTIME
            } DESC
            """;
    @Resource
    private FlexibleSearchService flexibleSearchService;
    @Resource
    private ModelService modelService;
    private static final String BAND_CODE = "101-JAZ";
    private static final String BAND_NAME = "Tight Notes";
    private static final String BAND_HISTORY = "New contemporary, 7-piece Jaz unit from London, formed in 2015";
    private static final Long MANY_ALBUMS_SOLD = Long.valueOf(1000000L);

    @Before
    public void setUp() throws Exception {
        try {
            Thread.sleep(TimeUnit.SECONDS.toMillis(1));
            new JdbcTemplate(Registry.getCurrentTenant().getDataSource()).execute("CHECKPOINT");
            Thread.sleep(TimeUnit.SECONDS.toMillis(1));
        }
        catch (InterruptedException exc) {}
        createCoreData();
        createDefaultCatalog();
    }

    @Test(expected = ModelSavingException.class)
    public void testValidationInterceptor() {
        final BandModel band = modelService.create(BandModel.class);
        band.setCode(BAND_CODE);
        band.setAlbumSales(BigDecimal.valueOf(-10L));
        modelService.save(band);
    }

    @Test
    public void testEventSending() {
        final BandModel band = modelService.create(BandModel.class);
        band.setCode(BAND_CODE);
        band.setName(BAND_NAME);
        band.setHistory(BAND_HISTORY);
        band.setAlbumSales(BigDecimal.valueOf(MANY_ALBUMS_SOLD));
        modelService.save(band);
        final NewsModel news = findLastNews();
        assertNotNull(news);
        assertTrue("Unexpected news: " + news.getHeadline(), news.getHeadline().contains(BAND_NAME));
    }
    private NewsModel findLastNews() {
        final List<NewsModel> list = flexibleSearchService
                .<NewsModel> search(FIND_NEWS_ORDER_BY_CREATIONTIME_DESC).getResult();
        if (list.isEmpty())
        {
            return null;
        }
        else
        {
            return list.get(0);
        }
    }
}