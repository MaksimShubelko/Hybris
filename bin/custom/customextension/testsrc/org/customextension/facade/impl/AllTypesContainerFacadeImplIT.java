package org.customextension.facade.impl;

import de.hybris.bootstrap.annotations.IntegrationTest;
import de.hybris.platform.servicelayer.ServicelayerTransactionalTest;
import org.customextension.data.AllTypesContainerData;
import org.customextension.facade.AllTypesContainerFacade;
import org.junit.Before;
import org.junit.Test;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.assertFalse;

@IntegrationTest
public class AllTypesContainerFacadeImplIT extends ServicelayerTransactionalTest {

    @Resource
    private AllTypesContainerFacade allTypesContainerFacade;

    @Before
    public void setUp() {
    }

    @Test
    public void findAll() {
        List<AllTypesContainerData> allTypesContainerDataList = allTypesContainerFacade.findAll();

        assertFalse(allTypesContainerDataList.isEmpty());
    }
}