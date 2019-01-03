package example

class IntIterator (max: Int) extends Iterator[Int] {

  var count:Int = 0

  override def hasNext(): Boolean = count < max

  override def next(): Int = {
    if(hasNext) {
      count=count+1
      return count
    }
    throw new NullPointerException()
  }
}

trait Iterator[A] {
  def hasNext:Boolean
  def next():A
}

