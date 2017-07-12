
object FunctionAsVariable extends App {
  val double = (i : Int) => i*2
  
  val list = List.range(1, 10)
  list.map { double }
  // here double function is passed as a variable to map 
  
  println(list.map { double })
  
  
  val f :(Int) => Boolean = i => (i%2 ==0)
  // this method takes an int and return boolean 
  
  
  //implicit way to declare the return of function
  val add = (x: Int,y: Int) =>  x+ y  
  
  //explicit way to declare the return 
  val add1: (Int, Int)=> Int = (x,y) => x+y
  
  
  
  

}