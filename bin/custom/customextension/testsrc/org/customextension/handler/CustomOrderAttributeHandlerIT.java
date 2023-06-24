package org.customextension.handler;

import de.hybris.bootstrap.annotations.IntegrationTest;
import de.hybris.platform.servicelayer.ServicelayerTransactionalTest;
import de.hybris.platform.servicelayer.model.ModelService;
import org.customextension.model.CustomOrderModel;
import org.junit.Test;

import javax.annotation.Resource;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

import static org.junit.Assert.assertEquals;

@IntegrationTest
public class CustomOrderAttributeHandlerIT extends ServicelayerTransactionalTest {

    @Resource
    private ModelService modelService;

    @Test
    public void get() {
        CustomOrderModel model = modelService.create(CustomOrderModel.class);
        model.setPrice(BigDecimal.valueOf(1.68));

        assertEquals(BigDecimal.valueOf(1.68).round(new MathContext(1, RoundingMode.UP)), model.getTotalPrice());


    }
}