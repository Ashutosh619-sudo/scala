import util.control._

object MyClass {
    
    def calculate(num:Int){
        
        println(s"Square of number $num is ${num*num}");
        println(s"Cube of number $num is ${num*num*num}");
        println(s"Forth power of number $num is ${num*num*num*num}");
    }
    

    def main(args: Array[String]) {
        var num = scala.io.StdIn.readInt()
        calculate(num)
        
    }
}