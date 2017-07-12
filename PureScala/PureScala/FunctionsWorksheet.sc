object FunctionsWorksheet {
 
 	val a =5;                                 //> a  : Int = 5
 	
 	def square(x:Double):Double =x*x          //> square: (x: Double)Double

square(5)                                         //> res0: Double = 25.0



def factorial(i:Int):Int=if(i<2) 1 else i*factorial(i-1)
                                                  //> factorial: (i: Int)Int
 
 factorial(5)                                     //> res1: Int = 120
 }