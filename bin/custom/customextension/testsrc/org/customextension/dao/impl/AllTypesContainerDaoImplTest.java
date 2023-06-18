package org.customextension.dao.impl;

import de.hybris.bootstrap.annotations.UnitTest;
import org.customextension.dao.AllTypesContainerDao;
import org.customextension.model.AllTypesContainerModel;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;


@UnitTest
public class AllTypesContainerDaoImplTest {

    @Mock
    private AllTypesContainerDao allTypesContainerDao = new AllTypesContainerDaoImpl();


    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void findAll() {
        when(allTypesContainerDao.findAll()).thenReturn(Collections.emptyList());

        List<AllTypesContainerModel> allTypesContainerModels = allTypesContainerDao.findAll();

        assertNotNull(allTypesContainerModels);
    }
}