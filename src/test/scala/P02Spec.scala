package org.p99.scala

import org.scalatest._
import P02._

class P02Spec extends UnitSpec {
  "penultimate" should "return the last but one element of a list" in {
    assertResult(5) { penultimate(List(1, 1, 2, 3, 5, 8)) }
    assertResult(3) { penultimate(List(1, 1, 3, 5)) }
  }

  it should "work on different types" in {
    assertResult('d') { penultimate(List('a', 'b', 'c', 'd', 'e')) }
    assertResult(0.3) { penultimate(List(0.3, 0.5)) }
  }

  it should "fail on empty or single element lists" in {
    intercept[NoSuchElementException] { penultimate(List()) }
    intercept[NoSuchElementException] { penultimate(List(1)) }
  }
}

