package mumblings

// https://www.codewars.com/kata/mumbling/train/scala
object Codewars {
  def accum(inputString: String): String = {
    def toMumbleWord(letter: Char, position: Int) = {
      (letter.toString * position).capitalize
    }

    inputString
      .toLowerCase
      .toCharArray
      .zipWithIndex.map { case (char: Char, characterIndex: Int) => toMumbleWord(char, characterIndex + 1) }
      .mkString("-")
  }
}