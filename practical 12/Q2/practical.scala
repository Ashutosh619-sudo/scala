object Case
{
  
    def main(args: Array[String]):Unity=
    {
  
        val d: PartialFunction[Int, Unit] =
        {
  
            case x if x > 0 => println("Positive Number")
            case x if x < 0 => print("Negative Number")
        }
  
        d(-3)
    }
}