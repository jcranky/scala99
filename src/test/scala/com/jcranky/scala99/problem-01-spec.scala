package com.jcranky.scala99

import org.specs2.mutable.Specification

class Problem01Spec extends Specification {
  "test find last element" should {
    val list = List(1, 1, 2, 3, 5, 8)
    
    "find that 8 is the last element when calling 'last'" in {
      Problem01.last(list) must_== 8
    }
    
    "find that 8 is the last element with the built in function" in {
      Problem01.lastBuiltin(list) must_== 8
    }
    
    "find that 8 is the last element when using pattern matching" in {
      Problem01.lastUsingCase(list) must_== 8
    }
  }
}
