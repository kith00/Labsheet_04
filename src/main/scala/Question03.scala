object Question03 {

  def toUpper(text:String): String=text.toUpperCase()
  def toLower(text:String): String=text.toLowerCase()

  def formatNames(name:String)(indexlist:Int*)(func:String=>String): String ={
    if(indexlist.isEmpty){
      return func(name)
    }

    var pattern = ""
    var a=0

    while(a<name.length()){
      if(indexlist.contains(a)) pattern=pattern+func(name.charAt(a).toString)
      else pattern=pattern+name.charAt(a).toString
      a=a+1
    }
    pattern
  }

  def main(args: Array[String]): Unit = {
    println(formatNames("Benny")()(toUpper))
    println(formatNames("Niroshan")(0,1)(toUpper))
    println(formatNames("Saman")()(toLower))
    println(formatNames("Kumara")(0,5)(toUpper))
  }

}
