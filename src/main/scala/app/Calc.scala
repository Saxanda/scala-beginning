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
  val valAdd = add(1,2)
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
}
}
