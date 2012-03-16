package com.jcranky.scala99

import org.specs2.mutable.Specification

class Problem03Spec extends Specification {
  "test find kth element" should {
    val list = List(1, 1, 2, 3, 5, 8)
    
    "find that 2 is the element 2 with the API implementation" in {
      Problem03.findKthElementAPI(2, list) must_== 2
    }
    
    "find that 2 is the element 2 with a pattern matching implementation" in {
      Problem03.findKthElementPatternMatching(2, list) must_== 2
    }
  }
}
