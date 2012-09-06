package com.jcranky.scala99

import org.specs2.mutable.Specification

class Problem16Spec extends Specification {
  val original = List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)
  val expected = List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k)
  
  "dropping elements from a list" should {
    "have every nth element dropped" in {
      Problem16.drop(3, original) must_== expected
    }
    
    "have every nth element dropped for the Phil solution" in {
      Problem16.dropFunctional(3, original) must_== expected
    }
  }
}
