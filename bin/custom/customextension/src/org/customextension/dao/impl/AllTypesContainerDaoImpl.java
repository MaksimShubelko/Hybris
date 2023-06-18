package org.customextension.dao.impl;

import de.hybris.platform.servicelayer.internal.dao.AbstractItemDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.SearchResult;
import org.customextension.dao.AllTypesContainerDao;
import org.customextension.jalo.AllTypesContainer;
import org.customextension.model.AllTypesContainerModel;

import java.util.List;

public class AllTypesContainerDaoImpl extends AbstractItemDao implements AllTypesContainerDao {

    private static final String FIND_ALL = "SELECT {%s} FROM {%s}";
    @Override
    public List<AllTypesContainerModel> findAll() {
        final String queryString = String.format(FIND_ALL, AllTypesContainer.PK, "AllTypesContainer");

        final FlexibleSearchQuery query = new FlexibleSearchQuery(queryString);
        final SearchResult<AllTypesContainerModel> result = super.getFlexibleSearchService().search(query);

        return result.getResult();
    }

}
