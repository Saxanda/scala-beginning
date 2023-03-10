package app.book.objects

trait Shape {
 def  side:Int
  def perimeter : Double
  def area: Double

}
case class Circle(radius: Double) extends Shape {
  val side = 1
  val perimeter =2*math.Pi*radius
  val area = math.Pi*radius*radius
}

case class Rectangle(width:Double, height:Double) extends Shape{
  val side = 4
  val perimeter = 2*width+2*height
  val area =width*height
}
case class Square(size:Double) extends Shape{
  val side=4
  val perimeter = 4*size
  val area = size*size
}