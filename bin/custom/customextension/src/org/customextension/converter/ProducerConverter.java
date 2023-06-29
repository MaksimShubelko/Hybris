package org.customextension.converter;

import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import org.customextension.data.ProducerData;
import org.customextension.model.ProducerModel;


public class ProducerConverter implements Converter<ProducerModel, ProducerData> {
    @Override
    public ProducerData convert(ProducerModel producerModel) throws ConversionException {
        return convert(producerModel, new ProducerData());
    }

    @Override
    public ProducerData convert(ProducerModel producerModel, ProducerData producerData) throws ConversionException {
        producerData.setFirstname(producerModel.getFirstname());
        producerData.setLastname(producerModel.getLastname());
        return producerData;
    }
}

