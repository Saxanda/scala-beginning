package app

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
  def addWithSyntaxSugar(x: Int) = (y: Int) => x + y

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
  val a = List(1, 3, 5, 7)
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
  println(b.tail)
  ///////////////////////////////////
  }
}
