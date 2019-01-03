package example

object Factorial extends App{

  def factorial(x: Int): Int = {
    def fact(x:Int, acc:Int):Int = {
      if(x <= 1) acc
      else fact(x-1, acc * x)
    }
    fact(x,1)
  }

  println(factorial(5))
}


