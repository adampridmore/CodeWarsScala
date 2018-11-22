
package mumblings

import org.scalatest.FunSpec

// https://www.codewars.com/kata/mumbling/train/scala
class ExampleTests extends FunSpec {
  describe("Codewars.accum") {

    it("should encode single letter A"){
      assertResult ("A") {Codewars.accum("A")}
    }

    it("should encode two letters ab"){
      assertResult ("A-Bb") {Codewars.accum("ab")}
    }

    it("should encode two capital letters AB"){
      assertResult ("A-Bb") {Codewars.accum("aB")}
    }

    it("should work with example tests") {
      assertResult ("Z-Pp-Ggg-Llll-Nnnnn-Rrrrrr-Xxxxxxx-Qqqqqqqq-Eeeeeeeee-Nnnnnnnnnn-Uuuuuuuuuuu") {Codewars.accum("ZpglnRxqenU")}
      assertResult ("N-Yy-Fff-Ffff-Sssss-Gggggg-Eeeeeee-Yyyyyyyy-Yyyyyyyyy-Llllllllll-Bbbbbbbbbbb") {Codewars.accum("NyffsGeyylB")}
      assertResult ("M-Jj-Ttt-Kkkk-Uuuuu-Bbbbbb-Ooooooo-Vvvvvvvv-Qqqqqqqqq-Rrrrrrrrrr-Uuuuuuuuuuu") {Codewars.accum("MjtkuBovqrU")}
      assertResult ("E-Vv-Iii-Dddd-Jjjjj-Uuuuuu-Nnnnnnn-Oooooooo-Kkkkkkkkk-Mmmmmmmmmm-Mmmmmmmmmmm") {Codewars.accum("EvidjUnokmM")}
      assertResult ("H-Bb-Iii-Dddd-Eeeee-Vvvvvv-Bbbbbbb-Xxxxxxxx-Nnnnnnnnn-Cccccccccc-Ccccccccccc") {Codewars.accum("HbideVbxncC")}
    }
  }
}
