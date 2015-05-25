package org.p99.scala

import java.util.NoSuchElementException

object P01 {

  // Go with the library definition
  def last[A](list: List[A]) = list.last

  // But write others in order to learn!
  def lastIterative[A](list: List[A]) = {
    if (list.isEmpty) throw new NoSuchElementException
    list(list.length - 1)
  }

  // Write in multiple paradigms
  def lastRecursive[A](list: List[A]): A = list match {
    case last :: Nil => last
    case _ :: xs     => lastRecursive(xs)
    case _           => throw new NoSuchElementException
  }
}
