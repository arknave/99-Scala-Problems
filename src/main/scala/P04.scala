package org.p99.scala

object P04 {

  def standardLength[A](list: List[A]): Int = list.length

  def length[A](list: List[A]): Int = list match {
    case Nil => 0
    case _ :: xs => 1 + length(xs)
  }

}
