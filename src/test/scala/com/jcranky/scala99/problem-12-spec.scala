package com.jcranky.scala99

import org.specs2.mutable.Specification

class Problem12Spec extends Specification {
  val original = List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))
  val expected = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)

  "decoding a run-length list" should {
    "properly decode" in {
      Problem12.decode(original) must_== expected
    }
    
    "properly decode for the Phil solution" in {
      Problem12.decodePhil(original) must_== expected
    }
    
    "properly decode for the Phil (updated to scala 2.9.2) solution" in {
      Problem12.decodePhilUpdated(original) must_== expected
    }
  }
}
