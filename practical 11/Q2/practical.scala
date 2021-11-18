
object demo
{
 
    def main(args:Array[String]):Unit =
    {  
        var L1 = List("Pasta", "Pizza", "Juice")
        var L2 = List(5,5,5)
        print(convertToSet(L1,L2))
        var s = convertToSet(L1,L2)
        println(convertToList(s))
        
    }
    def convertToSet(l1:List[String],l2:List[Int]):Map[String,Int]={
        return (l1 zip l2).toMap
    }
    def convertToList(map:Map[String,Int]):Unit={
        println(map.keySet.toList)
        println(map.values.toList)
    }
}    