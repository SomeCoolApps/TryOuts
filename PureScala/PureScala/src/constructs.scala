object constructs extends App {
   println("Hello World") 
   
   
   
  
   //   var a = 0;
  // for loop execution with a range
  //      for( a <- 1 to 10){
  //         println( "Value of a: " + a );
  //      }

  //      FOR LOOP UNTIL 
  //      for( a <- 1 until 10){
  //         println( "Value of a: " + a );
  //      }

  // mutlipe var loops 
        for( a <- 1 to 3; b <- 1 to 3){
           println( "Value of a: " + a );
           println( "Value of b: " + b );
        }

  // FOr loop with LIST
//      var b = Array("apple", "orance", "banana")
//      b(1).toUpperCase()
//      for( a <- b ){
//         println( "Value of a: " + a.toString );
//      }
      
//   val numList = List(1,2,3,4,5,6,7,8,9,10);
//   // for loop execution with multiple filters
//      var retVal = for{ a <- numList
//           if a != 3; if a < 8 }yield a
//   
//           for( a <- retVal){
//         println( "Value of a: " + a );
//      }
           
          // val p = new Person("asas","asas") 
   
            val p = new Pizza(crustType="HANDTOSSED",crustSize=20)
   
            val d = new Pizza(crustType="HANDTOSSED1",crustSize=20)
            
            if (p == d )println("equals")
            else println("not equal")
   
            
      
  
}