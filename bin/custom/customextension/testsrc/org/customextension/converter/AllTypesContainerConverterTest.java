package org.customextension.converter;

import de.hybris.bootstrap.annotations.UnitTest;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import org.customextension.data.AllTypesContainerData;
import org.customextension.enums.NonDynamicEnum;
import org.customextension.model.AllTypesContainerModel;
import org.junit.Before;
import org.junit.Test;

import java.util.Collections;

import static org.junit.Assert.*;

@UnitTest
public class AllTypesContainerConverterTest {

    private AllTypesContainerModel allTypesContainerModel = new AllTypesContainerModel();
    private Converter<AllTypesContainerModel, AllTypesContainerData> allTypesContainerConverter = new AllTypesContainerConverter();

    @Before
    public void setUp() {
        allTypesContainerModel.setName("name");
        allTypesContainerModel.setListOfStrings(Collections.emptyList());
        allTypesContainerModel.setMap(Collections.emptyMap());
        allTypesContainerModel.setNonDynamicEnum(NonDynamicEnum.VALUE);
    }

    @Test
    public void convert() {
        AllTypesContainerData allTypesContainerData = allTypesContainerConverter.convert(allTypesContainerModel);

        assert allTypesContainerData != null;
        assertNotNull(allTypesContainerData.getListOfStrings());
        assertEquals(Collections.emptyList(), allTypesContainerData.getListOfStrings());
        assertEquals(Collections.emptyMap(), allTypesContainerData.getMap());
        assertEquals("name", allTypesContainerData.getName());
        assertEquals(NonDynamicEnum.VALUE, allTypesContainerData.getNonDynamicEnum());
    }

}