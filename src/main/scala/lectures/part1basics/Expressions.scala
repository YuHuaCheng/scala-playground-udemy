package lectures.part1basics

object Expressions extends App {
  val x = 1 + 2

  println(x)
  println(!(1 == 2))

  val aConditionVal = if (true) 10 else 5
  println(aConditionVal)

  val aCodeBlock = { // code block returns values in the last line
    val x = 10
    val y = 5

    if( x == y ) "hey" else "foo"
  }

  println(aCodeBlock)
}
