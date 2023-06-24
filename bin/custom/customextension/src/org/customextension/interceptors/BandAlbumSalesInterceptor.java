package org.customextension.interceptors;

import de.hybris.platform.servicelayer.event.EventService;
import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.PrepareInterceptor;
import de.hybris.platform.servicelayer.interceptor.ValidateInterceptor;
import lombok.Setter;
import org.customextension.events.BandAlbumSalesEvent;
import org.customextension.model.BandModel;

import java.math.BigDecimal;
import java.util.Objects;

@Setter
public class BandAlbumSalesInterceptor implements ValidateInterceptor<BandModel>, PrepareInterceptor<BandModel> {

    private static final BigDecimal BIG_SALES = BigDecimal.valueOf(50000L);
    private static final BigDecimal NEGATIVE_SALES = BigDecimal.ZERO;
    private EventService eventService;

    @Override
    public void onPrepare(BandModel bandModel, InterceptorContext context) throws InterceptorException {
        final BigDecimal sales = bandModel.getAlbumSales();
        if (Objects.nonNull(sales) && sales.compareTo(NEGATIVE_SALES) < 0) {
            throw new InterceptorException("Album sales must be positive");
        }
    }

    @Override
    public void onValidate(BandModel bandModel, InterceptorContext context) {
        if (hasBecameBig(bandModel, context)) {
            eventService.publishEvent(new BandAlbumSalesEvent(bandModel.getCode(),
                    bandModel.getName(),
                    bandModel.getAlbumSales()));
        }
    }

    private boolean hasBecameBig(final BandModel bandModel, InterceptorContext context) {
        final BigDecimal sales = bandModel.getAlbumSales();

        if (Objects.nonNull(sales) && sales.compareTo(BIG_SALES) >= 0) {
            if (context.isNew(bandModel)) {
                return true;
            } else {
                final BigDecimal oldValue = bandModel.getItemModelContext().getOriginalValue(BandModel.ALBUMSALES);
                return Objects.isNull(oldValue) || oldValue.compareTo(BIG_SALES) < 0;
            }
        }

        return false;
    }
}
