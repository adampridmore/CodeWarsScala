package DoesMyNumberLookBigInThis

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest._
import flatspec._
import matchers._

import scala.annotation.tailrec

// https://www.codewars.com/kata/5287e858c6b5a9678200083c/train/scala

object Kata {
  def narcissistic(n: Int): Boolean = {
    val str = n.toString
       
    val powSum = str
      .map(chr => Math.pow(chr.asDigit, str.length).toInt)
      .sum
    
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
