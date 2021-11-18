object CaseProblem{
    case class Product(qauntity:Int,name:String,price:Double)
    
    def main(agrs:Array[String]):Unit ={
        var obj1 = Product(10,"vanilla",2.99)
        var obj2 = Product(3,"Biscuit",3.99)
        var obj3 = Product(5,"cupcakse",4.99)
        
        val combinedList = List(obj1,obj2,obj3)
        print(combinedList)
    }
    
}