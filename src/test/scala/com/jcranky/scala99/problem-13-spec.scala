package com.jcranky.scala99

import org.specs2.mutable.Specification

class Problem13Spec extends Specification {
  val original = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
  val expected = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))

  "run-length encoding directly a list" should {
    "do the proper enconding with foldLeft" in {
      Problem13.encodeDirect(original) must_== expected
    }
    
    "do the proper enconding with Phil's solution" in {
      Problem13.encodeDirectPhil(original) must_== expected
    }
  }
}
