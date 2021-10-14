
object MyClass {
    
    def arithmeticOperator(n1:Int,n2:Int){
        
        println("Adding of two number: "+(n1+n2));
        println("Subtracting of two number: "+(n1-n2));
        println("Multiplication of two number: "+(n1*n2));
        println("Division of two number: "+(n1/n2));
        println("Modulus of two number: "+(n1%n2));
    }
    
    def realtionalOperator(a:Int,b:Int){
        println("Equality of a and b" + (a==b));
        println("Not equal of a and b" + (a != b));
        println("Greater than a and b"+ (a>b));
        println("Less Than of a and b"+(a<b));
        println("Greater than and equal to a and b"+ (a>=b));
        println("Less than and equal to a and b"+ (a<=b));
        
    }
    
    def logicalOperator(b1:Boolean, b2:Boolean){
        println("Logical Not of b1 and b2: " + !(b1&&b2));
        println("Logical Or of b1 and b2: " + (b1||b2));
        println("Logical AND of b1 and b2: " + (b1&&b2));
    }
    
    def bitwiseOperation(n1:Int,n2:Int){
        println("Bitwise AND of n1 and n2 "+ (n1&n2));
        println("Bitwise OR of n1 and n2 "+ (n1|n2));
        println("Bitwise XOR of n1 and n2 "+ (n1^n2));
        println("Bitwise ones complement of n1 "+ (~n1));
        println("Bitwise Shift right  "+ (n1>>3));
        println("Bitwise Shift left  "+ (n2<<3));
    }
    
    def assignmentOperator(n1:Int,n2:Int){
        
        var c = n1+n2;
        
        println("Simple Adding:" + c);
        c+=n1;
        println("Add and assignment:" + c);
        c -= n1
        println("Subtract and assignment:" + c);
        c *= n1
        println("Multiply and assignment:" + c);
        c /= n1
        println("Divide and assignment:" + c);
        c %= n1;
        println("Modulus and assignment:" + c);
    }

    def main(args: Array[String]) {
        var num1 = scala.io.StdIn.readInt()
        var num2 = scala.io.StdIn.readInt()
        bitwiseOperation(num1,num2)
        assignmentOperator(num1,num2)
        logicalOperator(true,false)
        realtionalOperator(num1,num2)
        arithmeticOperator(num1,num2)
        
    }
}