import Array._
object Demo {
   def main(args: Array[String]): Unit ={
      var myList1 = range(10, 20, 3)
      for ( x <- myList1 ) {
         print( " " + x )
      }
   }
}