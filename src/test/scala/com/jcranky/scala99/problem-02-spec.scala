package com.jcranky.scala99

import org.specs2.mutable.Specification

class Problem02Spec extends Specification {
  "test find penultimate element" should {
    val list = List(1, 1, 2, 3, 5, 8)
    
    "find that 5 is the penultimate element when calling the simple 'penultimate' implementation" in {
      Problem02.penultimate(list) must_== 5
    }
    
    "find that 5 is the penultimate element when using the builtin implementation" in {
      Problem02.penultimateBuiltIn(list) must_== 5
    }
    
    "find that 5 is the penultimate element with the pattern matching implementation" in {
      Problem02.penultimateWithPatternMatching(list) must_== 5
    }
    
    "throw exception if there is no penultimate element (pattern matching implementation)" in {
      Problem02.penultimateWithPatternMatching(List(8)) must throwA[NoSuchElementException]
    }
  }
}
