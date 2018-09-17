package lectures.part3fp

object WhatsAFunction extends App {

  // purpose: Use functions as first class element (use functions like a plain value)
  // problem: oop world everything is an instance from a class

  val doubler = new MyFunction[Int, Int] {
    override def apply(element: Int): Int = element * 2
  }

  println(doubler(2))

  // function types = Function1[A, B], Function2, ...
  val stringToIntConverter = new (String => Int) {
    override def apply(v1: String): Int = v1.toInt
  }

  println(stringToIntConverter("3") + 4)

  // Function types syntax sugar, Function2[A, B, R] === (A, B) => R

  // ALL SCALA FUNCTIONS ARE OBJECTS (FUNCTIONS TYPES: Function1, Function2, ...)

//  val inputType =
  def transform(x: Int => String): String = ???
}


trait MyFunction[A, B] {
  def apply(element: A): B
}