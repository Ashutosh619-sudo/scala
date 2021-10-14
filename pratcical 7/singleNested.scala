object MaxAndMin
{
    // Main method
    def main(args: Array[String])
    {
        println("Min and Max from 5, 7")
                maxAndMin(5, 7);
    }
     
    // Function
    def maxAndMin(a: Int, b: Int) = {
     
       // Nested Function
       def maxminValue() = {
          if(a > b)
          {
              println("Max is: " + a)
              println("Min is: " + b)
          }
          else
          {
              println("Max is: " + b)
              println("Min is: " + a)
          }
       }
 
  
       }
       maxValue();
       minValue();
    }
}