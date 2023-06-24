package org.customextension.dao.impl;

import de.hybris.bootstrap.annotations.UnitTest;
import org.customextension.dao.ContactRequestDao;
import org.customextension.model.ContactRequestModel;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertNotNull;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@UnitTest
public class ContactRequestDaoImplTest {

    @Mock
    private ContactRequestDao contactRequestDao = new ContactRequestDaoImpl();

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void findBySender() {
        when(contactRequestDao.findBySender(anyString())).thenReturn(Collections.emptyList());

        List<ContactRequestModel> result = contactRequestDao.findBySender(anyString());

        assertNotNull(result);
    }
}