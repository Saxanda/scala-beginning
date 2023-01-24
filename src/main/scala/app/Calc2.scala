package app

import app.ImplicitTest.{IntMonoid, StringMonoid, sum}

import scala.collection.immutable.ListMap.EmptyListMap
import scala.xml.{Elem, Null}

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

    /*   def howMuchCanIMake_?(hours: Int, amount: BigDecimal = 34, currencyName: String = "Dollars") =
      (amount * hours).toString() + " " + currencyName

    howMuchCanIMake_?(30)
    val result1 = howMuchCanIMake_?(30, 95)
      println ("Final: " + howMuchCanIMake_?(30))
    //println("Final: " + result1)
*/
    ///////////////////////////////////////
    /* case class Event(name: String)

    trait EventListener {
      def listen(event: Event): String
    }

    class MyListener extends EventListener {
      def listen(event: Event): String = {
        event match {
          case Event("Moose Stampede") =>
            "An unfortunate moose stampede occurred"
          case _ => "Nothing of importance occurred"
        }
      }
    }

    val evt = Event("Moose Stampede")
    val myListener = new MyListener
    val result1 = myListener.listen(evt)
    println("Final: " + result1)*/
    //////////////////////////////////////////
    /*case class Event(name: String)

    trait EventListener {
      def listen(event: Event): String
    }

    class MyListener extends EventListener {
      def listen(event: Event): String = {
        event match {
          case Event("Moose Stampede") =>
            "An unfortunate moose stampede occurred"
          case _ => "Nothing of importance occurred"
        }
      }
    }

    val myListener = new MyListener

    val result1 = myListener.isInstanceOf[MyListener]
    val result2 = myListener.isInstanceOf[EventListener]
    val result3 = myListener.isInstanceOf[Any]
    val result4 = myListener.isInstanceOf[AnyRef]*/
    ///////////////////////////////////////////
    /*trait B {
      def bId = 2
    }

    trait A {
      self: B =>

      def aId = 1
    }

    //val a = new A  //***does not compile!!!***
    val obj = new A with B
    val result1 =  (obj.aId + obj.bId)
    println("Final: " + result1) */
    */

    ////////////////////////////////////////////////
    /*val xValues = 1 to 4
    val yValues = 1 to 2
    val coordinates = for {
      x <- xValues
      y <- yValues
    } yield (x, y)
    val result1 = coordinates(4)
    println("Final: " + result1)*/

    //////////////////////////////////////////////////

    /* val nums = List(List(1), List(2), List(3), List(4), List(5))

    val result = for {
      numList <- nums
      num <- numList
      if (num % 2 == 0)
    } yield (num)

    println("Final: " + result)
    // Which is the same as
   val result1 = nums.flatMap(numList => numList).filter(_ % 2 == 0)
    println("Final: " + result1)
    // or the same as
    val result2 = nums.flatten.filter(_ % 2 == 0)
    println("Final: " + result2)*/
    ///////////////////////////////////////////////////
    /*    val g: String = "Check out the big brains on Brad!"

    val result = g indexOf 'o'
    println("Final: " + result)
    val result1 = g.indexOf('o', 7)
    println("Final: " + result1)*/
    /////////////////////////////////////
    /*  val g: Int = 31
    //val result1 = (g toHexString)
    val result1 = (-g)
    println("Final: " + result1)*/
    ////////////////////////////////////
    /*   case class Person(name: String)
    class Loves[A, B](val a: A, val b: B)

    def announceCouple(couple: Person Loves Person) =
    //Notice our type: Person loves Person!
      couple.a.name + " is in love with " + couple.b.name

    val romeo = new Person("Romeo")
    val juliet = new Person("Juliet")

    val result1 = announceCouple(new Loves(romeo, juliet))
    println("Final: " + result1)*/
    //////////////////////////////////////////////////// the same
    /*  case class Person(name: String) {
      def loves(person: Person) = new Loves(this, person)
    }

    class Loves[A, B](val a: A, val b: B)

    def announceCouple(couple: Person Loves Person) =
    //Notice our type: Person loves Person!
      couple.a.name + " is in love with " + couple.b.name

    val romeo = new Person("Romeo")
    val juliet = new Person("Juliet")

    val result1 = announceCouple(romeo loves juliet)
    println("Final: " + result1)*/
    /////////////////////////////////////////////
    /* val s = for (v <- 1 to 4) yield v
    val result1 = s.toList
    println("Final: " + result1)*/
    //////////////////////////////////////////////////////////
    /* val s = Seq("hello", "world")
    val r = s map {
      _.reverse
    }
    print(r)*/
    ///////////////////////////////////////////////////
    /*    def foreach[U](f: Elem => U): Unit = {
      val it = Null.iterator
      while (it.hasNext) f(it.next())
    }*/
    /////////////////////////////////////////////
    /*val list = List(3, 5, 9, 11, 15, 19, 21)
    val it = list.iterator
    if (it.hasNext) {

    print(it.next)*/
    /////////////////////////////////

    /*  val list = List(3, 5, 9, 11, 15, 19, 21, 24, 32)
    val it = list grouped 3
    it.next()
    print(it.next)*/
    //////////////////////////////////////////////////
    /* val list = List(3, 5, 9, 11, 15, 19, 21, 24, 32)
    val it = list sliding 3

    print(it.next)
    print(it.next)*/

    /////////////////////////////////////////////////
    /*val list = List(3, 5, 9, 11, 15, 19, 21, 24, 32)
    (list takeRight 3)*/
    ////////////////////////////////////////////////
    /* val xs = List("Manny", "Moe", "Jack")
    val ys = List("Manny", "Moe", "Jack")
    val result = xs.iterator.sameElements(ys)
    println(result)
    val xt = List("Manny", "Moe", "Jack")
    val yt = List("Manny", "Jack", "Moe")
    val result1 =  xt.iterator.sameElements(yt)
    println(result1)*/
    ////////////////////////////////////////////////
    /*   val xs1 = Set(3, 2, 1, 4, 5, 6, 7)
    val ys1 = Set(7, 2, 1, 4, 5, 6, 3)
    val xe1 = Set(3, 2, 1, 4, 7)
    val ye1 = Set(7, 2, 1, 4, 3)
    val result2 = xs1.iterator.sameElements(ys1)
    println(result2)
    ///////////////////////////////////////////////
    val xt1 = Set(1, 2, 3)
    val yt1 = Set(3, 2, 1)
    val result3 = xt1.iterator.sameElements(yt1)
    println(result3)*/
    /////////////////////////////////////////////////
   /* val set = Set(1, 9, 10, 22)
    val list = List(3, 4, 5, 10)
    val result = set ++ list
    val t1 = result.size
    println(t1, result)
    val result2 = list ++ set
    val t2 =result2.size
    println(t2, result2)*/
    ////////////////////////////////////////////////
/*    val set = Set(1, 3, 4, 6)
    val result = set.map(_ * 4)
    val t = result.lastOption
    println(t, result)*/
////////////////////////////////////////////////////
/*val list = List(List(1), List(2, 3, 4), List(5, 6, 7), List(8, 9, 10))
    val t = list.flatten
    println(t)*/
    //////////////////////////////////////////////////
    /*val list = List(List(1), List(2, 3, 4), List(5, 6, 7), List(8, 9, 10))
    val result = list.flatMap(_.map(_ * 4))
    println(result)*/
    //////////////////////////////////////////////
    val list = List(1, 2, 3, 4, 5)
    val result = list.flatMap(it => if (it % 2 == 0) Some(it) else None)
    println(result)
  }
}
