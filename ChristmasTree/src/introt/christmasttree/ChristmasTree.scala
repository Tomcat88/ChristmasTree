package introt.christmasttree

import Colors._

object ChristmasTree {
  def main(args: Array[String]) {
    while (true) {
      printTree(10)
      Thread.sleep(800)
      print("\033[H\033[2J")
    }
  }
  def printTree(n: Int) {
    def printTree(n: Int, curr: Int) {
      if (n == 0) {
        println(" " * (curr / 2 - 1) + "| |" magenta)
        println(s"\n ${(" "*n)} Merry Christmas!" red)
      } else {
        val s = (for (i <- 1 to curr) yield if (i % 2 == 1) "^" randomBkGreen else "@" random).mkString
        println((" " * (n)) + s)
        printTree(n - 1, curr + 2)
      }

    }
    println((" " * (n)) + "*" yellow)
    println((" " * (n)) + "|" yellow)
    printTree(n,1)
  }
}