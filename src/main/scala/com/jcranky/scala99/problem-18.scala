package com.jcranky.scala99

/**
 * P18 (**) Extract a slice from a list.
 *  Given two indices, I and K, the slice is the list containing the elements from and
 *  including the Ith element up to but not including the Kth element of the original list. Start counting the elements with 0.
 * 
 *  Example:
 *  
 *  scala> slice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
 *  res0: List[Symbol] = List('d, 'e, 'f, 'g)
 */
object Problem18 {
  def slice[A](i: Int, k: Int, list: List[A]) = 
    list.zipWithIndex.filter(e => e._2 >= i && e._2 < k).map(_._1)
  
  def sliceTailRecursive2Phil[A](start: Int, end: Int, ls: List[A]): List[A] = {
    def sliceR(count: Int, curList: List[A], result: List[A]): List[A] = {
      if (curList.isEmpty || count >= end) result.reverse
      else sliceR(count + 1, curList.tail,
                  if (count >= start) curList.head :: result
                  else result)
    }
    sliceR(0, ls, Nil)
  }
}
