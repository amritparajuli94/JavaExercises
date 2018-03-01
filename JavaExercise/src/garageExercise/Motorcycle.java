package garageExercise;

public class Motorcycle extends Vehicle {
	public int stroke;

	public Motorcycle(double price, int id, int engine, String colour, int stroke) {
		super(price, id, engine, colour);
		this.stroke = stroke;
	}

	public String toString() {
		return "Vehicle ID is " + id + " " + "has an engine size of = " + engine + "cc." + " " + "Vehicle is " + colour
				+ " " + "colour" + " " + " and has" + " " + stroke + " strokes." + " "
				+ "Total Bill for this vehicle is " + price + "per day.";
	}

}
