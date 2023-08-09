fun main() {
  val WORDS_1 = arrayOf("24/7", "multi-tier", "B-to-B", "dynamic", "pervasive")
  val WORDS_2 = arrayOf("empowered", "leveraged", "aligned", "targeted")
  val WORDS_3 = arrayOf("process", "paradigm", "solution", "portal", "vision")

  val SIZE_1 = WORDS_1.size
  val SIZE_2 = WORDS_2.size
  val SIZE_3 = WORDS_3.size

  val INDEX_1 = (Math.random() * SIZE_1).toInt()
  val INDEX_2 = (Math.random() * SIZE_2).toInt()
  val INDEX_3 = (Math.random() * SIZE_3).toInt()

  val WORD_1 = WORDS_1[INDEX_1]
  val WORD_2 = WORDS_2[INDEX_2]
  val WORD_3 = WORDS_3[INDEX_3]


  val PHRASE = "${WORD_1} ${WORD_2} ${WORD_3}"
  println(PHRASE)
}
