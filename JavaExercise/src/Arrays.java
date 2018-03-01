
public class Arrays {

	public static void main(String[] args) {

		int[] value = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		System.out.println(value[5]);

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
