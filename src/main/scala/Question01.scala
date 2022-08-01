object Question01 {
  def interest(deposit:Float) : Float = deposit match{
    case deposit if deposit <= 20000.00 => deposit*0.02f
    case deposit if deposit <= 200000.00 => deposit*0.04f
    case deposit if deposit <= 2000000.00 => deposit*0.35f
    case deposit if deposit >  2000000.00 => deposit*0.65f
  }

  def main(args: Array[String]): Unit = {
    println(interest(15000))
    println(interest(150000))
    println(interest(1500000))
    println(interest(15000000))

  }

}
