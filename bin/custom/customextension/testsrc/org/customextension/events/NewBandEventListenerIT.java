package org.customextension.events;

import de.hybris.platform.servicelayer.ServicelayerTransactionalTest;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.testframework.Transactional;
import org.customextension.model.BandModel;
import org.customextension.model.NewsModel;
import org.junit.Test;

import javax.annotation.Resource;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

@Transactional
public class NewBandEventListenerIT extends ServicelayerTransactionalTest {

    @Resource
    private ModelService modelService;

    private String FIND_NEW = """
            SELECT {News.PK} FROM
            {
                News
            } WHERE {News.HEADLINE} = 'New band, test_name'
            """;

    @Resource
    private FlexibleSearchService flexibleSearchService;

    @Test
    public void onEvent() {
        BandModel bandModel = modelService.create(BandModel.class);
        bandModel.setName("test_name");
        bandModel.setHistory("history");
        bandModel.setCode("code");
        bandModel.setAlbumSales(BigDecimal.valueOf(5));
        modelService.save(bandModel);

        List<NewsModel> newsModel = flexibleSearchService.<NewsModel>search(FIND_NEW).getResult();

        assertFalse(newsModel.isEmpty());
        assertNotNull(newsModel.get(0));
    }
}