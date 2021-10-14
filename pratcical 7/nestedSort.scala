def nestedSort(array: Array[Int]): Array[Int] = {
    for(i <- 0 until array.length){
      var minPos = i

      for(j <- i+1 until array.length)
        if(array(j) < array(minPos))
          minPos = j

      if(minPos != i){
        val temp = array(i)
        array(i) = array(minPos)
        array(minPos) = array(i)
      }
    }

    array
  }