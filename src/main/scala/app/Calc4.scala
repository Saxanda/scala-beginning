package app

object Calc4 {
  def main (args: Array[String]): Unit = {
   /* def printName(first: String = "John", last: String = "Smith") = {
      println(first + " " + last)
    }
    printName(last = "Jones")*/
//////////////////////////////////////////////////

    class WithoutClassParameters() {
      def addColors(red: Int, green: Int, blue: Int) = {
        (red, green, blue)
      }

      def addColorsWithDefaults(red: Int = 0, green: Int = 0, blue: Int = 0) = {
        (red, green, blue)
      }
    }

    class WithClassParameters(val defaultRed: Int, val defaultGreen: Int, val defaultBlue: Int) {
      def addColors(red: Int, green: Int, blue: Int) = {
        (red + defaultRed, green + defaultGreen, blue + defaultBlue)
      }

      def addColorsWithDefaults(red: Int = 0, green: Int = 0, blue: Int = 0) = {
        (red + defaultRed, green + defaultGreen, blue + defaultBlue)
      }
    }

    class WithClassParametersInClassDefinition(val defaultRed: Int = 0, val defaultGreen: Int = 255, val defaultBlue: Int = 100) {
      def addColors(red: Int, green: Int, blue: Int) = {
        (red + defaultRed, green + defaultGreen, blue + defaultBlue)
      }

      def addColorsWithDefaults(red: Int = 0, green: Int = 0, blue: Int = 0) = {
        (red + defaultRed, green + defaultGreen, blue + defaultBlue)
      }
    }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*val me = new WithoutClassParameters()

    // What happens if you change the order of these parameters? Nothing.
    val myColor = me.addColors(green = 0, red = 255, blue = 0)

    println(myColor)*/
    ////////////////////////////
/*val me = new WithoutClassParameters()
    val myColor = me.addColorsWithDefaults(green = 255)

    println(myColor)*/
///////////////////////////////////////////
/*val me = new WithClassParameters(40, 50, 60)
    val myColor = me.addColors(green = 50, red = 60, blue = 40)

    println(myColor)*/
    ///////////////////////////////////////////////////////
  /*  val me = new WithClassParameters(10, 20, 30)
    val myColor = me.addColorsWithDefaults(green = 70)

    println(myColor)*/
///////////////////////////////////////////////////
/*val me = new WithClassParametersInClassDefinition()
    val myColor = me.addColorsWithDefaults(green = 70)

    println(myColor)*/
    ////////////////////////////////////////////////
/*def reduce(a: Int, f: (Int, Int) => Int = _ + _): Int = f(a, a)

    val t = reduce(5)
    println(t)
    val t2 = reduce(5, _ * _)
    println(t2)*/
    ////////////////////////////////////////////////////
/*case class Employee(firstName: String, lastName: String)

    val rob = new Employee("Robin", "Williams")
    val result = rob match {
      case Employee("Robin", _) => "Where's Batman?"
      case _ => "No Batman Joke For You"
    }

    println(result)*/
    ///////////////////////////////////////////////////////////////
    /*
class Car(val make: String, val model: String, val year: Short, val topSpeed: Short)

    object ChopShop {
      def unapply(x: Car) = Some((x.make, x.model, x.year, x.topSpeed))
    }

    val ChopShop(a, b, c, d) = new Car("Chevy", "Camaro", 1978, 120)

    println(a)
    println(b)
    println(c)
    println(d)
*/
////////////////////////////////////
/*class Car(val make: String, val model: String, val year: Short, val topSpeed: Short)

    object ChopShop {
      def unapply(x: Car) = Some((x.make, x.model, x.year, x.topSpeed))
    }

    val x = new Car("Chevy", "Camaro", 1978, 120) match {
      case ChopShop(s, t, u, v) => (s, t)
      case _ => ("Ford", "Edsel")
    }

    println(x._1)
    println(x._2)*/
    ////////////////////////////////////////////
   /* class Car(val make: String, val model: String, val year: Short, val topSpeed: Short)

    object ChopShop {
      def unapply(x: Car) = Some((x.make, x.model, x.year, x.topSpeed))
    }

    val x = new Car("Chevy", "Camaro", 1978, 120) match {
      case ChopShop(s, t, _, _) => (s, t)
      case _ => ("Ford", "Edsel")
    }

    println(x._1)
    println(x._2)*/
    //////////////////////////////////////////////////////////////

/////////////////////////////////////////////////////////////
/*class Car(val make: String, val model: String, val year: Short, val topSpeed: Short) {
  def unapply(x: Car) = Some((x.make, x.model))
}

    val camaro = new Car("Chevy", "Camaro", 1978, 122)

    val result = camaro match {
      case camaro(make, model) => "make: %s, model: %s".format(make, model)
      case _ => "unknown"
    }

    println(result)*/
    ///////////////////////////////////////////////
/*class Employee(
                val firstName: String,
                val middleName: Option[String],
                val lastName: String)

    object Employee {
      //factory methods, extractors, apply
      //Extractor: Create tokens that represent your object
      def unapply(x: Employee) =
        Some((x.lastName, x.middleName, x.firstName))
    }

    val singri = new Employee("Singri", None, "Keerthi")

    val Employee(a, b, c) = singri

  println(a)
    println(b)
    println(c)*/
    /////////////////////////////////////////////////////////////////////
/*    class Employee(
                    val firstName: String,
                    val middleName: Option[String],
                    val lastName: String)

    object Employee {
      //factory methods, extractors, apply
      //Extractor: Create tokens that represent your object
      def unapply(x: Employee) =
        Some((x.lastName, x.middleName, x.firstName))
    }

    val singri = new Employee("Singri", None, "Keerthi")

    val result = singri match {
      case Employee("Singri", None, x) =>
        "Yay, Singri %s! with no middle name!".format(x)
      case Employee("Singri", Some(x), _) =>
        "Yay, Singri with a middle name of %s".format(x)
      case _ => "I don't care, going on break"
    }

  println(result)*/
    ////////////////////////////////////////////////
/*def calc(x: () => Int): Either[Throwable, Int] = {
  try Right(x()) // An explicit call of the x function
  catch {
    case b: Throwable => Left(b)
  }
}

    val y = calc { () => // explicitly declaring that Unit is a parameter with ()
      14 + 15
    }

    println(y)*/
////////////////////////////////////////////////////
/*def calc(x: => Int): Either[Throwable, Int] = {
  // x is a call by-name parameter
  try Right(x)
  catch {
    case b: Throwable => Left(b)
  }
}

    val y = calc {
      // This looks like a natural block
      println("Here we go!") // Some superfluous call
      val z = List(1, 2, 3, 4) // Another superfluous call
      49 + 20
    }
    println(y)*/
//////////////////////////////////////
/*object PigLatinizer {
  def apply(x: => String) = x.tail + x.head + "ay"
}

    val result = PigLatinizer {
      val x = "pret"
      val z = "zel"
      x ++ z //concatenate the strings
    }

    println(result)*/
    ////////////////////////////////////////
/*def repeatedParameterMethod(x: Int, y: String, z: Any*) = {
  "%d %ss can give you %s".format(x, y, z.mkString(", "))
}

    val t = repeatedParameterMethod(
      3,
      "egg",
      "a delicious sandwich",
      "protein",
      "high cholesterol")
    println(t)
    val t2 = repeatedParameterMethod(
      3,
      "egg",
      List("a delicious sandwich", "protein", "high cholesterol"))
println(t2)
    val t3 = repeatedParameterMethod(
      3,
      "egg",
      List("a delicious sandwich", "protein", "high cholesterol"): _*)
println(t3)*/
      ///////////////////////////////////////////////////////
 /*     class Soldier(val firstName: String, val lastName: String) {}
    class Pilot(override val firstName: String, override val lastName: String, val squadron: Long)
      extends Soldier(firstName, lastName)

    val pilot = new Pilot("John", "Yossarian", 256)
    val soldier: Soldier = pilot

    val f1 = soldier.firstName
    println(f1)
    val f2 = soldier.lastName
    println(f2)*/

    ///////////////////////////////////////////////

/*   /*!!!!!!!!!! An abstract class, as in Java, cannot be instantiated and only inherited:*/
    abstract class Soldier(val firstName: String, val lastName: String) {}

    // if you uncomment this line, it will fail compilation
    //val soldier =  new Soldier*/
    //////////////////////////////////////////////////////////

    abstract class Soldier(val firstName: String, val lastName: String) {

      class Catch(val number: Long) {
        // nothing to do here.  Just observe that it compiles
      }

    }
    class Pilot(override val firstName: String, override val lastName: String, val squadron: Long)
      extends Soldier(firstName, lastName)

    val pilot = new Pilot("John", "Yossarian", 256)
    val catchNo =
      new pilot.Catch(22) //using the pilot instance's path, create an catch object for it.
    println(catchNo.number)
  }
}
