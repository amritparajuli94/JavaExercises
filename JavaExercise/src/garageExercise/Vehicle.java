package garageExercise;

public abstract class Vehicle {

	public double price;
	public int id;
	public int engine;
	public String colour;

	public Vehicle(double price, int id, int engine, String colour) {
		this.price = price;
		this.id = id;
		this.engine = engine;
		this.colour = colour;
	}

}
