object demo
{
    
    def main(args:Array[String]):Unity=
    {
        var l = List.range(300,400)
        val result = l.filter(_%2==0).toList.mkString(",")
        print(result)
    }
}