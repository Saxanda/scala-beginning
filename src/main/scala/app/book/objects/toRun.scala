package app.book.objects

object toRun {


  def main(args: Array[String]) = {
    //val anon = app.book.traits.Anonymous("anon1")
    divide(1, 0) match {
      case Finite(value) => s"It's finite: ${value}"
      case Infinite => s"It's infinite"
    }
  }
}
