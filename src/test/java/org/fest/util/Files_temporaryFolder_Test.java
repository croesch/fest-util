/*
 * Created on Sep 23, 2006
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the
 * License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS"
 * BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 * 
 * Copyright @2006-2011 the original author or authors.
 */
package org.fest.util;

import static java.io.File.separator;
import static org.fest.util.Strings.append;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.File;

import org.junit.Test;

/**
 * Tests for <code>{@link Files#temporaryFolder()}</code>.
 * 
 * @author Alex Ruiz
 * @author Yvonne Wang
 */
public class Files_temporaryFolder_Test extends Files_TestCase {

  @Test
  public void should_find_temporary_folder() {
    File temporaryFolder = Files.temporaryFolder();
    assertTrue(temporaryFolder.isDirectory());
    String a = append(separator).to(temporaryFolder.getAbsolutePath());
    String e = append(separator).to(systemTemporaryFolder());
    assertEquals(e, a);
  }
}
