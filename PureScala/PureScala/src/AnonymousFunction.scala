

object AnonymousFunction extends App {
  val x  = List.range(1, 10)
  var evens  = x.filter ( (i:Int) => i%2 ==0) 
  println(evens)
  
  
  //simple form of using anonymous functions 
  evens  = x.filter ( (i) => i%2 ==0) 
  
  //or simplest   
  evens  = x.filter ( _%2 ==0) 
  
  
  //similar anonymous function
  x.foreach ((i : Int) => println(i) )
  x.foreach (i => println(i))
  x.foreach { println(_) }
  
  
   
}