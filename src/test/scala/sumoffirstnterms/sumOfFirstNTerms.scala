package sumoffirstnterms

import org.scalatest._

// From: https://www.codewars.com/kata/555eded1ad94b00403000071/train/scala
class sumOfFirstNTerms extends FlatSpec with Matchers {

  def seriesSum(n: Int): String = {
    val sum =
      (for (i <- 1.0 to n.toDouble by 1.0) yield i)
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
