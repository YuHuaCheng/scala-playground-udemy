package lectures.part1basics

object CBNvsCBV extends App {

  def calledByValue(x: Long): Unit = {
    println("by value:" + x)
    println("by value:" + x)
  }

  // => means this parameter will be called by name
  def calledByName(x: => Long): Unit = {
    println("by name:" + x)
    println("by name:" + x)
  }

  // the parameter will be evaluated before the function is called
  calledByValue(System.nanoTime())

  // the parameter will NOT be evaluated until its used => lazy evaluation
  calledByName(System.nanoTime())

  def infinite(): Int = 1 + infinite()
  def printFirst(x: Int, y: => Int): Unit = println(x)

//  printFirst(infinite(), 34)  // this will crash
  printFirst(34, infinite()) // this will pass, since infinite() is not used, won't be evaluated
}
