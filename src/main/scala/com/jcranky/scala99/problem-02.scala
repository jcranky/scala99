package com.jcranky.scala99

/**
 * P02 (*) Find the last but one element of a list.
 * Example:
 * 
 * scala> penultimate(List(1, 1, 2, 3, 5, 8))
 * res0: Int = 5
 */
object Problem02 {
  def penultimate[A](list: List[A]): A = list(list.size-2)

  def penultimateBuiltIn[A](list: List[A]): A =
    if (list.size <= 1) throw new NoSuchElementException else list.init.last

  def penultimateWithPatternMatching[A](list: List[A]): A = list match {
    case x :: y :: Nil => x
    case _ :: tail => penultimateWithPatternMatching(tail)
    case _ => throw new NoSuchElementException
  }
}
