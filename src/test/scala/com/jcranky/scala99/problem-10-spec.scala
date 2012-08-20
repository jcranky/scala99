package com.jcranky.scala99

import org.specs2.mutable.Specification

class Problem10Spec extends Specification {
  val original = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
  val expected = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))

  "encoding" should {
    "encode / join list elements and its counting" in {
      Problem10.encode(original) must_== expected
    }
  }
}
