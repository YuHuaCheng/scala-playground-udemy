package lectures.part3fp

object HOFsCurries extends App {

  // function that applies a function n times over value x
  // nTimes(f, n, x)
  // nTimes(f, 3, x) = f(f(f(x)))

  def nTimes(f: Int => Int, n: Int, x: Int): Int = {
    if (n <= 0) x
    else {
      nTimes(f, n - 1, f(x))
    }
  }

  val doubler: Int => Int = _ * 2
  println(nTimes(doubler, 1, 2))

  def nTimesBetter(f: Int => Int, n: Int): Int => Int = {
    if (n <= 0) (x: Int) => x
    else {
      x: Int => nTimesBetter(f, n - 1)(f(x))
    }
  }

  // functional programming ftw!
  val double5Times = nTimesBetter(doubler, 5)
  println(double5Times(10))

  // curried function
  val superAdder: Int => Int => Int = x => y => x + y
  val add3 = superAdder(3)
  println(add3(10))

  // functions with multiple parameter lists
}
