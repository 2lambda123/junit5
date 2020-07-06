/*
 * Copyright 2015-2020 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v2.0 which
 * accompanies this distribution and is available at
 *
 * https://www.eclipse.org/legal/epl-v20.html
 */

package org.junit.vintage.engine.samples.junit4;

import static org.junit.Assert.fail;

import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(RunnerThatOnlyReportsFailures.class)
public class JUnit4TestCaseWithFailingDescriptionThatIsNotReportedAsFinished {
	@Test
	public void testWithMissingEvents() {
		fail("boom");
	}
}