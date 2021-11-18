object Case
{
  
    def main(args: Array[String]):Unit=
    {
        val inputDay = scala.io.StdIn.readLine()
        
        var output = inputDay match{
            case "December" => println("Winter")
            case "November" => "Winter"
            case "October" => println("Winter")
            case "January" => println("Winter")
            case "February" => println("Winter")
            
            case weekday => s"This is $weekday, Winter will come"
        }
        
        print(output)
        
    }
}