package org.customextension.events;

import de.hybris.platform.servicelayer.event.impl.AbstractEventListener;
import de.hybris.platform.servicelayer.model.ModelService;
import lombok.Getter;
import lombok.Setter;
import org.customextension.model.NewsModel;

import java.util.Date;
import java.util.Objects;

@Getter
@Setter
public class BandAlbumSalesEventListener extends AbstractEventListener<BandAlbumSalesEvent> {

    private static final String BAND_SALES_HEADLINE = "%s album sales exceed 50000";
    private static final String BAND_SALES_CONTENT = "%s album sales reported as %s";
    private ModelService modelService;

    @Override
    protected void onEvent(BandAlbumSalesEvent event) {
        if (Objects.nonNull(event)) {
            final String headline = String.format(BAND_SALES_HEADLINE, event.getName());
            final String content = String.format(BAND_SALES_CONTENT, event.getName(), event.getSales());
            final NewsModel news = modelService.create(NewsModel.class);
            news.setDate(new Date());
            news.setHeadline(headline);
            news.setContent(content);
            modelService.save(news);

        }
    }
}
