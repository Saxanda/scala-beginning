package  app

//

object Calc3{
  def main(args: Array[String]): Unit = {
 /*   val list = List(4, 6, 7, 8, 9, 13, 14)
    val partialFunction1: PartialFunction[Int, Int] = {
      case x: Int if x % 2 == 0 => x * 3
    }
    val partialFunction2: PartialFunction[Int, Int] = {
      case y: Int if y % 2 != 0 => y * 4
    }

    val result = list.collect(partialFunction1 orElse partialFunction2)
    println(result)*/
    /////////////////////////////////////////////////
   /* val list = List(4, 6, 7, 8, 9, 13, 14)
     val t = list.foreach(num => println(num * 4))
   println(list)
    println(t)
    */
    ////////////////////////////////////////////
/*    val list = List(4, 6, 7, 8, 9, 13, 14)
    val result = list.to(LazyList)
    val t = result.isInstanceOf[LazyList[_]]
    val t1 =(result take 3)
    println(t)
    println(t1)*/
    /////////////////////////////////////////////////
    /*val map = Map("Phoenix" -> "Arizona", "Austin" -> "Texas")
    val t = map.knownSize
    println(t)*/
    /////////////////////////////
 /*   val list = List(10, 19, 45, 1, 22)
    val t = list.headOption
    println(t)
    val list2 = List()
    val t1 = list2.headOption
    println(t1)*/
    ///////////////////////////////////////
    /*val list = List(10, 19, 45, 1, 22)
    val t = list.find(_ % 2 != 0)
    println(t)
    val list2 = List(4, 8, 16)
    val t1 = list2.find(_ % 2 != 0)
    println(t1)*/
    ////////////////////////////////////
    /*val list = List(10, 19, 45, 1, 22)
    val t1 = list.tail
    print(t1)*/
    ////////////////////////////////////////
   /* val list = List(10, 19, 45, 1, 22)
    val t = list.take(3)
    println(t)*/
    /////////////////////////////////////////////////
   /* def makeLazyList(v: Int): LazyList[Int] =List(v, makeLazyList(v + 1))

   val a = makeLazyList(2)
    println(a)
    (a take 3 toList)*/

    ////////////////////////////////////////
/*    val a = List(2,3,4,5,6,7,8,9)
    val t = ((a drop 6)take 3 toList)
    println(t)*/
///////////////////////////////////////////////////////
/*val list = List(87, 44, 5, 4, 200, 10, 39, 100)
    val t = list.takeWhile(_ < 100)
    println(t)*/
//////////////////////////////////////////////////////////
  /*  val list = List(87, 44, 5, 4, 200, 10, 39, 100)
    val t = list.dropWhile(_ < 100)
    println(t)*/
    //////////////////////////////////////////////////////
  /*  val list = List(87, 44, 5, 4, 200, 10, 39, 100)
    val t = list.filter(_ < 100)
    println(t)*/
    //////////////////////////////////////////////////
    /*val array = Array(87, 44, 5, 4, 200, 10, 39, 100)
    val result = array splitAt 3
   val t1 = result._1
    val t2 = result._2
    println(t1.toArray)
    println(t2.toList)*/

    /////////////////////////////////////////
    /*val array = Array(87, 44, 5, 4, 200, 10, 39, 100)
    val result = array span (_ < 100)
    val t1 = result._1
    val t2 = result._2
    println(t1.toList)
    println(t2.toList)*/
    ///////////////////////////////////////////////
   /* val array = Array(87, 44, 5, 4, 200, 10, 39, 100)
    val result = array partition (_ < 100)
    val t1 = result._1
    val t2 = result._2
    println(t1.toList)
    println(t2.toList)*/
    /////////////////////////////////////////////////////
 /*   val array = Array(87, 44, 5, 4, 200, 10, 39, 100)

    val oddAndSmallPartial: PartialFunction[Int, String] = {
      case x: Int if x % 2 != 0 && x < 100 => "Odd and less than 100"
    }

    val evenAndSmallPartial: PartialFunction[Int, String] = {
      case x: Int if x != 0 && x % 2 == 0 && x < 100 => "Even and less than 100"
    }

    val negativePartial: PartialFunction[Int, String] = {
      case x: Int if x < 0 => "Negative Number"
    }

    val largePartial: PartialFunction[Int, String] = {
      case x: Int if x > 99 => "Large Number"
    }

    val zeroPartial: PartialFunction[Int, String] = {
      case x: Int if x == 0 => "Zero"
    }

    val result = array groupBy {
      oddAndSmallPartial orElse
        evenAndSmallPartial orElse
        negativePartial orElse
        largePartial orElse
        zeroPartial
    }
    val t1 = (result("Even and less than 100") size)
    println(t1)
    val t2 = (result("Large Number") size)
    println(t2)*/
    /////////////////////////////////////////
    /*val list = List(87, 44, 5, 4, 200, 10, 39, 100)
    val result = list forall (_ <10)
    println(result)*/
    ///////////////////////////////////////////
   /* val list = List(87, 44, 5, 4, 200, 10, 39, 100)
    val result = list exists (_ < 100)
    println(result)*/
    //////////////////////////////////////////////

  /*  val list = List(87, 44, 5, 4, 200, 10, 39, 100)
    val result = list count (_ < 100)
    println(result)*/
    //////////////////////////////////////////
   /* val list = List(5, 4, 3, 2, 1)
    val result = list.foldLeft(0) { (`running total`, `next element`) =>
      `running total` - `next element`
    }
    println(result)
    val result2 = list.foldLeft(0)(_ - _) //Short hand
    println(result2)
    println(
      (((((0 - 5) - 4) - 3) - 2) - 1))*/
    ///////////////////////////////////////////////////////////////////
  /*  val list = List(5, 4, 3, 2, 1)
    val result = list.foldRight(0) { (`next element`, `running total`) =>
      `next element` - `running total`
    }
    println(result)*/
    /////////////////////////////////////////////////////////
  /*  val intList = List(5, 4, 3, 2, 1)
    val t1 = intList.reduceRight{
      _ + _
    }
  println(t1)*/
    /////////////////////////////////////////////////
   /* val stringList = List("Do", "Re", "Me", "Fa", "So", "La", "Te", "Do")
    val t = stringList.reduceLeft {
      _ + _
    }
    println(stringList)
    println(t)
    println(stringList.reduceLeft {
      _ + _
    })*/
    /////////////////////////////////////////////////////////
    /*val stringList = List("Do", "Re", "Me", "Fa", "So", "La", "Te", "Do")
    //val stringList = List(1, 2, 1)
    println(stringList)
    println(stringList.reduceRight {
      _ + _
    })
   val t  = stringList.reduceRight {
      _ + _
    }
    println(t)
    println(stringList)*/
    ///////////////////////////////
/*    val intList = List(5, 4)
    println(intList.product)*/
    /////////////////////////////////
  /* val intList = List(5, 4, 3, 2, 1)
    val t1 = intList.reduceRight((x, y) => x - y)
    println(t1)*/
    ////////////////////////////////////////
 /*   val intList = List(5, 4, 3, 2, 1)
    val t2 = intList.reverse.reduceLeft((x, y) => y - x)
    println(t2)*/
    ///////////////////////////////
   /* val intList = List(3, 2, 1)
    val t2 = intList.reverse.reduce((x, y) => y - x)
    println(t2)*/
    ///////////////////////////////////////////
  /*  val list = List(List(1, 2, 3), List(4, 5, 6), List(7, 8, 9))
    val t1 = list.transpose
    println(t1)
    val list2 = List(List(1), List(4))
    val t2 = list2.transpose
    println(t2)*/
    ////////////////////////////////////////////////
 /*   val list = List(1, 2, 3, 4, 5)
    val t1 = list.mkString(",")
    println(t1)*/
      ////////////////////////////////////////
/*
    val list = List(1, 2, 3, 4, 5)
    val t2 = list.mkString(">", ",", "<")
    println(t2)*/
      ////////////////////////////////////
      val stringBuilder = new StringBuilder()
    val list = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15)
    stringBuilder.append("I want all numbers 6-12: ")
    list.filter(it => it > 5 && it < 13).addString(stringBuilder, ",")
    val t1 = stringBuilder.mkString
    println(t1)
}
}