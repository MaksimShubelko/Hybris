package org.customextension.converter;

import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import org.customextension.data.AllTypesContainerData;
import org.customextension.model.AllTypesContainerModel;

public class AllTypesContainerConverter implements Converter<AllTypesContainerModel, AllTypesContainerData> {
    @Override
    public AllTypesContainerData convert(final AllTypesContainerModel source) throws ConversionException {
        final AllTypesContainerData data = new AllTypesContainerData();
        return convert(source, data);
    }

    @Override
    public AllTypesContainerData convert(AllTypesContainerModel source, AllTypesContainerData prototype) throws ConversionException {
        prototype.setName(source.getName());
        prototype.setMap(source.getMap());
        prototype.setListOfStrings(source.getListOfStrings());
        prototype.setNonDynamicEnum(source.getNonDynamicEnum());
        return prototype;
    }
}
