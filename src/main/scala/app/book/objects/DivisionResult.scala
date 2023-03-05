package app.book.objects

sealed trait DivisionResult
final case class Finite(value: Int) extends DivisionResult
case object Infinite extends DivisionResult

object divide {
  def apply(num: Int, den: Int): DivisionResult =
    if(den == 0) Infinite else Finite(num / den)
}

//app.book.objects.divide(1, 0) match {
//  case app.book.objects.Finite(value) => s"It's finite: ${value}"
//  case app.book.objects.Infinite      => s"It's infinite"
//}