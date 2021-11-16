package GetTheIntegersBetweenTwoNumbers

import org.scalatest.wordspec.AnyWordSpec
import org.scalatest._
import flatspec._
import matchers._

import org.scalatest.funsuite.AnyFunSuite
import scala.language.postfixOps
import scala.annotation.tailrec

// https://www.codewars.com/kata/57a049e253ba33ac5e000212/train/scala

object Kata {
  def !(n: Int): BigInt = {
    
    @tailrec
    def fact(acc: BigInt, i : BigInt) : BigInt = {
      i match {
        case x if x <= BigInt(1) => acc
        case x => fact(acc * x, x - BigInt(1))
      }
    }
    fact(BigInt(1), n)
  }
}

class KataTest extends AnyFunSuite {

  test("Samples") {
    assert((0!) === 1)
    assert((1!) === 1)
    assert((2!) === 2)
    assert((3!) === 6)
    assert((4!) === 24)
    assert((5!) === 120)
    assert((6!) === 720)
    assert((7!) === 5040)
  }

  implicit class IntExtension(n: Int) {
    def !(): BigInt = Kata.!(n)
  }
}
