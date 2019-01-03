package example

object Main extends App {
  val calculator = new Calculator()
  var a:Int = 10
  var b:Int = 20
  var res = calculator.add(a, b)
  res = calculator.substract(res,a)
  res = calculator.substract(res,b)
  println(res)
}

class Calculator(var x:Int = 0, var y:Int = 0) {
  def add (a:Int, b:Int): Int = {
    return a+b
  }

  def substract (a:Int, b:Int): Int = {
    return a-b
  }

  def multiply (a:Int, b:Int): Int = {
    return a*b
  }
}