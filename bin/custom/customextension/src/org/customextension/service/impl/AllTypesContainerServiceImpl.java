package org.customextension.service.impl;

import de.hybris.platform.servicelayer.media.NoDataAvailableException;
import lombok.Setter;
import org.customextension.dao.AllTypesContainerDao;
import org.customextension.model.AllTypesContainerModel;
import org.customextension.service.AllTypesContainerService;

import java.util.List;

@Setter
public class AllTypesContainerServiceImpl implements AllTypesContainerService {

    private AllTypesContainerDao allTypesContainerDao;
    @Override
    public List<AllTypesContainerModel> findAll() {
        final List<AllTypesContainerModel> allTypesContainerModels = allTypesContainerDao.findAll();

        if (allTypesContainerModels.size() == 0) {
            throw new NoDataAvailableException("No allTypeContainers available");
        }

        return allTypesContainerModels;
    }


}
