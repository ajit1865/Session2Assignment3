import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper


class OObasicsTest extends AnyFlatSpec {
  // creating objects of class to get values from main function
  val objOfTest = Car("Car")
  val objOfHovercraft = new Hovercraft
  val objOfAeroplane = Aeroplane("Aeroplane")
  val objOfBoat = Boat("Boat")
  val objOfFlyingcars = new FlyingCars
  // testing test cases
  "test1" should "return the Specific output" in {
    objOfTest.move shouldEqual ("Car can be driven")
  }
  "test2" should "return the Specific output" in {
    objOfHovercraft.move shouldEqual ("Hovercraft can be sailed and moved")
  }
  "test3" should "return the Specific output" in {
    objOfAeroplane.move shouldEqual ("Aeroplane can be Flown")
  }
  "test4" should "return the Specific output" in {
    objOfBoat.move shouldEqual ("Boat can be Sailed")
  }
  "test5" should "return the Specific output" in {
    objOfFlyingcars.move shouldEqual ("Flying cars can fly and run on roads")
  }
}
