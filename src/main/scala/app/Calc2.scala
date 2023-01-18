package app

import app.ImplicitTest.{IntMonoid, StringMonoid, sum}

object Calc2 {
  def main(args: Array[String]): Unit = {
  /*  val doubleEvens: PartialFunction[Int, Int] = {
      case x if (x % 2) == 0 => x * 2
    }
    val tripleOdds: PartialFunction[Int, Int] = {
      case x if (x % 2) != 0 => x * 3
    }

    val whatToDo = doubleEvens orElse tripleOdds //Here we chain the partial functions together
    val t = whatToDo(3)*/
////////////////////////////////////////////////////
/*val doubleEvens: PartialFunction[Int, Int] = {
  case x if (x % 2) == 0 => x * 2
}
    val tripleOdds: PartialFunction[Int, Int] = {
      case x if (x % 2) != 0 => x * 3
    }

    val printEven: PartialFunction[Int, String] = {
      case x if (x % 2) == 0 => "Even"
    }
    val printOdd: PartialFunction[Int, String] = {
      case x if (x % 2) != 0 => "Odd"
    }

    val whatToDo = doubleEvens orElse tripleOdds andThen (printEven orElse printOdd)

    val t = whatToDo(3)
println(t)*/
    /////////////////////////////////////////
  /*class KoanIntWrapper(val original: Int) {
    def isOdd = original % 2 != 0
  }

    implicit def thisMethodNameIsIrrelevant(value: Int) =
      new KoanIntWrapper(value)
    val t = 19.isOdd*/
    ////////////////////////////////////////

/*    object MyPredef {

      class KoanIntWrapper(val original: Int) {
        def isOdd = original % 2 != 0

        def isEven = !isOdd
      }

      implicit def thisMethodNameIsIrrelevant(value: Int) =
        new KoanIntWrapper(value)
    }

    import MyPredef._
    //imported implicits come into effect within this scope
    val t =  19.isOdd
    20.isEven */
    /////////////////////////////////
   /*
    /// ***** import  ImplicitTest ********
    println(sum(List(1, 2, 3)))
    println(sum(List("a", "b", "c")))
*/
    ///////////////////////
/*
    import java.math.BigInteger
    implicit def Int2BigIntegerConvert(value: Int): BigInteger =
      new BigInteger(value.toString)

    def add(a: BigInteger, b: BigInteger) = a.add(b)

    add(Int2BigIntegerConvert(3), Int2BigIntegerConvert(6)) == Int2BigIntegerConvert(9)
    val t1 = add(3, 6) == 9
    val t2 = add(3, 6) == Int2BigIntegerConvert(9)

    val t3 = add(3, 6) == (9: BigInteger)
    val t4 = add(3, 6).intValue == 9*/
/////////////////////////////////////////////////////
   /* def howMuchCanIMake_?(hours: Int)
                         (implicit dollarsPerHour: BigDecimal) =
      dollarsPerHour * hours

    implicit val hourlyRate = BigDecimal(34)

    val result = howMuchCanIMake_?(30)

    println("Final: " + result)
*/
    ///////////////////////////////
   /* def howMuchCanIMake_?(hours: Int)(implicit amount: BigDecimal, currencyName: String) =
      (amount * hours).toString() + " " + currencyName

    implicit val hourlyRate = BigDecimal(34)
    implicit val currencyName = "Dollars"

    val result = howMuchCanIMake_?(30)*/

    /////////////////////////

    def howMuchCanIMake_?(hours: Int, amount: BigDecimal = 34, currencyName: String = "Dollars") =
      (amount * hours).toString() + " " + currencyName

    howMuchCanIMake_?(30)
    val result1 = howMuchCanIMake_?(30, 95)
    println("Final: " + howMuchCanIMake_?(30))
    //println("Final: " + result1)

    ///////////////////////////////////////

  }
}
