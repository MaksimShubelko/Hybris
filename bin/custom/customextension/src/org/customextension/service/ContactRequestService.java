package org.customextension.service;

import org.customextension.model.ContactRequestModel;

public interface ContactRequestService {

    ContactRequestModel findBySender(final String sender);

}
