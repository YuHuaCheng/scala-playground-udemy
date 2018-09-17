package lectures.part2oop

object MethodNotations extends App {

  class Person(val name: String, favoriteMovie: String) {
    def likes(movie: String): Boolean = movie == this.favoriteMovie
    def hangOutWith(person: Person): String = s"${this.name} is hanging out with ${person.name}"

    def +(person: Person): String = hangOutWith(person) // super cool that we can replace math operator
    def unary_! : String = s"${this.name} the hell?"

    def apply() : String = s"Hi my name is $name"
  }

  val mary = new Person("Mary", "Inception")
  println(mary.likes("Inception"))
  println(mary likes "Inception") // infix notation or operator notation

  // "operator" in Scala
  val tom = new Person("Tom", "Fight Club")
  println(mary hangOutWith tom) // here, hangOutWith acts like an operator
  println(mary + tom)

  // prefix notation
  val x = -1 // equivalent with 1.unary_-
  val y = 1.unary_-

  // unary_ prefix only works with - + ~ !
  println(!tom)

  println(mary.apply())
  println(mary()) // same as above
}
