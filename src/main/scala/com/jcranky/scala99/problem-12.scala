package com.jcranky.scala99

/**
 * P12 (**) Decode a run-length encoded list.
 * Given a run-length code list generated as specified in problem P10, construct its uncompressed version.
 * 
 * Example:
 * 
 * scala> decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e)))
 * res0: List[Symbol] = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
 */
object Problem12 {
  def decode[A](list: List[(Int, A)]): List[A] = list map {
    case (l, v) => for (i <- 1 to l) yield v
  } flatten
  
  def decodePhil[A](ls: List[(Int, A)]): List[A] =
    ls flatMap { e => List.make(e._1, e._2) }
  
  def decodePhilUpdated[A](ls: List[(Int, A)]): List[A] =
    ls flatMap { e => List.fill(e._1)(e._2) }
}
