///Example for constructor 


class Person(var firstName : String , var lastName : String) {
  println("constructor begins")
  //private value
  private val HOME = System.getProperty("user.home")
  //variable
  val age =0 
  
  // methods
  def printHome{println(s"home is $HOME")}
  def printfullName{println(this)}
  
  //override to string
  override def toString=s"$firstName is $age years old"
  
  //method calls
  printfullName
  printHome
  
}

abstract class Bird

trait FLying{
  def flymessage:String
  def fly()={flymessage}
}

  
/**
 * @author home_comp
 */
trait Swim {
  def swim()={"i can swim"}
}

class Piegon extends Bird with FLying with Swim{
  val flymessage="i can fly"
}