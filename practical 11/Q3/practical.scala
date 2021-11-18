object demo
{
    
    def main(args:Array[String]):Unit=
    {
        val v = Array(5,1,2,3,6,4)
        
        val i = v.iterator
      
        while (i.hasNext)
            print(i.next + " ")
    }
}