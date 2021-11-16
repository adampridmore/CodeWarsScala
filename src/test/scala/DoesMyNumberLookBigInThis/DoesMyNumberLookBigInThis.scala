package DoesMyNumberLookBigInThis

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest._
import flatspec._
import matchers._

import scala.annotation.tailrec

// https://www.codewars.com/kata/5287e858c6b5a9678200083c/train/scala

object Kata {
  def narcissistic(n: Int): Boolean = {
    
    val digits = n.toString.map(_.toString.toInt)
            
    val powSum = digits.fold(0)((acc, digit) => acc + (Math.pow(digit, digits.length)).toInt)
    
    powSum == n
  }
}

class KataTest extends AnyFunSuite {

  test("Samples") {
    assert(Kata.narcissistic(7))
    assert(Kata.narcissistic(371))
    assert(!Kata.narcissistic(122))
    assert(!Kata.narcissistic(4887))
  }
}
