package example

object ClassAccessEx {
  def main(args: Array[String]): Unit  = {

    println("OM Maha Ganeshaya Namaha")
    println("OM Maha Ganeshaya Namaha")
    println("OM Maha Ganeshaya Namaha")

    var a = new A()
    println(a.x)
    a.x_(5)
    println(a.x)
    println(a.str)
    a.str_("OOOM OOM OOM")
    println(a.str)
  }
}

class A {
  private var _x = 0
  private var _str = "Om Maha Ganeshaya Namaha"

  def x = _x
  def x_ (newValue: Int):Unit = {
    _x = newValue
  }

  def str:String = _str
  def str_ (newStr:String): Unit = {
    _str = newStr
  }
}