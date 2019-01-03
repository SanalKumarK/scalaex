package example

object AppClass extends App {
  var iterator:IntIterator = new IntIterator(10)
  while(iterator.hasNext()) {
    println(iterator.next())
  }
}