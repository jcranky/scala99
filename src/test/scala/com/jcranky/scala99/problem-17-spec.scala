package com.jcranky.scala99

import org.specs2.mutable.Specification

class Problem17Spec extends Specification {
  val original = List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)
  val expected = (List('a, 'b, 'c),List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
  
  "splitting a list" should {
    "split the list at the proper position with the API" in {
      Problem17.splitAPI(3, original) must_== expected
    }
    
    "split the list at the proper position" in {
      Problem17.split(3, original) must_== expected
    }
  }
}
