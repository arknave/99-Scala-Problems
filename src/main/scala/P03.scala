package org.p99.scala

object P03 {

  def standardNth[A](k: Int, list: List[A]): A = {
    list(k)
  }

  def nth[A](k: Int, list: List[A]): A = (k, list) match {
    case (0, h :: _)  => h
    case (k, x :: xs) => nth(k - 1, xs)
    case (_, Nil) => throw new ArrayIndexOutOfBoundsException
  }
}
