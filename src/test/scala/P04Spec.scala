package org.p99.scala

import org.scalatest._
import P04.length

class P04Spec extends UnitSpec {

  "length" should "return the length of a list" in {
    assertResult(6) { length(List(1, 1, 2, 3, 5, 8)) }
    assertResult(4) { length(List(1, 2, 3, 8)) }
  }

  it should "work on different types of list" in {
    assertResult(5) { length(List('a', 'b', 'c', 'd', 'e')) }
    assertResult(3) { length(List(0.3, 0.5, 0.7)) }
  }

  it should "work on empty lists" in {
    assertResult(0) { length(List()) }
  }
}

