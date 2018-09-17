package lectures.part1basics

import scala.annotation.tailrec

object Recursions extends App {

  def factorialStackOverflow(n: Int): BigInt = {
    if(n == 1) 1
    else {
      val res = n * factorialStackOverflow(n - 1) // a new stack frame will be used, which causes stack overflow
      println("current result is " + res)
      res
    }
  }
//  println(factorialStackOverflow(5000))

  def sameStackFactorial(n: Int): BigInt = {
    @tailrec // will complain if the recursive expression is not at the last line (tail recursion)
    def factorialHelper(n: Int, accumulator: BigInt): BigInt = {
      if(n == 1) accumulator
      else factorialHelper(n - 1, accumulator * n) // (Tail Recursion) no need to save intermediate result, so it's on the same stack
    }
    factorialHelper(n, 1)
  }

  println(sameStackFactorial(5000))

  // When loops, use tail recursion
}
