package com.jcranky.scala99

import org.specs2.mutable.Specification

class Problem11Spec extends Specification {
  val original = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
  val expected = List((4,'a), 'b, (2,'c), (2,'a), 'd, (4,'e))

  "encoding modified" should {
    "remove the sublist when it contains only a single element" in {
      Problem11.encodeModified(original) must_== expected
    }
  }
}
