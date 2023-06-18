package org.customextension.dao;

import de.hybris.platform.servicelayer.internal.dao.Dao;
import org.customextension.model.AllTypesContainerModel;

import java.util.List;

public interface AllTypesContainerDao extends Dao {

    List<AllTypesContainerModel> findAll();

}
