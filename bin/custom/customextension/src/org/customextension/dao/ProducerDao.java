package org.customextension.dao;

import org.customextension.model.ProducerModel;

import java.util.List;

public interface ProducerDao {

    List<ProducerModel> findProducerByCode(String code);
}
