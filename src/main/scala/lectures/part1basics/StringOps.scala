package lectures.part1basics

object StringOps extends App {

  var str: String = "Hi I am learning."

  println(str.charAt(3))
  println(str.substring(3))
  println(str.split(" ").toList)
  println('a' +: "2" :+ 'c')

  // String interpolator

  // S-interpolator
  val name = "David"
  val age = 12
  val greeting = s"Hello my name is $name, $age years old"
  println(greeting)

  // F-interpolator (format string)
  val speed = 1.2f
  val myth = f"$name can eat $speed%2.2f burgers per min"
  println(myth)

  // raw-interpolator
  println(raw"This is \n newline")
}
