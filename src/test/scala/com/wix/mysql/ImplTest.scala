package com.wix.mysql

import org.specs2.mutable.SpecWithJUnit

class ImplTest extends SpecWithJUnit {

  "sub" should {
    "add numbers" in {
      new Impl().sub(1, 2) mustEqual 3
    }
  }

}
