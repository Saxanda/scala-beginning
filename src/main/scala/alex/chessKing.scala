package  alex
object chessKing{
  def main (args: Array[String]): Unit = {

    def isInRange(x: Int) = x >= 0 && x <= 7
    def isOnBoard(loc: String) = isInRange(loc(0) - 'a') && isInRange(loc(1) - '1')
    def move1(c: Char, delta: Int) = (c + delta).toChar.toString                    // move1('a', 5) => "f"
    def move(loc: String, dx: Int, dy: Int) = move1(loc(0), dx) + move1(loc(1), dy) // move("a3", 1, 1) => "b4"
    val deltas = List(1, 2).flatMap(x => List(-x, x))                               // List(-1, 1, -2, 2)
    def moves(loc: String) =
      deltas
        .flatMap(dx => deltas.map(dy => (dx, dy)))
        .filter { case (dx, dy) => math.abs(dx) != math.abs(dy) }
        .map { case (dx, dy) => move(loc, dx, dy) }
        .filter(pos => isOnBoard(pos))

    moves("b2").foreach(println)
  }
}
