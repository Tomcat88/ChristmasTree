package introt.christmasttree

object Colors extends Colors

trait Colors {
  
  implicit def toColored(s: String) = new ColoredString(s)
  
  class ColoredString(s: String) {
    
    import Console._
    import scala.util.Random 
    
    val r = new Random()
    
    val _all = List(blue,red,green,yellow,white,magenta,cyan,s)
    
    def random = r shuffle _all head
    
    def randomBkGreen =if(r.nextFloat < 0.1) bkGreen else s
    
    def black = BLACK + s + RESET
    
    def blue = BLUE + s + RESET
    
    def red = RED + s + RESET
    
    def green = GREEN + s + RESET
    
    def yellow = YELLOW + s + RESET
    
    def white = WHITE + s + RESET
    
    def magenta = MAGENTA + s + RESET
    
    def cyan = CYAN + s + RESET
    
    def bkGreen = GREEN_B+ s + RESET
    
    
    
  }
}

