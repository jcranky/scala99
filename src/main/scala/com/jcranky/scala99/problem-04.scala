package com.jcranky.scala99

/**
 * Comments published at: http://jcranky.com/2011/05/20/scala-problem-number-four/
 *
 * P04 (*) Find the number of elements of a list.
 * Example:
 * 
 * scala> length(List(1, 1, 2, 3, 5, 8))
 * res0: Int = 6
 */
object Problem04 {
  def length[A](list: List[A]) = list.size

  def count[A](acc: Int, remaining: List[A]): Int = remaining match {
    case Nil => acc
    case x :: tail => count(acc + 1, tail)
  }
  def lengthPatternMatching[A](list: List[A]) = count(0, list)
  
  def lengthFoldLeft[A](list: List[A]) = 
    list.foldLeft(0) { (count, item) => count + 1 }
}
