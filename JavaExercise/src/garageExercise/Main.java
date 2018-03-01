package garageExercise;

public class Main {

	public static void main(String[] args) {

		Car c = new Car(24.99, 2, 1339, "White", 5);
		Motorcycle m = new Motorcycle(14.99, 1, 125, "Blue", 4);
		Boat b = new Boat(34.99, 3, 1800, "Orange", 1);

		Garage.addVehicle(c);
		Garage.addVehicle(m);
		Garage.addVehicle(b);

		Garage.list();

	}

}
