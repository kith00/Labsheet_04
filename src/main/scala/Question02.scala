import scala.io.StdIn.readInt

object Question02 {

  def PatternMatching(num:Int):Unit =num match{
    case num if num <=0 => println("Negative/Zero")
    case num if num % 2 == 0 => println("Even Number")
    case _ => println("Odd Number")
  }

  def main(args: Array[String]): Unit = {
    print("Enter Your Number : ")
    val num = readInt()
    PatternMatching(num)
  }

}
