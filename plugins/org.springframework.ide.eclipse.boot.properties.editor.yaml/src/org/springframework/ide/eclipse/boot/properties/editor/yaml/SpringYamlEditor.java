/*******************************************************************************
 * Copyright (c) 2015 Pivotal, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Pivotal, Inc. - initial API and implementation
 *******************************************************************************/
package org.springframework.ide.eclipse.boot.properties.editor.yaml;

import org.dadacoalition.yedit.editor.YEdit;
import org.dadacoalition.yedit.editor.YEditSourceViewerConfiguration;

public class SpringYamlEditor extends YEdit {

	public SpringYamlEditor() {
		// TODO Auto-generated constructor stub
	}

	@Override
	protected YEditSourceViewerConfiguration createSourceViewerConfiguration() {
		return new SpringYeditSourceViewerConfiguration();
	}

}
