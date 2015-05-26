package org.p99.scala

object P06 {

  // A palindrome is a sequence which is the same read forwards and backwards.
  def isPalindrome[A](list: List[A]): Boolean = list match {
    case Nil => true
    case x :: Nil => true
    case x :: xs => (x == xs.last) && isPalindrome(xs.init)
    case _ => false
  }

  def alternateIsPalindrome[A](list: List[A]): Boolean = 
    list == P05.reverse(list)

}
