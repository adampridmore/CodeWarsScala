package Unique_In_Order

import org.scalatest._
import flatspec._
import matchers._
import org.scalatest.funsuite.AnyFunSuite
import scala.collection.immutable.WrappedString

// https://www.codewars.com/kata/54e6533c92449cc251001667/train/scala

object Kata {
  def uniqueInOrder[T](xs: Iterable[T]): Seq[T] = {

    def process[T](xs: Seq[T]) : Seq[T] = {
      xs match {
        case Nil => Seq.empty
        case fst :: snd :: tail if fst == snd => {
          process(snd +: tail)
        }
        case head :: tail => {
          head +: process(tail)
        }
      } 
    }
    
    process(xs.toList) 
  }  
}

class UniqueInOrder extends AnyFunSuite with should.Matchers {
  test("Samples") {
    assert(Kata.uniqueInOrder("AAAABBBCCDAABBB")  === Seq('A', 'B', 'C', 'D', 'A', 'B'))
    assert(Kata.uniqueInOrder("ABBCcAD")          === Seq('A', 'B', 'C', 'c', 'A', 'D'))
    assert(Kata.uniqueInOrder(Seq(1, 2, 2, 3, 3)) === Seq(1, 2, 3))
  }
}
