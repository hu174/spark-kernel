/*
 * Copyright 2014 IBM Corp.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.ibm.spark.magic.builtin

import org.scalatest.mock.MockitoSugar
import org.scalatest.{Matchers, FunSpec}

class BuiltinLoaderSpec extends FunSpec with Matchers with MockitoSugar {
  describe("BuiltinLoader") {
    describe("#getClasses") {
      it("should return classes in a package") {
        val pkg = this.getClass.getPackage.getName
        val classes = new BuiltinLoader().getClasses(pkg)
        classes.size shouldNot be(0)
      }
    }
  }
}
