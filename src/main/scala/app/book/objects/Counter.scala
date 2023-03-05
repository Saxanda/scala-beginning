package app.book.objects

class Adder(amount: Int) {
  def add(in: Int) = in + amount
}
class Counter(val count: Int) {
  def dec = new Counter(count - 1)
  def inc = new Counter(count + 1)
  def adjust(adder: Adder) =
    new Counter(adder.add(count))
}
//new app.book.objects.Counter(10).inc.dec.inc.inc.count