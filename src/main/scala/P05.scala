package org.p99.scala

object P05 {

  def standardReverse[A](list: List[A]): List[A] = list.reverse

  def reverse[A](list: List[A]): List[A] = list match {
    case List() => List()
    case x :: xs => reverse(xs) :+ x
  }

}
