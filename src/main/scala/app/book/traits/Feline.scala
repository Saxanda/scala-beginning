package app.book.traits

trait Feline {

  def colour: String
  def sound: String
  //def sound: String = "roar"
}

      case class Lion(colour: String, maneSize: Int) extends Feline {
        val sound = "roar"
      }

      case class Tiger(colour: String) extends Feline {
        val sound = "roar"
      }

      case class Panther(colour: String) extends Feline {
        val sound = "roar"
      }

      case class Cat(colour: String, food: String) extends Feline {
        val sound = "meow"
      }
trait BigCat extends Feline {
  override val sound = "roar"
}

case class Tiger_BigCat(colour: String) extends BigCat
case class Lion_BigCat(colour: String, maneSize: Int) extends BigCat
case class Panther_BigCat(colour: String) extends BigCat