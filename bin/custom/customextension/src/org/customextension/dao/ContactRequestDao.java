package org.customextension.dao;

import de.hybris.platform.servicelayer.internal.dao.Dao;
import org.customextension.model.ContactRequestModel;

import java.util.List;

public interface ContactRequestDao extends Dao {

     List<ContactRequestModel> findBySender(final String sender);

}
