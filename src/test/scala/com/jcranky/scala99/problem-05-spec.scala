package com.jcranky.scala99

import org.specs2.mutable.Specification

class Problem05Spec extends Specification {
  "test reverse lists" should {
    val list = List(1, 1, 2, 3, 5, 8)
    
    "reverse a list with the built-in implementation" in {
      Problem05.reverse(list) must_== List(8, 5, 3, 2, 1, 1)
    }
    
    "reverse a list with pattern matching implementation" in {
      Problem05.reversePatternMatching(list) must_== List(8, 5, 3, 2, 1, 1)
    }
    
    "reverse a list with a manual implementation" in {
      Problem05.manualReverse(list) must_== List(8, 5, 3, 2, 1, 1)
    }
    
    "reverse a list with a functional algorithm" in {
      Problem05.reverseFunctional(list) must_== List(8, 5, 3, 2, 1, 1)
    }
  }
}
