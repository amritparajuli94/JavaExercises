package garageExercise;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		ArrayList<Vehicle> vehicle = new ArrayList<>();

		Car c = new Car(2, 1339, "White", 5);
		Motorcycle m = new Motorcycle(1, 125, "Blue", 4);
		Boat b = new Boat(3, 1800, "Orange", 1);

		vehicle.add(c);
		vehicle.add(m);
		vehicle.add(b);

		for (int i = 0; i < vehicle.size(); i++) {
			System.out.println(vehicle.get(i));
		}

	}

}
