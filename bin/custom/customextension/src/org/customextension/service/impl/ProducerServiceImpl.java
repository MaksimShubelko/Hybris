package org.customextension.service.impl;

import de.hybris.platform.servicelayer.exceptions.AmbiguousIdentifierException;
import de.hybris.platform.servicelayer.exceptions.ModelNotFoundException;
import lombok.Setter;
import org.customextension.dao.ProducerDao;
import org.customextension.model.ProducerModel;
import org.customextension.service.ProducerService;

import java.util.List;

@Setter
public class ProducerServiceImpl implements ProducerService {

    private ProducerDao producerDao;

    @Override
    public ProducerModel getProducerByCode(String code) {
        final List<ProducerModel> result = producerDao.findProducerByCode(code);
        final int resultSize = result.size();

        if (resultSize == 0) {
            throw new ModelNotFoundException("No producer with code " + code + " wasn't found");
        }

        if (resultSize > 1) {
            throw new AmbiguousIdentifierException("Producer with code " + code + " isn't unique");
        }

        return result.get(0);
    }
}
