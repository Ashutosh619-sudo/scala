import scala.collection.immutable._
  

object demo
{
 
    def main(args:Array[String]):Unit =
    {
        
        val programminglanguage = List.fill(3)("Scala") 
        println( "Programming Language : " + programminglanguage )
  
    
        val number= List.fill(8)(4)         
        println("number : " + number)
    }
    
}    