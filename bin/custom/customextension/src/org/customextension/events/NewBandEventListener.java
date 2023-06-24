package org.customextension.events;

import de.hybris.platform.servicelayer.event.events.AfterItemCreationEvent;
import de.hybris.platform.servicelayer.event.impl.AbstractEventListener;
import de.hybris.platform.servicelayer.model.ModelService;
import lombok.Getter;
import lombok.Setter;
import org.customextension.model.BandModel;
import org.customextension.model.NewsModel;

import java.util.Date;
import java.util.Objects;

@Getter
@Setter
public class NewBandEventListener extends AbstractEventListener<AfterItemCreationEvent> {

    private static final String NEW_BAND_HEADLINE = "New band, %s";
    private static final String NEW_BAND_CONTENT = "There is a new band in town called, %s. Tour news to be announced soon.";
    private ModelService modelService;

    @Override
    protected void onEvent(AfterItemCreationEvent event) {
        if (Objects.nonNull(event) && Objects.nonNull(event.getSource())) {
            final Object object = modelService.get(event.getSource());
            if (object instanceof BandModel band) {
                final String headline = String.format(NEW_BAND_HEADLINE, band.getName());
                final String content = String.format(NEW_BAND_CONTENT, band.getName());
                final NewsModel news = modelService.create(NewsModel.class);
                news.setDate(new Date());
                news.setHeadline(headline);
                news.setContent(content);
                modelService.save(news);
            }
        }
    }
}
