package garageExercise;

import java.util.ArrayList;

public class Garage {

	static ArrayList<Vehicle> vehicle = new ArrayList<>();

	public static void addVehicle(Vehicle newVehicle) {
		vehicle.add(newVehicle);

	}

	public static void list() {
		for (Vehicle i : vehicle) {
			System.out.println(i);
		}
	}

}
