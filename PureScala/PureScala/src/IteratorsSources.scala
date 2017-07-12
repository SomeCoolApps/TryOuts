

object IteratorsSources  extends App  {
  
  case class TempData(day:Int,year:Int,precp:Double)
  
  def parseLine(line:String):TempData = {
    val p = line.split(",").map(_.trim)
   
    return TempData(p(0).toInt,p(2).toInt,p(3).toDouble)   
    
  }
  
  
//  import java.io._
  println(new java.io.File(".").getAbsolutePath())
  val sources= io.Source.fromFile("db1013.global.csv")
 val reader =  sources.getLines();
  
  reader.next()

  reader.next()
 
  println(parseLine(reader.next()))
  
  
}