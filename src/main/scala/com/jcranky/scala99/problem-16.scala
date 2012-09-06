package com.jcranky.scala99

/**
 * P16 (**) Drop every Nth element from a list.
 *  Example:
 *  
 *  scala> drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
 *  res0: List[Symbol] = List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k)
 */
object Problem16 {
  def drop[A](n: Int, list: List[A]): List[A] = {
    def remove(ls: List[A]): List[A] =
      ls.splitAt(n) match {
        case (a, Nil) => a
        case (a, b) => a.dropRight(1) ::: remove(b)
      }
    
    remove(list)
  }
  
  def dropFunctional[A](n: Int, ls: List[A]): List[A] = 
    ls.zipWithIndex filter { v => (v._2 + 1) % n != 0 } map { _._1 }
}
