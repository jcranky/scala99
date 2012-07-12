package com.jcranky.scala99

import scala.collection.mutable.ListBuffer

/**
 * P08 (**) Eliminate consecutive duplicates of list elements.
 *
 *  If a list contains repeated elements they should be replaced with a single copy of the element.
 *  The order of the elements should not be changed.
 * 
 *  Example:
 * 
 *  scala> compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
 *  res0: List[Symbol] = List('a, 'b, 'c, 'a, 'd, 'e)
 */
object Problem08 {
  def compressFoldAndPatternMatch(list: List[Symbol]): List[Symbol] = {
    list.foldLeft(new ListBuffer[Symbol])((buf, c) => {
        buf.lastOption match {
          case Some(last) if last == c => buf
          case Some(last) => buf += c
          case None => buf += c
        }
      }
    ).toList
  }
  
  // Phil Gold's solutions:
  
  // Standard recursive.
  def compressRecursive[A](ls: List[A]): List[A] = ls match {
    case Nil       => Nil
    case h :: tail => h :: compressRecursive(tail.dropWhile(_ == h))
  }

  // Tail recursive.
  def compressTailRecursive[A](ls: List[A]): List[A] = {
    def compressR(result: List[A], curList: List[A]): List[A] = curList match {
      case h :: tail => compressR(h :: result, tail.dropWhile(_ == h))
      case Nil       => result.reverse
    }
    compressR(Nil, ls)
  }

  // Functional.
  def compressFunctional[A](ls: List[A]): List[A] =
    ls.foldRight(List[A]()) { (h, r) =>
      if (r.isEmpty || r.head != h) h :: r
      else r
    }
}
