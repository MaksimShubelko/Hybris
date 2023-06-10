/*
 * Copyright (c) 2021 SAP SE or an SAP affiliate company. All rights reserved.
 */
package org.customextension.setup;

import static org.customextension.constants.CustomextensionConstants.PLATFORM_LOGO_CODE;

import de.hybris.platform.core.initialization.SystemSetup;

import java.io.InputStream;

import org.customextension.constants.CustomextensionConstants;
import org.customextension.service.CustomextensionService;


@SystemSetup(extension = CustomextensionConstants.EXTENSIONNAME)
public class CustomextensionSystemSetup
{
	private final CustomextensionService customextensionService;

	public CustomextensionSystemSetup(final CustomextensionService customextensionService)
	{
		this.customextensionService = customextensionService;
	}

	@SystemSetup(process = SystemSetup.Process.INIT, type = SystemSetup.Type.ESSENTIAL)
	public void createEssentialData()
	{
		customextensionService.createLogo(PLATFORM_LOGO_CODE);
	}

	private InputStream getImageStream()
	{
		return CustomextensionSystemSetup.class.getResourceAsStream("/customextension/sap-hybris-platform.png");
	}
}
