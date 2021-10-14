import util.control._

object MyClass {
    
    def numEntered(num:Int):Boolean ={
        val breakObj = new Breaks;
        
        var flag = false;
        
        for(i <- 1 to 10){
            breakObj.breakable{
                if(i==3){
                    flag = true
                    breakObj.break
                }
            }
        }
        return flag
        
    }

    def main(args: Array[String]) {
        println(numEntered(3))
    }
}