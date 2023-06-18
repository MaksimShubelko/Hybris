package org.customextension.facade;

import org.customextension.data.ContactRequestData;

public interface ContactRequestFacade {

    ContactRequestData findBySender(final String sender);
}
