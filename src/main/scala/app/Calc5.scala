package app

object Calc5 {
  def main (args: Array[String]): Unit = {
  /*  trait Randomizer[A] {
      def draw(): A
    }

    class IntRandomizer extends Randomizer[Int] {
      def draw() = {
        import util.Random
        Random.nextInt()
      }
    }

    val intRand = new IntRandomizer
    println(intRand.draw <= Int.MaxValue)*/
    //////////////////////////////////////////////
/*    print (classOf[String].getCanonicalName)
    println(classOf[String].getSimpleName)
    classOf[String].getCanonicalName*/

    ///////////////////////////////////////////////
  /*  trait Randomizer[A] {
      def draw(): A
    }

    class IntRandomizer extends Randomizer[Int] {
      def draw() = {
        import util.Random
        Random.nextInt()
      }
    }

    val intRand = new IntRandomizer
    intRand.isInstanceOf[IntRandomizer]
    intRand.isInstanceOf[Randomizer[Int]]
    intRand.draw.isInstanceOf[Int]
    println(intRand.isInstanceOf[IntRandomizer])
    println(intRand.isInstanceOf[IntRandomizer])
    println(intRand.draw.isInstanceOf[Int])*/
    //////////////////////////////////////////////
    class Test1(val age: Int = 10)
    class Test2(_age: Int) {
      def age: Int = _age
    }

    new Test1(10).age
  }
}
