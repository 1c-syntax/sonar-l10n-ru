/*
 * This file is a part of Russian Pack for SonarQube.
 *
 * Copyright © 2016-2018
 * SilverBulleters, LLC
 * mailto:b2b@silverbulleters.org
 *
 * Copyright © 2020-2021
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

import org.junit.jupiter.api.Test;
import org.sonar.api.Plugin.Context;
import org.sonar.api.SonarEdition;
import org.sonar.api.SonarQubeSide;
import org.sonar.api.SonarRuntime;
import org.sonar.api.internal.PluginContextImpl;
import org.sonar.api.internal.SonarRuntimeImpl;
import org.sonar.api.utils.Version;
import org.sonar.test.i18n.I18nMatchers;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class RussianPackPluginTest {

  @Test
  void testDefine() {
    // given
    SonarRuntime sonarRuntime = SonarRuntimeImpl.forSonarQube(
      Version.create(0, 0),
      SonarQubeSide.SERVER,
      SonarEdition.COMMUNITY
    );
    Context context = new PluginContextImpl.Builder()
      .setSonarRuntime(sonarRuntime)
      .build();

    RussianPackPlugin plugin = new RussianPackPlugin();

    // when
    plugin.define(context);

    // then
    assertThat((List<?>) context.getExtensions()).isEmpty();
  }

  @Test
  void bundlesShouldBeUpToDate() {
    I18nMatchers.assertBundlesUpToDate();
  }

}
