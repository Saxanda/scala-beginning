object FirstSteps{
  println("Welcome to the Scala worksheet")
  1 + 1

  if (20 > 10) "left" else "right"

  println("The ultimate answer is " + 42)
}

object Test3 {
  def hello(name: String) =
    "Hello " + name
}

object Test4 {
  val name = "Noel"
  def hello(other: String): String =
    name + " says hi to " + other
}
object argh {
  def a = {
    println("a")
    1
  }

  val b = {
    println("b")
    a + 2
  }

  def c = {
    println("c")
    a
    b + "c"
  }
}
object calc {
  def square(x: Double) = x * x
  def cube(x: Double) = x * square(x)
}
///=========================
class Timestamp(val seconds: Long)

object Timestamp {
  def apply(hours: Int, minutes: Int, seconds: Int): Timestamp =
    new Timestamp(hours*60*60 + minutes*60 + seconds)
}//Timestamp(1, 1, 1).seconds
