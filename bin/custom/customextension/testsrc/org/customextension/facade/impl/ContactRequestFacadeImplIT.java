package org.customextension.facade.impl;

import de.hybris.bootstrap.annotations.IntegrationTest;
import de.hybris.platform.servicelayer.ServicelayerTransactionalTest;
import org.customextension.data.ContactRequestData;
import org.customextension.facade.ContactRequestFacade;
import org.junit.Test;

import javax.annotation.Resource;

import static org.junit.Assert.*;

@IntegrationTest
public class ContactRequestFacadeImplIT extends ServicelayerTransactionalTest {

    @Resource
    private ContactRequestFacade contactRequestFacade;
    @Test
    public void findBySender() {
        ContactRequestData contactRequestData = contactRequestFacade.findBySender("sender");

        assertEquals("sender", contactRequestData.getSender());
        assertEquals("message", contactRequestData.getMessage());
    }
}