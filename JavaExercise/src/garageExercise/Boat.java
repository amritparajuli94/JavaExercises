package garageExercise;

public class Boat extends Vehicle {
	public int propeller;

	public Boat(double price, int id, int engine, String colour, int propeller) {
		super(price, id, engine, colour);
		this.propeller = propeller;
	}

	public String toString() {
		return "Vehicle ID is " + id + " " + "has an engine size of = " + engine + "cc." + " " + "Vehicle is " + colour
				+ " " + "colour" + " " + "and has " + propeller + " " + "propeller." + " "
				+ "Total Bill for this vehicle is " + price + "per day.";
	}

}
