class abe
{ 
    protected var a:Int = 123
    def display()
    {
        a = 8
        println(a)
    }
}
class new1 extends abp
{
    def display1()
    {
        a = 9
        println(a)
    }
}
  
object access extends App
{
    var e = new abe()
    e.display()
    var e1 = new new1()
    e1.display1()
          
}