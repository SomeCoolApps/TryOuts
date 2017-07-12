object Collections {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  val arr = Array (12,23,34)                      //> arr  : Array[Int] = Array(12, 23, 34)

	arr(0)                                    //> res0: Int = 12

	arr.update(1, 3)
	
	arr                                       //> res1: Array[Int] = Array(12, 3, 34)
	
	val list = List (1,2,4)                   //> list  : List[Int] = List(1, 2, 4)
	
	list                                      //> res2: List[Int] = List(1, 2, 4)
	
	1::list                                   //> res3: List[Int] = List(1, 1, 2, 4)
	
	list                                      //> res4: List[Int] = List(1, 2, 4)
		
		
		list.exists { x => x>2 }          //> res5: Boolean = true

}