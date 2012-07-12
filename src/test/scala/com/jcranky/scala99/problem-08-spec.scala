package com.jcranky.scala99

import org.specs2.mutable.Specification

class Problem08Spec extends Specification {
  "the duplicate eliminator" should {
    val original = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    val compressed = List('a, 'b, 'c, 'a, 'd, 'e)
    
    "remove all consecutive duplicates" in {
      Problem08.compressFoldAndPatternMatch(original) must_== compressed
    }
  }
}
