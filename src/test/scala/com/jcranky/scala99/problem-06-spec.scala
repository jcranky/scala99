package com.jcranky.scala99

import org.specs2.mutable.Specification

class Problem06Spec extends Specification {
  "testing if a list is a palindrome" should {
    val list = List(1, 2, 3, 2, 1)
    val falseList = List(1, 2, 3, 2, 4)
    
    "return true with the pattern matching implementation" in {
      Problem06.isPalindromePatternMatching(list) must beTrue
    }
    
    "return false with the pattern matching implementation" in {
      Problem06.isPalindromePatternMatching(falseList) must beFalse
    }
    
    "return true with the plain implementation" in {
      Problem06.isPalindromePlain(list) must beTrue
    }
    
    "return false with the plain implementation" in {
      Problem06.isPalindromePlain(falseList) must beFalse
    }
    
    "return true with the reverse implementation" in {
      Problem06.isPalindromeReverse(list) must beTrue
    }
    
    "return false with the reverse implementation" in {
      Problem06.isPalindromeReverse(falseList) must beFalse
    }
  }
}
