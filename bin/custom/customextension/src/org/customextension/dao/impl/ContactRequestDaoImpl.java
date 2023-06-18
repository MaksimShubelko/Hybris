package org.customextension.dao.impl;

import de.hybris.platform.servicelayer.internal.dao.AbstractItemDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.SearchResult;
import org.customextension.dao.ContactRequestDao;
import org.customextension.jalo.ContactRequest;
import org.customextension.model.ContactRequestModel;

import java.util.List;


public class ContactRequestDaoImpl extends AbstractItemDao implements ContactRequestDao {

    private static final String FIND_CONTACT_REQUEST_BY_SENDER = "SELECT {%S} FROM {%s} WHERE {%s} = ?sender";

    @Override
    public List<ContactRequestModel> findBySender(final String sender) {
        final String queryString = String
                .format(FIND_CONTACT_REQUEST_BY_SENDER, ContactRequest.PK, "ContactRequest", ContactRequest.SENDER);
        final FlexibleSearchQuery query = new FlexibleSearchQuery(queryString);
        query.addQueryParameter("sender", sender);
        final SearchResult<ContactRequestModel> result = super.getFlexibleSearchService().search(query);

        return result.getResult();
    }
}
