package com.jcranky.scala99

/**
 * Comments published at: http://jcranky.com/2011/08/21/scala-problem-number-six/
 * 
 * P06 (*) Find out whether a list is a palindrome.
 * Example:
 * 
 * scala> isPalindrome(List(1, 2, 3, 2, 1))
 * res0: Boolean = true
 */
object Problem06 {
  def isPalindromePatternMatching[A](list: List[A]): Boolean = list match {
    case Nil => true
    case head :: Nil => true
    case head :: rest if head == rest.last => isPalindromePatternMatching(rest.dropRight(1))
    case _ => false
  }
  
  def isPalindromePlain[A](list: List[A]): Boolean = {
    if (list.isEmpty || list.size == 1) true
    else if (list.head == list.last) isPalindromePlain(list.slice(1, list.size-1))
    else false
  }
  
  def isPalindromeReverse[A](ls: List[A]): Boolean = ls == ls.reverse
}
