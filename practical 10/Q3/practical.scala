object demo {

    def findhead(list: List[Int]): Int = {
        return list.head
    }

    def findtail(list: List[Int]): List[Int] ={
        return list.tail
    }

    def main(args: Array[String]): Unit = {

        val list = List(1,2,3,4,5)
        println(findhead(list))
        println(findtail(list))

    }


}