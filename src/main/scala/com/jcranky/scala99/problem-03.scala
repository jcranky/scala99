package com.jcranky.scala99

/**
 * Comments published at: http://jcranky.com/2011/05/01/scala-problem-number-three/
 *
 * P03 (*) Find the Kth element of a list.
 * By convention, the first element in the list is element 0.
 * Example:
 * 
 * scala> nth(2, List(1, 1, 2, 3, 5, 8))
 * res0: Int = 2
 */
object Problem03 {
  def findKthElementAPI[A](n: Int, list: List[A]): A = list(n)
  
  def findKthElementPatternMatching[A](n: Int, list: List[A]): A = list match {
    case x :: tail if n == 0 => x
    case x :: tail => findKthElementPatternMatching(n-1, tail)
    case _ => throw new IllegalStateException("cannot find element n")
  }
}
