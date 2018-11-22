package mumblings

object Codewars {
  def accum(inputString: String): String = {
    def toMumbleWord(letter: Char, position: Int) = {
      (letter.toString * position).capitalize
    }

    val mumbleWords =
      inputString
        .toLowerCase
        .toCharArray
        .zipWithIndex.map { case (char: Char, characterIndex: Int) => toMumbleWord(char, characterIndex + 1) }

    mumbleWords.mkString("-")
  }
}