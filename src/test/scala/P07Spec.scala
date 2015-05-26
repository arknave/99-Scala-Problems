package org.p99.scala

import org.scalatest._
import P07.flatten

class P07Spec extends UnitSpec {

  "flatten" should "flatten a nested list structure" in {
    assertResult(List(1, 1, 2, 3, 5, 8)) {
      flatten(List(List(1, 1), 2, List(3, List(5, 8))))
    }
    
    assertResult(List(1, 2, 3, 4)) { 
      flatten(List(1, List(2, List(3, List(4)))))
    }

    assertResult(List("x")) { flatten(List(List(List(List(List(List("x"))))))) }
  }

  it should "work on singleton and empty lists" in {
    assertResult(List()) { flatten(List()) }
    assertResult(List('a')) { flatten(List('a')) }
  }

}

