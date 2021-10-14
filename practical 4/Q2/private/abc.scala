class abc
{ 
    private var a:Int = 123
    def display()
    {
        a = 8
        println(a)
    }
}
  
object access extends App
{
    var e = new abc()
    e.display()
}