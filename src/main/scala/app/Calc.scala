package app

import org.scalatest.Assertions.intercept

object Calc {

  def add(a: Int, b: Int) = a + b

  def div(a: Int, b: Int) = a / b

  def maybeItWillReturnSomething(flag: Boolean): Option[String] = {
    if (flag) Some("Found value") else None
  }
  class ClassWithValParameter(val name: String)

  val aClass = new ClassWithValParameter("Gandalf")

def main(args: Array[String]) = {
  ///////////////////////////////////////////////////
  /*val valAdd = add(1,2)
  println(valAdd)
  val aClass = new ClassWithValParameter("Gandalf")
  println(aClass.name)
  val value1 = maybeItWillReturnSomething(true)
  val value2 = maybeItWillReturnSomething(false)

  println(value1)
  println(value2)
  value1 getOrElse {"No value"}
  value2 getOrElse {"No value"}
  value2 getOrElse {    "default function"  }

  println(value1.isEmpty)
  println(value2.isEmpty)

  val someValue: Option[Double] = Some(20.0)
  val value = someValue match {
    case Some(v) => v
    case None => 0.0
  }
  println(value)

  val noValue: Option[Double] = None
  val value3 = noValue match {
    case Some(v) => v
    case None => 0.0
  }
  println(value3)
  object Greeting {
    def english = "Hi"

    def espanol = "Hola"
  }
  val x = Greeting
  val y = x
   println( x eq y)*/

  //////////////////////////////////////////////
  /*def lambda = { x: Int => x + 1 }
  def lambda2 = (x: Int) => x + 2
  val lambda3 = (x: Int) => x + 3

  val lambda4 = new Function1[Int, Int] {
    def apply(v1: Int): Int = v1 - 1
  }

  def lambda5(x: Int) = x + 1

  val result = lambda(3)
  val result1andhalf = lambda.apply(3)

  val result2 = lambda2(3)
  val result3 = lambda3(3)
  val result4 = lambda4(3)
  val result5 = lambda5(3)*/

  ////////////////////////////////////////
  /*  def addWithoutSyntaxSugar(x: Int): Function1[Int, Int] = {
    new Function1[Int, Int]() {
      def apply(y: Int): Int = x + y
    }
  }

  val result1 = addWithoutSyntaxSugar(1).isInstanceOf[Function1[Int, Int]]
  println(result1)
  val result2 = addWithoutSyntaxSugar(2)(3)
  println(result2)
  def fiveAdder: Function1[Int, Int] = addWithoutSyntaxSugar(5)
  val result3 = fiveAdder(5)
  println(result3)*/

  //////////////////////////////////////////
 /* def addWithSyntaxSugar(x: Int) = (y: Int) => x + y*/

  /* val result1 = addWithSyntaxSugar(1).isInstanceOf[Function1[Int, Int]]
  println(result1)
  val result2 = addWithSyntaxSugar(2)(3)
  println(result2)
  def fiveAdder = addWithSyntaxSugar(5)
  val result3 = fiveAdder(5)
  println(result3)*/
  //////////////////////////////////////////////
  /*def makeUpper(xs: List[String]) =
   xs map {
     _.toUpperCase
   }

  def makeWhatEverYouLike(xs: List[String], sideEffect: String => String) =
    xs map sideEffect

  val result1 = makeUpper(List("abc", "xyz", "123"))
  println(result1)

  val result2 = makeWhatEverYouLike(List("ABC", "XYZ", "123"), x => x.toLowerCase)
  println(result2)
  //using it inline
  val myName = (name: String) => s"My name is $name"
  val result3 = makeWhatEverYouLike(List("John", "Mark"), myName)
  println(result3)
  val result4 = List("Scala", "Erlang", "Clojure") map (_.length)
  println(result4)*/
  /////////////////////////////////////////
  /* val a = List(1, 2, 3)
  val b = List(1, 2, 3)
  val t = a eq b
  println(t)*/
  //////////////////////////////////
  /*  val a: List[String] = Nil
  val b: List[Int] = Nil
  val t1 = (a == Nil)
  println(t1)
  val t2 = (a eq Nil)
  println(t2)
  val t3 = (a == b)
  val t4 = (a eq b)
  println(t3)
  println(t4)*/
  //////////////////////////////////////
  /*val a = List(1, 3, 5, 7, 9)

  // get the length of the list
  val t1 = a.length
  println(t1)
  // reverse the list
  val t2 = a.reverse
  println(t2)
  // map a function to double the numbers over the list
  val t3 = a.map { v =>
    v * 2
  }
  println(t3)
  // filter any values divisible by 3 in the list
  val t4 = a.filter { v =>
    v % 3 == 0
  }
  println(t4)*/
  ////////////////////////////////////////
  /* val a = List(1, 3, 5, 7)
  val t1 = a.reduceLeft(_ + _)
  println(t1)
  val t2 = a.reduceLeft(_ * _)
  println(t2)
  val t3 = a.foldLeft(0)(_ + _)
  println(t3)
  val t4 = a.foldLeft(10)(_ + _)
  println(t4)
  val t5 = a.foldLeft(0)(_ * _)
  println(t5)
  val t6 = a.foldLeft(10)(_ * _)
  println(t6)*/
  ////////////////////////////////////////
  /* val a = List(1, 3, 5, 7)
  val t1 = 0::a
  println(t1)
  val head = List(1, 3)
  val tail = List(5, 7)
  println(head ::: tail)
  println(head ::: Nil)
  val d = Nil
  val c = 3 :: d
  val b = 2 :: c
  val a1 = 1 :: b
  println(a1)
  println(b.tail)*/
  ///////////////////////////////////
  /*  val myMap = Map("MI" -> "Michigan", "OH" -> "Ohio", "WI" -> "Wisconsin", "MI" -> "Michigan")
  val aNewMap = myMap + ("IL" -> "Illinois")
  println(aNewMap)
  println(aNewMap.contains("IL"))*/
  //////////////////////
  /* val myMap = Map("MI" -> "Michigan", "OH" -> "Ohio", "WI" -> "Wisconsin", "MI" -> "Michigan")

  val mapValues = myMap.values
  println(mapValues)
  println(mapValues.size)
  println(mapValues.head)
  println(mapValues.last)*/
  //////////////////////////
  /* val myMap = Map("MI" -> "Michigan", "OH" -> "Ohio", "WI" -> "Wisconsin", "MI" -> "Meechigan")
  val mapValues = myMap.values
  println(myMap("MI"))*/
  ////////////////
  /*  val myMap =
    Map("MI" -> "Michigan", "OH" -> "Ohio", "WI" -> "Wisconsin", "IA" -> "Iowa")
  intercept[NoSuchElementException] {
    myMap("TX")
  }
  val t = myMap.getOrElse("TX", "missing data")
  println(t)*/
  /////////////////////////
  /*  val myMap =
    Map("MI" -> "Michigan", "OH" -> "Ohio", "WI" -> "Wisconsin", "IA" -> "Iowa")
  val aNewMap = myMap - "MI"
  val t =aNewMap.contains("MI")
  println(t)*/
  ////////////////////////////
  /* val myMap =
    Map("MI" -> "Michigan", "OH" -> "Ohio", "WI" -> "Wisconsin", "IA" -> "Iowa")
  val aNewMap = myMap - "MN"

  val t = aNewMap.equals(myMap)
  println(t)*/
  /////////////////////////////////
  /* val a = 'a'
  val b = 'B'
  val t1 = "%c".format(a)
  val t2 = "%c".format(b)
  println(t1)
  println(t2)*/
  //////////////////////////////
  /*val j = 190
  val k = "vodka"

  val t1 = "%d bottles of %s on the wall".format(j - 100, k)
  println(t1)*/
  ////////////////////////
  /* def goldilocks(expr: (String, String)) =
    expr match {
      case ("porridge", bear) =>
        bear + " said someone's been eating my porridge"
      case ("chair", bear) => bear + " said someone's been sitting in my chair"
      case ("bed", bear) => bear + " said someone's been sleeping in my bed"
      case _ => "what?"
    }
  val t1 = goldilocks(("porridge", "Papa"))
  val t2 = goldilocks(("chair", "Mama"))
  val t3 = goldilocks(("bed", "Masha"))
  val t4 = goldilocks(( "Masha","bed"))
  println(t1)
  println(t2)
  println(t3)
  println(t4)*/
  /////////////////////////////////////////

  /*val foodItem = "porridge"

  def goldilocks(expr: (String, String)) =
    expr match {
      case (`foodItem`, _) => "eating"
      case ("chair", "Mama") => "sitting"
      case ("bed", "Baby") => "sleeping"
      case _ => "what?"
    }
  val t1 = goldilocks(("porridge", "Papa"))
  println(t1)*/
  //////////////////////////////////////
  /* val secondElement = List(1, 2, 3, 33) match {
    case x :: y :: xs => y
    case _ => 0
       }
  val t1 = secondElement
  println(t1)*/
  /////////////////////////////////////////
  /*val r = List(1, 2, 3) match {
  case x :: y :: Nil => y // only matches a list with exactly two items
  case _ => 0
}
  val t1 = r
  println(t1)*/
  ///////////////////////////////////////////////
  /*  val r = List(1, 2, 3) match {
    case x :: y :: z :: tail => tail
    case _ => 0
  }

  r == Nil*/
  ////////////////////////

  /*  abstract class Term
  case class Var(name: String) extends Term
  case class Fun(arg: String, body: Term) extends Term
  case class App(f: Term, v: Term) extends Term

  Fun("x", Fun("y", App(Var("x"), Var("y"))))
  val x = Var("x")
  println(x.name)

  val x1 = Var("x")
  val x2 = Var("x")
  val y1 = Var("y")
  println("" + x1 + " == " + x2 + " => " + (x1 == x2))
  println("" + x1 + " == " + y1 + " => " + (x1 == y1))*/
  ///////////////////////////////////////////
  /*  object TermTest extends Application {
    def printTerm(term: Term) = {
      term match {
        case Var(n) =>
          print(n)
        case Fun(x, b) =>
          print("^" + x + ".")
          printTerm(b)
        case App(f, v) =>
          print("(")
          printTerm(f)
          print(" ")
          printTerm(v)
          print(")")
      }
    }

    def isIdentityFun(term: Term): Boolean = term match {
      case Fun(x, Var(y)) if x == y => true
      case _ => false
    }

    val id = Fun("x", Var("x"))
    val t = Fun("x", Fun("y", App(Var("x"), Var("y"))))
    printTerm(t)
    println
    println(isIdentityFun(id))
    println(isIdentityFun(t))
  }*/

  //////////////////////////////////////////
  /*  case class Person(first: String, last: String)

  val p1 = new Person("Fred", "Jones")
  val p2 = new Person("Shaggy", "Rogers")
  val p3 = new Person("Fred", "Jones")
  val t1 = (p1 == p2)
  val t2 = (p1 == p3)
  val t3 = (p1 eq p2)
  val t4 = (p1 eq p3)
  println(t4) // pointed to the reference*/
  //////////////////////////////////////////////
  /* case class Person(first: String, last: String)

  val p1 = new Person("Fred", "Jones")
  val p2 = new Person("Shaggy", "Rogers")
  val p3 = new Person("Fred", "Jones")
  val t1 = (p1.hashCode == p2.hashCode)
  val t2 = p1.hashCode
  println(t1)
  println(t2)*/
  //////////////////////////////////
  /*case class Dog(name: String, breed: String)
  val d1 = Dog("Scooby", "Doberman")
  val t1 = d1.toString
  println(t1)*/

  /////////////////
/*  case class PersonCC(firstName: String, lastName: String)
  val indy = PersonCC("Indiana", "Jones")

  val t1 = indy.isInstanceOf[Serializable]
  println(t1)
  class Person(firstName: String, lastName: String)
  val junior = new Person("Indiana", "Jones")


  val t2 = junior.isInstanceOf[Serializable]
  println(t2)*/
  //////////////////////////////

 /* val someNumbers = Range(0, 10)
  val second = someNumbers(1)
  val last = someNumbers.last

  val t1 = someNumbers.size
  println(t1)
  val otherRange = 0 until 10
  println(otherRange)*/
  //////////////////////////////////
/*  val someNumbers = Range(0, 34, 2)
  print(someNumbers.contains(33))*/
  //////////////////////
  def multiply(x: Int, y: Int) = x * y

  val t = (multiply _).isInstanceOf[Function2[_, _, _]]
  println(t)
  ////////////////////////////////
  def customFilter(f: Int => Boolean)(xs: List[Int]) =
    xs filter f

  def onlyEven(x: Int) = x % 2 == 0

  val xs = List(12, 11, 5, 20, 3, 13, 2)
  val someNumbers =  customFilter(onlyEven)(xs)
  println(someNumbers)
  ////////////////////////////////////////////////
/*  val doubleEvens: PartialFunction[Int, Int] = {
    case x if (x % 2) == 0 => x * 2
  }
  val tripleOdds: PartialFunction[Int, Int] = {
    case x if (x % 2) != 0 => x * 3
  }

  val whatToDo = doubleEvens orElse tripleOdds //Here we chain the partial functions together
  whatToDo(3)*/
}
}


