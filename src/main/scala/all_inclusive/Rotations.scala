package all_inclusive

object Rotations {

  def rotate(str: String, howManyToRotate: Int): String = {
    str.substring(howManyToRotate,str.length) + str.substring(0, howManyToRotate)
  }

  def containAllRots(strng: String, arr: List[String]): java.lang.Boolean = {

    (for (i <- 0 until strng.length) yield rotate(strng, i))
      .forall(rotation => arr.contains(rotation))
  }
}
