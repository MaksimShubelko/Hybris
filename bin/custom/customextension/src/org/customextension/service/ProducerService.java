package org.customextension.service;

import org.customextension.model.ProducerModel;

public interface ProducerService {

    ProducerModel getProducerByCode(String code);
}
