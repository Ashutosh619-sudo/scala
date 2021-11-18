import scala.collection.immutable._
  
// Creating object 
object Demo
{ 
    // Main method 
    def main(args:Array[String]): Unit =
    { 
        // Creating and initializing immutable lists 
        val mylist: List[String] = List("Ashutosh","Singh")
  
        // Display the value of mylist using for loop 
        for(element<-mylist) 
        { 
            println(element) 
        } 
    } 
}