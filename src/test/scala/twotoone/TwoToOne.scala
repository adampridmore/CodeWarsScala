package twotoone

import org.scalatest._

// From:
//https://www.codewars.com/kata/two-to-one/train/scala

class TwoToOne extends FlatSpec with Matchers {
  def longest(s1: String, s2: String): String = {
    (s1 + s2)
      .toCharArray
      .distinct
      .sortBy(x=>x)
      .mkString
  }

  val tests = List(
    (("aretheyhere", "yestheyarehere"), "aehrsty"),
    (("loopingisfunbutdangerous", "lessdangerousthancoding"), "abcdefghilnoprstu"),
    (("inmanylanguages", "theresapairoffunctions"), "acefghilmnoprstuy")
  )

  tests.foreach {
    case ((s1, s2), expected) =>
      s"longest($s1, $s2)" should s"return $expected" in {
        longest(s1, s2) should be (expected)
      }
  }
}