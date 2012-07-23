package com.jcranky.scala99

import org.specs2.mutable.Specification

class Problem09Spec extends Specification {
  val original = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
  val expected = List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e))
  
  "the packer" should {
    "pack correctly all the elements with fold left" in {
      Problem09.packFoldLeft(original) must containAllOf(expected).only.inOrder
    }
    
    "pack correctly all the elements with recursive call" in {
      Problem09.packRecursive(original) must containAllOf(expected).only.inOrder
    }
    
    "pack correctly all the elements with Phil's solution" in {
      Problem09.packPhil(original) must containAllOf(expected).only.inOrder
    }
  }
}
