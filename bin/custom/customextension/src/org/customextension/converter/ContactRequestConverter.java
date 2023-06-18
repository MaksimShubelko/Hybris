package org.customextension.converter;

import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import org.customextension.data.ContactRequestData;
import org.customextension.model.ContactRequestModel;

public class ContactRequestConverter implements Converter<ContactRequestModel, ContactRequestData> {
    @Override
    public ContactRequestData convert(ContactRequestModel source) throws ConversionException {
        ContactRequestData data = new ContactRequestData();
        return convert(source, data);
    }

    @Override
    public ContactRequestData convert(ContactRequestModel source, ContactRequestData prototype) throws ConversionException {
        prototype.setMessage(source.getMessage());
        prototype.setSender(source.getSender());
        return prototype;
    }
}
