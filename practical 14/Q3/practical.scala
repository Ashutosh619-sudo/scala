trait common{
    def show(l:List[Any]):Unit
}

class MyClass extends common {
    def show(l:List[Any]):Unit={
        println(l)
    }  
}


object demo {
   def main(args: Array[String]):Unit={
    
    var i = List(1,2,3,5)
    var s = List("bkchod", "teacher")
    var obj1 = new MyClass
    obj1.show(i)
    var obj2 = new MyClass
    obj2.show(s)
    
   }
}
