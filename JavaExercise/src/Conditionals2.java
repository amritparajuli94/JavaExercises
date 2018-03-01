
public class Conditionals2 {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++)
			System.out.println(exampleMethod(4, 0, false));

	}

	private static int exampleMethod(int x, int y, boolean yes) {

		if (y == 0) {
			return x;
		}
		if (yes == true) {
			return x + y;
		}

		else
			return x * y;

	}

}
