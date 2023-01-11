package app

object Calc {

  def add(a: Int, b: Int) = a + b

  def div(a: Int, b: Int) = a / b
/////////////////////////////////////////////
  def maybeItWillReturnSomething(flag: Boolean): Option[String] = {
    if (flag) Some("Found value") else None
  }
  class ClassWithValParameter(val name: String)

  val aClass = new ClassWithValParameter("Gandalf")

def main(args: Array[String]) = {
  ///////////////////////////////
 /* val valAdd = add(1,2)
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
 /* def lambda = { x: Int => x + 1 }
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

  def addWithoutSyntaxSugar(x: Int): Function1[Int, Int] = {
    new Function1[Int, Int]() {
      def apply(y: Int): Int = x + y
    }
  }

  addWithoutSyntaxSugar(1).isInstanceOf[Function1[Int, Int]]
  addWithoutSyntaxSugar(2)(3)
}
}
