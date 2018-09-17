package lectures.part3fp

object AnonymousFunctions extends App {

  // anonymous function (LAMBDA)
  val doubler: Int => Int = x => x * 2
  def doublerMethod(x: Int): Int = x * 2

  // multi params lambda
  val adder: (Int, Int) => Int = (x, y) => x + y

  // no params
  val justDoSomething: () => Int = () => 3

  println(justDoSomething)
  println(justDoSomething())

  // more syntax sugar
  val niceIncrementer: Int => Int = _ + 1 // equivalent to x => x + 1
  val niceAdder: (Int, Int) => Int = _ + _ // equivalent to (x, y) => x + y
}
