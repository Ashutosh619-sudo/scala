object practical{
    def main(args: Array[String]): Unit ={
        val z1 = Array("Zara", "Nuha", "Ayan")
        val z2 = Array("Zara", "Nuha", "Ayan")
        z2 = z1

        for ( x <- z2 ) {

            println( x )

        }
        // This wont work as the variables are immutable
    }

}