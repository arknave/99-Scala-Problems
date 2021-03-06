package org.p99.scala

import java.util.NoSuchElementException

// Collection of methods which return the last elmeent of a list
object P01 {

  // Go with the library definition
  def standardLast[A](list: List[A]) = list.last

  // But write others in order to learn!
  def lastIterative[A](list: List[A]) = {
    if (list.isEmpty) throw new NoSuchElementException
    list(list.length - 1)
  }

  // Write in multiple paradigms
  def last[A](list: List[A]): A = list match {
    case l :: Nil => l
    case _ :: xs     => last(xs)
    case _           => throw new NoSuchElementException
  }
}
