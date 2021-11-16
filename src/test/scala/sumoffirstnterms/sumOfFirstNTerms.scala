package sumoffirstnterms

import org.scalatest._
import flatspec._
import matchers._
import org.scalatest.flatspec.AnyFlatSpec

import scala.BigDecimal._
import scala.collection.immutable.Range.BigDecimal._

// From: https://www.codewars.com/kata/555eded1ad94b00403000071/train/scala
class sumOfFirstNTerms extends AnyFlatSpec with should.Matchers {

  def seriesSum(n: Int): String = {
    val sum =
      (for (i <- inclusive(1.0, valueOf(n), 1.0)) yield i)
        .map(x => 1.0 + (x - 1.0) * 3.0)
        .map(x => 1 / x)
        .sum

    f"$sum%.2f"
  }

  val tests = List(
    (1, "1.00"),
    (2, "1.25"),
    (3, "1.39")
  )
  tests.foreach {
    case (input, expected) =>
      s"seriesSum($input)" should s"return $expected" in {
        seriesSum(input) should be(expected)
      }
  }
}
