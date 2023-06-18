package org.customextension.service.impl;

import de.hybris.platform.servicelayer.media.NoDataAvailableException;
import lombok.Setter;
import org.customextension.dao.ContactRequestDao;
import org.customextension.exception.InvalidSearchingResultException;
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
            throw new NoDataAvailableException("No data was found");
        }

        if (requestModels.size() > 1) {
            throw new InvalidSearchingResultException("Sender isn't unique");
        }

        return requestModels.get(0);
    }
}
