package garageExercise;

public class Motorcycle extends Vehicle {
	public int stroke;

	public Motorcycle(int id, int engine, String colour, int stroke) {
		super(id, engine, colour);
		this.stroke = stroke;
	}

	public String toString() {
		return "Vehicle ID is = " + id + " " + "has an engine size of = " + engine + "cc." + " " + "Vehicle is "
				+ colour + " " + "colour" + " " + " and has" + " " + stroke + " strokes.";
	}

}
