package lectures.part2oop

object Inheritance extends App {

  // single class inheritance
  class Animal {
    protected def eat = println("num num")
  }

  class Cat extends Animal {
    def crunch = {
      eat
      println("crunch crunch")
    }
  }

  val cat = new Cat
  cat.crunch

  // constructors
  class Person(name: String, age: Int)
  class Adult(name: String, age: Int, idCard: String) extends Person(name, age)

  // overriding
  class Dog extends Animal {
    override def eat = println("bark bark")
  }
}
