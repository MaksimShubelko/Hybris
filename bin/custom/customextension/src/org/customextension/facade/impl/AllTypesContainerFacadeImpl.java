package org.customextension.facade.impl;

import de.hybris.platform.servicelayer.media.NoDataAvailableException;
import lombok.Setter;
import org.customextension.converter.AllTypesContainerConverter;
import org.customextension.data.AllTypesContainerData;
import org.customextension.facade.AllTypesContainerFacade;
import org.customextension.model.AllTypesContainerModel;
import org.customextension.service.impl.AllTypesContainerServiceImpl;

import java.util.List;
import java.util.stream.Collectors;

@Setter
public class AllTypesContainerFacadeImpl implements AllTypesContainerFacade {

    private AllTypesContainerConverter allTypesContainerConverter;

    private AllTypesContainerServiceImpl allTypesContainerService;
    @Override
    public List<AllTypesContainerData> findAll() {
        List<AllTypesContainerModel> allTypesContainerModels = allTypesContainerService.findAll();

        if (allTypesContainerModels.size() == 0) {
            throw new NoDataAvailableException("No allTypeContainers available");
        }

        return allTypesContainerModels.stream()
                .map(allTypesContainerConverter::convert)
                .collect(Collectors.toList());
    }
}
