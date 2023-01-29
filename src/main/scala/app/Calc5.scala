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
    /* class Test1(val age: Int = 10)
    class Test2(_age: Int) {
      def age: Int = _age
    }

    new Test1(10).age
   val t = new Test2(11).age
    println(t)*/
    //////////////////////////////////////
    /*val e = '\"'
    val f = '\\'

    println(e.toString)
    println(f.toString)*/
    /////////////////////////////////////
    /* class MyContainer[A](val a: A)(implicit manifest: scala.reflect.Manifest[A]) {
      def contents = manifest.runtimeClass.getSimpleName
    }

    val fruitBasket = new MyContainer(new Orange())
    println(fruitBasket.contents)*/
    /////////////////////////////////////////////////////
    /*   class MyContainer[A](val a: A)(implicit manifest: scala.reflect.Manifest[A]) {
      def contents = manifest.runtimeClass.getSimpleName
    }

    val fruitBasket = new MyContainer[Fruit](new Orange())
    println(fruitBasket.contents)


case class Orange() */
    /////////////////////////////////////////////////////////////
 /*   class MyContainer[+A](val a: A)(implicit manifest: scala.reflect.Manifest[A]) {
      def contents = manifest.runtimeClass.getSimpleName
    }

    val fruitBasket: MyContainer[Fruit] = new MyContainer[Orange](new Orange())
    fruitBasket.contents
*/
    ///////////////////////////////////////
  /*  class MyContainer[-A](a: A)(implicit manifest: scala.reflect.Manifest[A]) { //Can't receive a val because it would be in a covariant position
      def contents = manifest.runtimeClass.getSimpleName
    }

    val citrusBasket: MyContainer[Citrus] = new MyContainer[Citrus](new Orange)
    citrusBasket.contents
*/
    /////////////////////////////////////////////////////////

 /*   object GreekPlanets extends Enumeration {

      val Mercury = Value("Hermes")
      val Venus = Value("Aphrodite")
      val Earth = Value("Gaia")
      val Mars = Value("Ares")
      val Jupiter = Value("Zeus")
      val Saturn = Value("Cronus")
      val Uranus = Value("Ouranus")
      val Neptune = Value("Poseidon")
      val Pluto = Value("Hades")
    }

    println(GreekPlanets.Mercury.id)
    println(GreekPlanets.Mercury.toString )*/
    //////////////////////////////////////////
 object Planets extends Enumeration {

   val G = 6.67300e-11

   class PlanetValue(val i: Int, val name: String, val mass: Double, val radius: Double)
     extends Val(i: Int, name: String) {

     def surfaceGravity = G * mass / (radius * radius)

     def surfaceWeight(otherMass: Double) = otherMass * surfaceGravity

     def compare(that: PlanetValue) = this.i - that.i
   }

   val Mercury = new PlanetValue(0, "Mercury", 3.303e+23, 2.4397e6)
   val Venus = new PlanetValue(1, "Venus", 4.869e+24, 6.0518e6)
   val Earth = new PlanetValue(2, "Earth", 5.976e+24, 6.37814e6)
   val Mars = new PlanetValue(3, "Mars", 6.421e+23, 3.3972e6)
   val Jupiter = new PlanetValue(4, "Jupiter", 1.9e+27, 7.1492e7)
   val Saturn = new PlanetValue(5, "Saturn", 5.688e+26, 6.0268e7)
   val Uranus = new PlanetValue(6, "Uranus", 8.686e+25, 2.5559e7)
   val Neptune = new PlanetValue(7, "Neptune", 1.024e+26, 2.4746e7)
   val Pluto = new PlanetValue(8, "Pluto", 1.27e+22, 1.137e6)

 }
println(Planets.Earth.mass)
    println(Planets.Earth.radius)

  }
}

case class Orange()


