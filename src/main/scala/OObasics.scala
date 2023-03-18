/*
* Just dumy to create objects of class to run
object OObasics extends App{
  val objOfCar = new Car("Car")
  println(objOfCar.move)
  val objOfAeroplane = new Aeroplane("Aeroplane")
  println(objOfAeroplane.move)
  val objOfBoat = new Boat("Boat")
  println(objOfBoat.move)
  val objOfFlyingCar = new FlyingCars
  println(objOfFlyingCar.move)
  val objOfHovercraft = new Hovercraft
  println(objOfHovercraft.move)
}
*/
// Vehicle trait which contain move method
trait Vehicle {
  def move: String
}

// classes extending Vehicle trait
case class Car(name: String) extends Vehicle {
  override def move: String = s"$name can be driven"

}

case class Aeroplane(aeroName: String) extends Vehicle {
  override def move: String = s"$aeroName can be Flown"
}

case class Boat(boatName: String) extends Vehicle {
  override def move: String = s"$boatName can be Sailed"
}

// class FlyingCars extends Aeroplane class with vehicle trait
class FlyingCars extends Aeroplane("Flying car") with Vehicle {
  override def move: String = "Flying cars can fly and run on roads"
}

class Hovercraft extends Boat("Hovercraft") with Vehicle {
  override def move: String = "Hovercraft can be sailed and moved"
}