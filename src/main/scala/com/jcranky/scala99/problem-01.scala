package com.jcranky.scala99

/**
 * P01 (*) Find the last element of a list.
 * Example:
 * 
 * scala> last(List(1, 1, 2, 3, 5, 8))
 * res0: Int = 8
 */
object Problem01 {
  def last[A](list: List[A]): A = list(list.size-1)

  def lastBuiltin[A](list: List[A]): A = list.last

  def lastUsingCase[A](list: List[A]): A = list match {
    case x :: Nil => x
    case x :: list => lastUsingCase(list)
    case Nil => throw new IllegalArgumentException("cannot find the last element of an empty list")
  }
}
