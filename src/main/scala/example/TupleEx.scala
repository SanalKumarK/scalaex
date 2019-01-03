package example

object TupleEx extends App {
  val ingredient = ("Sugar",25):Tuple2[String, Int]
  val t1 = ("Sugar",25)

  var tupleList = List(("Sugar",2.5),("Milk",3),("Onion",2),("Tomator",1),("Rice",10))

  /*println(ingredient._1)
  println(t1._1)
  println(tupleList(0)._1)*/

  tupleList.foreach ( tuple => {
    val (name, quantity) = tuple
    tuple match {
      case ("Sugar", qty) => println(s"Sugar - ${quantity} Kg")

      case p if(p._1 == "Milk") => println(s"Milk is ${p._2} packets")

      case _ => println("Not Available")
    }
  })
}
