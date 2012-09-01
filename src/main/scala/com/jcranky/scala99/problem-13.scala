package com.jcranky.scala99

/**
 * P13 (**) Run-length encoding of a list (direct solution).
 * Implement the so-called run-length encoding data compression method directly.
 * I.e. don't use other methods you've written (like P09's pack); do all the work directly.
 * 
 * Example:
 * 
 * scala> encodeDirect(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
 * res0: List[(Int, Symbol)] = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))
 */
object Problem13 {
  def encodeDirect[A](list: List[A]): List[(Int, A)] = {
    list.foldLeft(List[(Int, A)]()) { (acc, a) => acc match {
        case head :: tail if head._2 == a => (acc.head._1 + 1, a) :: tail
        case _ => (1, a) :: acc
      }
    } reverse
  }
  
  def encodeDirectPhil[A](ls: List[A]): List[(Int, A)] =
    if (ls.isEmpty) Nil
  else {
    val (packed, next) = ls span { _ == ls.head }
    (packed.length, packed.head) :: encodeDirect(next)
  }
}
