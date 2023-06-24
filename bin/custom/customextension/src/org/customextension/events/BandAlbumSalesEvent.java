package org.customextension.events;

import de.hybris.platform.servicelayer.event.events.AbstractEvent;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;

@AllArgsConstructor
@Getter
public class BandAlbumSalesEvent extends AbstractEvent {
    private final String code;
    private final String name;
    private final BigDecimal sales;

}
