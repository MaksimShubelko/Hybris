package org.customextension.service.impl;

import de.hybris.platform.servicelayer.exceptions.AmbiguousIdentifierException;
import de.hybris.platform.servicelayer.exceptions.ModelNotFoundException;
import lombok.Setter;
import org.customextension.dao.ContactRequestDao;
import org.customextension.model.ContactRequestModel;
import org.customextension.service.ContactRequestService;

import java.util.List;

@Setter
public class ContactRequestServiceImpl implements ContactRequestService {

    private ContactRequestDao contactRequestDao;
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
}
