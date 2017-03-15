/*******************************************************************************
 * Copyright (c) 2017 Pivotal, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Pivotal, Inc. - initial API and implementation
 *******************************************************************************/
package org.springframework.ide.eclipse.boot.wizard;

import org.eclipse.core.resources.IProject;
import org.eclipse.jface.preference.IPreferenceStore;
import org.springframework.ide.eclipse.boot.core.BootActivator;
import org.springframework.ide.eclipse.boot.core.SpringBootCore;
import org.springframework.ide.eclipse.boot.core.initializr.InitializrService;
import org.springsource.ide.eclipse.commons.frameworks.core.downloadmanager.URLConnectionFactory;

public class EditStartersFactoryModel {

	public static InitializrFactoryModel<EditStartersModel> create(
			URLConnectionFactory urlConnectionFactory,
			IPreferenceStore prefs,
			IProject selectedProject
	) {
		return new InitializrFactoryModel<>((url) -> {
			InitializrService initializr = InitializrService.create(urlConnectionFactory, url);
			SpringBootCore springBootCore = new SpringBootCore(initializr);
			return new EditStartersModel(selectedProject, springBootCore, prefs);
		});
	}

}
