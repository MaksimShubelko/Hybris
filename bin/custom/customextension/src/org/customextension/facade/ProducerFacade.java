package org.customextension.facade;

import org.customextension.data.ProducerData;

public interface ProducerFacade {

    ProducerData getProducerByCode(String code);
}
