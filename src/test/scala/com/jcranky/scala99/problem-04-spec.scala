package com.jcranky.scala99

import org.specs2.mutable.Specification

class Problem04Spec extends Specification {
  "test find last element" should {
    val list = List(1, 1, 2, 3, 5, 8)
    
    "find out that size is 6 with the built-in implementation" in {
      Problem04.length(list) must_== 6
    }
    
    "find out that size is 6 with the pattern matching implementation" in {
      Problem04.lengthPatternMatching(list) must_== 6
    }
    
    "find out that size is 6 with the fold left implementation" in {
      Problem04.lengthFoldLeft(list) must_== 6
    }
  }
}
