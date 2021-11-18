
object demo
{
 
    def main(args:Array[String]):Unit=
    {  
        var s = Set(1,2,4) 
        println(max(s))
        println(min(s))
        
    }
    def max(set:Set[Int]):Int={
        return set.max
    }
    def min(set:Set[Int]):Int={
        return set.min
    }
}    