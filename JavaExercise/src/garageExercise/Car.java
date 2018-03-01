package garageExercise;

public class Car extends Vehicle {
	public int doorNumber;

	public Car(double price, int id, int engine, String colour, int doorNumber) {
		super(price, id, engine, colour);
		this.doorNumber = doorNumber;
	}

	public String toString() {
		return "Vehicle ID is = " + id + " " + "has an engine size of = " + engine + "cc." + " " + "Vehicle is "
				+ colour + " " + "colour" + " " + "and has" + " " + doorNumber + " doors." + " "
				+ "Total Bill for this vehicle is " + price + "per day.";
	}

}
