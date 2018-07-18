package lectures.part1basics

object ValuesVariablesTypes extends App {
  val x = 10
  val y = x
  println(x)

  val aString = "hello"
  val aBool = false
  val aChar = 'a'
  val aShort: Short = 100
  val aLong: Long = 1000000L
  val aFloat: Float = 2.5f
  val aDouble: Double = 2.0

  var aVariable = 4  // side effects
  aVariable = 10

}
