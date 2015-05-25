package org.p99.scala

import java.util.NoSuchElementException
object P02 {

  def penultimate[A](list: List[A]): A = list match {
    case a :: b :: Nil => a
    case _ :: xs       => penultimate(xs)
    case _             => throw new NoSuchElementException
  }

  def penultimateIterative[A](list: List[A]): A = {
    if (list.length < 2) throw new NoSuchElementException
    list(list.length - 2)
  }
}
