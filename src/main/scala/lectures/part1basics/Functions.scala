package lectures.part1basics

object Functions extends App {

  def aFunction(a: String, b: Int): String = {
    a + " " + b
  }
  println(aFunction("foo", 10))

  def aParamLessFunc(): Int = 42
  println(aParamLessFunc())

  def aRepeatedFunc(a: String, n: Int): String = {
    if(n == 1) a
    else a + aRepeatedFunc(a, n - 1)
  }

  println(aRepeatedFunc("foo", 10))
}
