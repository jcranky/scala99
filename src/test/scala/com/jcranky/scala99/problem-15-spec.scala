package com.jcranky.scala99

import org.specs2.mutable.Specification

class Problem15Spec extends Specification {
  val original = List('a, 'b, 'c, 'c, 'd)
  val expected = List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd)

  "duplicating a list n times" should {
    "have elements duplicated n times" in {
      Problem15.duplicateNTimes(3, original) must_== expected
    }
  }
}
