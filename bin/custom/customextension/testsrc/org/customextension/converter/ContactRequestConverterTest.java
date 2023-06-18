package org.customextension.converter;

import de.hybris.bootstrap.annotations.UnitTest;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import org.customextension.data.ContactRequestData;
import org.customextension.model.ContactRequestModel;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

@UnitTest
public class ContactRequestConverterTest {

    private Converter<ContactRequestModel, ContactRequestData> contactRequestConverter = new ContactRequestConverter();

    private ContactRequestModel contactRequestModel = new ContactRequestModel();

    @Before
    public void setUp() {
        contactRequestModel.setMessage("message");
        contactRequestModel.setSender("sender");
    }

    @Test
    public void convert() {
        ContactRequestData contactRequestData = contactRequestConverter.convert(contactRequestModel);

        assert contactRequestData != null;
        assertEquals("message", contactRequestData.getMessage());
        assertEquals("sender", contactRequestData.getSender());
    }
}