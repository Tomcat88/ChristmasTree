package introt.christmasttree

import Colors._
import scala.annotation.tailrec

object ChristmasTree {
  def main(args: Array[String]) {
	val n = args.headOption match{
	  case Some(x) if x.toInt > 1 => x.toInt
	  case None => 10
	}
	print("\033[H\033[2J")
    while (true) {
      printTree(n)
      Thread.sleep(900)
      print("\033[H\033[2J")
    }
  }
  def printTree(n: Int) {
    @tailrec def printTree(n: Int, curr: Int) {
      if (n == 0) {
        println(" " * (curr / 2 - 1) + "| |" magenta)
        println(s"\n ${(" "*n)} Merry Christmas!" red)
      } else {
        val s = (for (i <- 1 to curr) yield if (i % 2 == 1) "^" randomBkGreen else "@" random).mkString
        println((" " * (n)) + s)
        println
        printTree(n - 1, curr + 2)
      }

    }
    println((" " * (n)) + "*" yellow)
    println((" " * (n)) + "|" yellow)
    printTree(n,1)
  }
}