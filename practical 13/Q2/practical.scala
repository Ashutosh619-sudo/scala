import scala.util.matching.Regex

object Case
{
  
    def main(args: Array[String]):Unit=
    {
        val pattern = "(C|c)an".r
        
        val str = "I can but I Can not"
        
        println((pattern findAllIn str).mkString(",").split(",").length)
        println((pattern replaceAllIn(str,"Could")))
        
    }
}