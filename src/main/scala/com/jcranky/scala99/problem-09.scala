package com.jcranky.scala99

/**
 * P09 (**) Pack consecutive duplicates of list elements into sublists.
 *  If a list contains repeated elements they should be placed in separate sublists.
 *  
 *  Example:
 *  
 *  scala> pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
 *  res0: List[List[Symbol]] = List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e))
 */
object Problem09 {
  def packFoldLeft[A](list: List[A]): List[List[A]] = {
    list.foldLeft(List[List[A]]())((packed, a) => packed match {
        case Nil => List(List(a))
        case head :: tail if head.head == a => (a :: head) :: tail
        case head :: tail => List(a) :: packed
        case _ => packed
      }).reverse
  }
  
  def packRecursive[A](list: List[A]): List[List[A]] = {
    def packer(packed: List[List[A]], current: List[A]): List[List[A]] = current match {
      case Nil => packed
      case head :: tail if packed == Nil => packer(List(List(head)), tail)
      case head :: tail if packed.head.head == head => packer((head :: packed.head) :: packed.tail, tail)
      case head :: tail => packer(List(head) :: packed, tail)
    }
    
    packer(Nil, list).reverse
  }
  
  def packPhil[A](ls: List[A]): List[List[A]] = {
    if (ls.isEmpty) List(List())
    else {
      val (packed, next) = ls span { _ == ls.head }
      if (next == Nil) List(packed)
      else packed :: packPhil(next)
    }
  }
}
