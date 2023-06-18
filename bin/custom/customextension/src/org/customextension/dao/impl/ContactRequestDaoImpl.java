package org.customextension.dao.impl;

import de.hybris.platform.servicelayer.internal.dao.AbstractItemDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.SearchResult;
import org.customextension.dao.ContactRequestDao;
import org.customextension.model.ContactRequestModel;

import java.util.List;


public class ContactRequestDaoImpl extends AbstractItemDao implements ContactRequestDao {

    private static final String FIND_CONTACT_REQUEST_BY_SENDER = """
            SELECT {ContactRequest.PK} FROM
            {
                ContactRequest
            }
            WHERE {ContactRequest.SENDER} = ?sender
            """;

    @Override
    public List<ContactRequestModel> findBySender(final String sender) {
        final FlexibleSearchQuery query = new FlexibleSearchQuery(FIND_CONTACT_REQUEST_BY_SENDER);
        query.addQueryParameter("sender", sender);
        final SearchResult<ContactRequestModel> result = super.getFlexibleSearchService().search(query);

        return result.getResult();
    }
}
