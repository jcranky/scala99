package com.jcranky.scala99

import org.specs2.mutable.Specification

class Problem07Spec extends Specification {
  "flatting a list structure" should {
    val listStructure = List(List(1, 1), 2, List(3, List(5, 8)))
    
    "flatten correctly for a recursive flatten call" in {
      Problem07.flatten(listStructure) must_== List(1, 1, 2, 3, 5, 8)
    }
    
    "flatten correctly for Phil's solution" in {
      Problem07.flattenPhil(listStructure) must_== List(1, 1, 2, 3, 5, 8)
    }
  }
}
