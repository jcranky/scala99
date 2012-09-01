package com.jcranky.scala99

/**
 * P14 (*) Duplicate the elements of a list.
 * Example:
 * 
 * scala> duplicate(List('a, 'b, 'c, 'c, 'd))
 * res0: List[Symbol] = List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd)
 */
object Problem14 {
  def duplicate[A](list: List[A]): List[A] = list.foldLeft(List[A]()) { (l, a) => l :+ a :+ a}
  
  def duplicatePhil[A](ls: List[A]): List[A] = ls flatMap { e => List(e, e) }
}
