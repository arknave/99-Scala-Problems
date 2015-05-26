package org.p99.scala

object P07 {

  def flatten(list: List[Any]): List[Any] = list match {
    case Nil                     => Nil
    case (head: List[_]) :: tail => flatten(head) ++ flatten(tail)
    case head :: tail            => head :: flatten(tail)
  }

}
