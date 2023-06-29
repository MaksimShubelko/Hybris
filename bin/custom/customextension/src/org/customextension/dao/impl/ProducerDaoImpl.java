package org.customextension.dao.impl;

import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import lombok.Setter;
import org.customextension.dao.ProducerDao;
import org.customextension.model.ProducerModel;

import java.util.List;

@Setter
public class ProducerDaoImpl implements ProducerDao {

    private static final String FIND_PRODUCER_BY_CODE = """
            SELECT {Producer.PK} FROM
            {
                Producer
            } WHERE {Producer.CODE} = ?code
            """;

    private FlexibleSearchService flexibleSearchService;

    @Override
    public List<ProducerModel> findProducerByCode(String code) {
        final FlexibleSearchQuery flexibleSearchQuery = new FlexibleSearchQuery(FIND_PRODUCER_BY_CODE);
        flexibleSearchQuery.addQueryParameter("code", code);
        return flexibleSearchService.<ProducerModel>search(flexibleSearchQuery).getResult();
    }
}
