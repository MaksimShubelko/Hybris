package org.customextension.facade.impl;

import de.hybris.platform.servicelayer.exceptions.ModelNotFoundException;
import lombok.Setter;
import org.customextension.converter.ContactRequestConverter;
import org.customextension.data.ContactRequestData;
import org.customextension.facade.ContactRequestFacade;
import org.customextension.model.ContactRequestModel;
import org.customextension.service.ContactRequestService;

import java.util.Objects;

@Setter
public class ContactRequestFacadeImpl implements ContactRequestFacade {

    private ContactRequestConverter contactRequestConverter;

    private ContactRequestService contactRequestService;

    @Override
    public ContactRequestData findBySender(String sender) {
        ContactRequestModel contactRequestModel = contactRequestService.findBySender(sender);

        if (Objects.isNull(contactRequestModel)) {
            throw new ModelNotFoundException("contactRequestModel is null");
        }

        return contactRequestConverter.convert(contactRequestModel);
    }
}
