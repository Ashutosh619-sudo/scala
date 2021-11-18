object practical{
    def swap(a: Array[Int], i: Int, j: Int): Unit = {
      val tmp = a(j)
      a(j) = a(i)
      a(i) = tmp
}

    def main(args: Array[String]):Unit= {
        val a = Array(5, 3, 4, 7, 1)
        var needsSorting = true
        
        while (needsSorting) {
          needsSorting = false
          for (i <- 0 until (a.length - 1)) {
            if (a(i) > a(i + 1)) {
              swap(a, i, i + 1)
              needsSorting = true
            }
          }
        }
        println(a.iterator.mkString(", "))
    }

    

}