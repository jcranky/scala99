package com.jcranky.scala99

import org.specs2.mutable.Specification

class Problem18Spec extends Specification {
  val original = List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)
  val expected = List('d, 'e, 'f, 'g)
  
  "slicing a list" should {
    "slice correctly" in {
      Problem18.slice(3, 7, original) must_== expected
    }
    
    "slice correctly with the Phil solution" in {
      Problem18.sliceTailRecursive2Phil(3, 7, original) must_== expected
    }
  }
}
