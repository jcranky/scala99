package com.jcranky.scala99

import org.specs2.mutable.Specification

class Problem14Spec extends Specification {
  val original = List('a, 'b, 'c, 'c, 'd)
  val expected = List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd)

  "duplicating a list" should {
    "have duplicated elements" in {
      Problem14.duplicate(original) must_== expected
    }
    
    "have duplicated elements for the Phil solution" in {
      Problem14.duplicatePhil(original) must_== expected
    }
  }
}
