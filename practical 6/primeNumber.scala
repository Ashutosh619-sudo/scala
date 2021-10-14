import util.control._

object MyClass {
    
    def isPrime(num: Int): Boolean = (2 to num) forall (x => num % x != 0)
    

    def main(args: Array[String]) {
        var num = scala.io.StdIn.readInt()
        println(isPrime(num))
        
    }
}