package org.p99.scala

import org.scalatest._
import P06.isPalindrome

class P06Spec extends UnitSpec {

  "isPalindrome" should "detect if a list is a palindrome" in {
    assertResult(true) { isPalindrome(List(1, 2, 3, 2, 1)) }
    assertResult(false) { isPalindrome(List(1, 2, 3, 4, 2, 1)) }
  }

  it should "work for multiple types" in {
    assertResult(false) { isPalindrome(List('a', 'b', 'c', 'd')) }
    assertResult(true) { isPalindrome(List('a', 'b', 'c', 'b', 'a')) }
  }

  it should "work for empty and singleton lists" in {
    assertResult(true) { isPalindrome(List()) }
    assertResult(true) { isPalindrome(List('a')) }
  }

}

