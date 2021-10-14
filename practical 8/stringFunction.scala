
object MyClass {
    
    def compare(s1:String,s2:String): Boolean = {
        return s1 == s2;
    }
    
    def tolower(s:String):String ={
        return s.toLowerCase();
    }
    
    def indexof(s:String,c:Char):Int ={
        return s.indexOf(c);
    }
    
    def subString(s1:String, s2:String): Int ={
        return s1.indexOf(s2);
    }
    
    def charArrToString(data: Array,str:String): String ={
        return copyValueOf(data,str)
    }

    def main(args: Array[String]) {
        println(compare("hello","hello"));
        println(tolower("HELLO!"));
        println(indexof("hello",'h'))
        println(subString("hello","el"))
        var str = ""
        var c = Array('h','e','l')
        println(charArrToString(c))
        
    }
}