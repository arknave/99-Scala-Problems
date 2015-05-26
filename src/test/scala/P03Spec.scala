package org.p99.scala

import org.scalatest._
import P03._

class P03Spec extends UnitSpec {

  "nth" should "retrieve the nth element in the list" in {
    assertResult(2) { nth(2, List(1, 1, 2, 3, 5, 8)) }
    assertResult(1) { nth(0, List(1, 1, 2, 3, 5, 8)) }
  }

  it should "work on different types" in {
    assertResult('d') { nth(3, List('a', 'b', 'c', 'd', 'e')) }
    assertResult(0.9) { nth(4, List(0.1, 0.3, 0.5, 0.7, 0.9)) }
  }

  it should "throw out of bounds errors" in {
    intercept[ArrayIndexOutOfBoundsException] { nth(0, List()) }
    intercept[ArrayIndexOutOfBoundsException] { nth(4, List(1, 2, 3, 4)) }
  }
}

