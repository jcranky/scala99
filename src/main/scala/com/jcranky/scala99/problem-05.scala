package com.jcranky.scala99

/**
 * P05 (*) Reverse a list.
 * Example:
 * 
 * scala> reverse(List(1, 1, 2, 3, 5, 8))
 * res0: List[Int] = List(8, 5, 3, 2, 1, 1)
 */
object Problem05 {
  def reverse[A](list: List[A]) = list.reverse
  
  def reversePatternMatching[A](list: List[A]): List[A] = list match {
    case head :: tail => reversePatternMatching(tail) :+ head
    case Nil => Nil
  }
  
  def manualReverse[A](list: List[A]): List[A] = {
    var reversedList = List[A]()
    list.foreach(item => reversedList = item +: reversedList)
    
    reversedList
  }
  
  def reverseFunctional[A](ls: List[A]): List[A] = ls.foldLeft(List[A]()) { (r, h) => h :: r }
}
