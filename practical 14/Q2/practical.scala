import java.io._

object Arithmetic {
   def main(args: Array[String]):Unit= {
     
    var n = 6
      
    val pw = new PrintWriter(new File("output.txt"))
    var f = 1
        for(i <- (1 to n).reverse)
        {
            pw.write(i)
            
        }
    
    
   }
}
