object demo{

    def main(args: Array[String]): Unit ={
    
        var list1 = List(1,2,3,4,5)
        var list2 = List(6,7,8,9,10)
        var list3 = list1:::list2   
        println(list3)     
    }
}