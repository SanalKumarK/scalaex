package example

import scala.collection.mutable.{ArrayBuffer, ListBuffer}

object ClassInheritance extends App {

  val animalsArr = ArrayBuffer.empty[Animal]
  val animalsList = ListBuffer.empty[Animal]

  val dog = new Dog("WheelRower")
  val cat = new Dog("Persian")

  animalsArr.insert(0,dog)
  animalsArr.insert(1,cat)

  animalsList+=dog
  animalsList+=cat

  animalsArr.foreach(animal=>println(animal.name + "=>" + animal.sound()))
  animalsList.foreach(animal=>println(animal.name + "=>" + animal.sound()))

  println(animalsArr.indexOf(dog))
  println(animalsArr.lengthCompare(1))
}

trait Animal {
  var name:String
  def sound():String
}

class Dog(var name:String) extends Animal {
  override def sound(): String = {
    return "Bow Bow Bow"
  }
}


class Cat(var name:String) extends Animal {
  override def sound(): String = {
    return "Meow Meown MEeow"
  }
}