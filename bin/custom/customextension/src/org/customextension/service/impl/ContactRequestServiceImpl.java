package org.customextension.service.impl;

import de.hybris.platform.servicelayer.config.ConfigurationService;
import de.hybris.platform.servicelayer.exceptions.AmbiguousIdentifierException;
import de.hybris.platform.servicelayer.exceptions.ModelNotFoundException;
import lombok.Setter;
import org.customextension.dao.ContactRequestDao;
import org.customextension.model.ContactRequestModel;
import org.customextension.service.ContactRequestService;

import java.util.List;

@Setter
public class ContactRequestServiceImpl implements ContactRequestService {

    private static final String SAMPLE_SENDER = "contactRequest.sample.sender";
    private static final String SAMPLE_MESSAGE = "contactRequest.sample.message";

    private ContactRequestDao contactRequestDao;

    private ConfigurationService configurationService;

    @Override
    public ContactRequestModel findBySender(String sender) {
        final List<ContactRequestModel> requestModels = contactRequestDao.findBySender(sender);

        if (requestModels.size() == 0) {
            throw new ModelNotFoundException("No data was found");
        }

        if (requestModels.size() > 1) {
            throw new AmbiguousIdentifierException("Sender isn't unique");
        }

        return requestModels.get(0);
    }

    private ContactRequestModel getSampleContactRequest() {
        ContactRequestModel contactRequestModel = new ContactRequestModel();
        contactRequestModel.setSender(configurationService.getConfiguration().getString(SAMPLE_SENDER));
        contactRequestModel.setSender(configurationService.getConfiguration().getString(SAMPLE_MESSAGE));
        return contactRequestModel;
    }
}
