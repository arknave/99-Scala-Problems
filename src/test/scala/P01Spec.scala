package org.p99.scala

import org.scalatest._
import P01._

class P01Spec extends UnitSpec {
  "last" should "return the last element" in {
    assertResult(8) { last(List(1, 1, 2, 3, 5, 8)) }
    assertResult(5) { last(List(1, 1, 2, 3, 5)) }
  }

  it should "also work on all types" in {
    assertResult('d') { last(List('a', 'b', 'c', 'd')) }
    assertResult('a') { last(List('a')) }
  }

  it should "fail on empty lists" in {
    intercept[NoSuchElementException] {
      last(List())
    }
  }
}

