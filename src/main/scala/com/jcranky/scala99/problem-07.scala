package com.jcranky.scala99

/**
 * Comments published at: ??
 * 
 * P07 (**) Flatten a nested list structure.
 *   Example:
 *
 *   scala> flatten(List(List(1, 1), 2, List(3, List(5, 8))))
 *   res0: List[Any] = List(1, 1, 2, 3, 5, 8)
 */
object Problem07 {
  def flatten(listStructure: List[Any]): List[Int] = {
    def getInts(a: Any): List[Int] = a match {
      case x: Int => List(x)  // wrap the element in a list to make the flatten call work
      case head :: tail => getInts(head) ++ tail.map(getInts).flatten
      case other => throw new IllegalArgumentException("illegal element found: " + other)
    }
    
    listStructure.map(getInts).flatten
  }
}
