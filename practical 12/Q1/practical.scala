trait myTrait{
    def show(args:String*):Unit = Null
}

class VarArgs extends myTrait{
    def show(args:String*):Unity={
        println(args)
    }
}


object demo
{
    
    def main(args:Array[String]):Unity=
    {
        var Obj = new VarArgs
        Obj.show("foo","bar","boo")
    }
}