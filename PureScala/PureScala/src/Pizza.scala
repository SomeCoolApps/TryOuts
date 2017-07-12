

class Pizza(var crustSize: Int=Pizza.DEFAULT_CRUST_Size, var crustType: String= Pizza.DEFAULT_CRUST_TYPE) {
  
  //Auxillay one arg construtor 
  def this(crustSize:Int){
    this(crustSize, Pizza.DEFAULT_CRUST_TYPE)
  }
  
  //Auxillay one arg construtor 
//  def this(crustType:String){
//    this(Pizza.DEFAULT_CRUST_Size,crustType)
//  }
  
  //no arg
  def this(){
   
    this(Pizza.DEFAULT_CRUST_Size,Pizza.DEFAULT_CRUST_TYPE)
     println("default executed")
  }
 
  
  override def toString=s"a $crustSize inch pizaa made with $crustType crust" 
  
  println(toString)
  
  override def equals(that: Any) : Boolean ={
    that match {
      case that:Pizza  => this.hashCode() == that.hashCode()
      case _ => false
    }
  }
  
  
  override def hashCode:Int = {
     var len = crustType.length()
     var result = len +crustSize
     return result
   }
}

object Pizza{
  val DEFAULT_CRUST_TYPE="THIN"
  val DEFAULT_CRUST_Size=12
}