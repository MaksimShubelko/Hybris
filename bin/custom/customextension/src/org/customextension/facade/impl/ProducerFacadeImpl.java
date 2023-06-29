package org.customextension.facade.impl;

import lombok.Setter;
import org.customextension.converter.ProducerConverter;
import org.customextension.data.ProducerData;
import org.customextension.facade.ProducerFacade;
import org.customextension.model.ProducerModel;
import org.customextension.service.ProducerService;

@Setter
public class ProducerFacadeImpl implements ProducerFacade {

    private ProducerService producerService;

    private ProducerConverter producerConverter;

    @Override
    public ProducerData getProducerByCode(String code) {
        ProducerModel producerModel = producerService.getProducerByCode(code);
        ProducerData producerData = producerConverter.convert(producerModel);
        return producerData;
    }
}
