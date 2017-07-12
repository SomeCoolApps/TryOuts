object SecondWorksheet {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
	val a=3                                   //> a  : Int = 3
	
	var b =5                                  //> b  : Int = 5
	
	var c:Int =4                              //> c  : Int = 4
	
	val (e,d) =(3,5)                          //> e  : Int = 3
                                                  //| d  : Int = 5
	
	val i =5                                  //> i  : Int = 5
	
	if(a<5) "hi" else()                       //> res0: Any = hi
	
	if(a<5) 4 else()                          //> res1: AnyVal = 4
	  
	//val j =
	
	a match{
	case 0 => "zero"
	case 1=> "One"
	case `i`=> "same as i "
	case _=>"Something else"
	
	}                                         //> res2: String = Something else
	
	      for( a <- 1 to 3; b <- 1 to 3){
           println( "Value of a: " + a );
           println( "Value of b: " + b );
        }                                         //> Value of a: 1
                                                  //| Value of b: 1
                                                  //| Value of a: 1
                                                  //| Value of b: 2
                                                  //| Value of a: 1
                                                  //| Value of b: 3
                                                  //| Value of a: 2
                                                  //| Value of b: 1
                                                  //| Value of a: 2
                                                  //| Value of b: 2
                                                  //| Value of a: 2
                                                  //| Value of b: 3
                                                  //| Value of a: 3
                                                  //| Value of b: 1
                                                  //| Value of a: 3
                                                  //| Value of b: 2
                                                  //| Value of a: 3
                                                  //| Value of b: 3
	
	
}