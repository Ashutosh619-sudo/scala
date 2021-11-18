import Array._
  
// Creating object
object GFG
{
      
    // Main method
def main(args: Array[String]): Unit =
{
    var arr1 = Array(1, 2, 3, 4)
    var arr2 = Array(5, 6, 7, 8)
  
    var arr3 = concat( arr1, arr2)
      
    // Print all the array elements
    for ( x <- arr3 ) 
    {
        println( x )
    }
}
}