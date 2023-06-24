package org.customextension.handler;

import de.hybris.platform.servicelayer.model.attribute.DynamicAttributeHandler;
import org.customextension.model.CustomOrderModel;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class CustomOrderAttributeHandler implements DynamicAttributeHandler<BigDecimal, CustomOrderModel> {

    @Override
    public BigDecimal get(CustomOrderModel model) {
        return model.getPrice().round(new MathContext(1, RoundingMode.UP));
    }

    @Override
    public void set(CustomOrderModel model, BigDecimal bigDecimal) {
        throw new UnsupportedOperationException("Shouldn't write value");
    }
}
