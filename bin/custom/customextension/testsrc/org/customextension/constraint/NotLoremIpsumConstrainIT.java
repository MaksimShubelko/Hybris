package org.customextension.constraint;


import de.hybris.bootstrap.annotations.IntegrationTest;
import de.hybris.platform.servicelayer.ServicelayerTransactionalTest;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.validation.exceptions.HybrisConstraintViolation;
import de.hybris.platform.validation.services.ValidationService;
import org.customextension.model.BandModel;
import org.customextension.model.NotLoremIpsumConstraintModel;
import org.junit.Before;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@IntegrationTest
public class NotLoremIpsumConstrainIT extends ServicelayerTransactionalTest {
    @Resource
    private ModelService modelService;
    @Resource
    private ValidationService validationService;

    @Before
    public void setup() throws Exception {
        createCoreData();
        importCsv("/impex/essentialdata-constraints.impex", "UTF-8");
        validationService.reloadValidationEngine();
    }

    @Test
    public void testLoremIpsumConstraint() {
        final BandModel band = modelService.create(BandModel.class);
        band.setCode("LoremIpsumTest1");
        band.setName("LoremIpsumBand");
        band.setHistory("Lorem Ipsum is here");
        final Set<HybrisConstraintViolation> violations = validationService.validate(band);
        assertTrue("The violation set should not be null or empty",
                violations != null && violations.size() > 0);
        assertEquals("There should be one constraint violations", 1, violations.size());
        violations.forEach(v -> assertEquals(NotLoremIpsumConstraintModel.class, v.getConstraintModel().getClass()));

    }
}