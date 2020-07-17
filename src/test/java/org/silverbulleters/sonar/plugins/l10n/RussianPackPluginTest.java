/*
 * This file is a part of Russian Pack for SonarQube.
 *
 * Copyright © 2016-2018
 * SilverBulleters, LLC
 * mailto:b2b@silverbulleters.org
 *
 * Copyright © 2020-2020
 * 1c-syntax and contributors
 *
 * SPDX-License-Identifier: LGPL-3.0-or-later
 *
 * Russian Pack for SonarQube is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3.0 of the License, or (at your option) any later version.
 *
 * Russian Pack for SonarQube is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with Russian Pack for SonarQube.
 */
package org.silverbulleters.sonar.plugins.l10n;

import org.junit.Test;
import org.sonar.api.Plugin.Context;
import org.sonar.api.SonarQubeSide;
import org.sonar.api.SonarRuntime;
import org.sonar.api.internal.SonarRuntimeImpl;
import org.sonar.api.utils.Version;
import org.sonar.test.i18n.I18nMatchers;

import static org.assertj.core.api.Assertions.assertThat;

public class RussianPackPluginTest {

  @Test
  public void testDefine() {
    RussianPackPlugin plugin = new RussianPackPlugin();
    SonarRuntime sonarRuntime = SonarRuntimeImpl.forSonarQube(Version.create(0, 0), SonarQubeSide.SERVER);
    Context context = new Context(sonarRuntime);
    plugin.define(context);
    assertThat(context.getExtensions()).hasSize(0);
  }

  @Test
  public void bundlesShouldBeUpToDate() {
    I18nMatchers.assertBundlesUpToDate();
  }

}
