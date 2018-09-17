package lectures.part2oop

object AbstractDataTypes extends App {

  // abstract
  abstract class Animal {
    val creatureType: String
    def eat: Unit
  }

//  class Dog extends Animal {
//    val creatureType: String = _
//    def eat: Unit = ???
//  }

  // traits
  trait Carnivore {
    def eat(animal: Animal): Unit
  }

  trait ColdBlooded

  class Crocodile extends Animal with Carnivore with ColdBlooded {
    val creatureType: String = "croc"

    def eat: Unit = println("numnum")

    def eat(animal: Animal): Unit = println("croc corc")
  }

  // traits vs abstract class
  // 1. traits cannot have constructor params
  // 2. multi traits may be inherited by the same class
  // 3. trait = behavior ; abstract = a "thing" (design paradigm choice)
}
