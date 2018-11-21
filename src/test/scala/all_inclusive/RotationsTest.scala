package all_inclusive

import all_inclusive.RotationsTest.testing
import org.scalatest.Assertions._
import org.scalatest._

// https://www.codewars.com/kata/all-inclusive/train/scala
class RotationsTest extends FlatSpec with Matchers{
  it should "pass basic tests a" in {
    var a = List("bsjq", "qbsj", "sjqb", "twZNsslC", "jqbs")
    testing(Rotations.containAllRots("bsjq", a), true)
  }
  it should "pass basic tests b" in {
    var a = List("TzYxlgfnhf", "yqVAuoLjMLy", "BhRXjYA", "YABhRXj", "hRXjYAB", "jYABhRX", "XjYABhR", "ABhRXjY")
    testing(Rotations.containAllRots("XjYABhR", a), false)
  }
  it should "pass basic tests c" in {
    var a = List("hQmSQJA", "QJAhQmS", "QmSQJAh", "yUgUXoQE", "AhQmSQJ", "mSQJAhQ", "SQJAhQm", "JAhQmSQ")
    testing(Rotations.containAllRots("QJAhQmS", a), true)
  }
  it should "pass basic tests d" in {
    var a = List("nVOETcaxdvuk", "shpEts", "hpEtss", "Etsshp", "OuIiQ", "sXrDdPXIaW", "tsshpE", "pEtssh")
    testing(Rotations.containAllRots("Etsshp", a), false)
  }

  it should "rotate string by 0" in {
    Rotations.rotate("ABC", 0) should be ("ABC")
  }

  it should "rotate string by 1" in {
    Rotations.rotate("ABC", 1) should be ("BCA")
  }

  it should "rotate string by 2" in {
    Rotations.rotate("ABC", 2) should be ("CAB")
  }
}

object RotationsTest {
  def testing(act: Boolean, exp: Boolean): Unit = {
    assertResult(exp){act}
  }
}
