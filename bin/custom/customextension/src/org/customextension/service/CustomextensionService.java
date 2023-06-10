/*
 * Copyright (c) 2021 SAP SE or an SAP affiliate company. All rights reserved.
 */
package org.customextension.service;

public interface CustomextensionService
{
	String getHybrisLogoUrl(String logoCode);

	void createLogo(String logoCode);
}
