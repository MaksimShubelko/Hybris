package org.customextension.service.impl;

import de.hybris.bootstrap.annotations.IntegrationTest;
import de.hybris.platform.servicelayer.ServicelayerTransactionalTest;
import org.customextension.model.ContactRequestModel;
import org.customextension.service.ContactRequestService;
import org.junit.Before;
import org.junit.Test;

import javax.annotation.Resource;

import static org.junit.Assert.assertEquals;

@IntegrationTest
public class ContactRequestServiceImplIT extends ServicelayerTransactionalTest {

    private static final String EXISTING_SENDER = "sender";
    private static final String EXISTING_MESSAGE = "message";

    private ContactRequestModel contactRequestModel;

    @Resource
    private ContactRequestService contactRequestService;

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void findBySender() {
        ContactRequestModel contactRequestModel = contactRequestService.findBySender(EXISTING_SENDER);

        assertEquals(EXISTING_MESSAGE, contactRequestModel.getMessage());
    }

}