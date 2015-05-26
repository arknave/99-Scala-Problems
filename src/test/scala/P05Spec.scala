package org.p99.scala

import org.scalatest._
import P05.reverse

class P05Spec extends UnitSpec {

  "reverse" should "reverse a list" in {
    assertResult(List(8, 5, 3, 2, 1, 1)) { reverse(List(1, 1, 2, 3, 5, 8)) }
    assertResult(List(1, 2, 3, 2, 3, 1)) { reverse(List(1, 3, 2, 3, 2, 1)) }
  }

  it should "work on lists of different types" in {
    assertResult(List('e', 'd', 'c', 'b', 'a')) { 
      reverse(List('a', 'b', 'c', 'd', 'e')) 
    }

    assertResult(List(0.7, 0.5, 0.3)) { reverse(List(0.3, 0.5, 0.7)) }
  }

  it should "work on empty and singleton lists" in {
    assertResult(List()) { reverse(List()) }
    assertResult(List("string")) { reverse(List("string")) }
  }

}

