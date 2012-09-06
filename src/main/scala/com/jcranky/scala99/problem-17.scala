package com.jcranky.scala99

/**
 * P17 (*) Split a list into two parts.
 * The length of the first part is given. Use a Tuple for your result.
 * 
 * Example:
 * 
 * scala> split(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
 * res0: (List[Symbol], List[Symbol]) = (List('a, 'b, 'c),List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
 */
object Problem17 {
  def splitAPI[A](x: Int, list: List[A]): (List[A], List[A]) = list.splitAt(x)
  
  def split[A](x: Int, list: List[A]): (List[A], List[A]) = {
    def balance(pre: List[A], post: List[A], count: Int): (List[A], List[A]) = 
      count match {
        case c if c > x => (pre, post)
        case _ => balance(pre :+ post.head, post.drop(1), count + 1)
      }
    
    balance(Nil, list, 1)
  }
}
