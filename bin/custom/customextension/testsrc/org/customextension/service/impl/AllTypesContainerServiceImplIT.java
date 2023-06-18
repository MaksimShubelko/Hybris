package org.customextension.service.impl;

import de.hybris.bootstrap.annotations.IntegrationTest;
import de.hybris.platform.servicelayer.ServicelayerTransactionalTest;
import org.customextension.model.AllTypesContainerModel;
import org.customextension.service.AllTypesContainerService;
import org.junit.Test;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;

@IntegrationTest
public class AllTypesContainerServiceImplIT extends ServicelayerTransactionalTest {

    @Resource
    private AllTypesContainerService allTypesContainerService;

    @Test
    public void findAll() {
        List<AllTypesContainerModel> typesContainerModels = allTypesContainerService.findAll();

        assertEquals(1, typesContainerModels.size());
    }
}