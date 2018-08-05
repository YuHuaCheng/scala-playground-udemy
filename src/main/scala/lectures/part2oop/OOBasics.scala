package lectures.part2oop

object OOBasics extends App {
  val person = new Person("David", 10)

  println(person.age)
  person.greeting("Festa")
}

// class parameters are not fields, unless it's prefixed with 'val'

class Person(name: String, val age: Int = 0) {
  // method
  def greeting(name: String): Unit = println(s"${this.name} says hi to $name")

  // overloading
  def greeting(): Unit = println(s"$name")

//  // multiple constructor ( not desired, only for putting default param, which can be done in constructor itself)
//  def this(name: String) = this(name, 0)

}
