
public class UniqueNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(uniqueNumbersMethod(6, 6, 6));
	}

	private static int uniqueNumbersMethod(int x, int y, int z) {

		if (x != y & y != z & x != z) {
			return x + y + z;
		} else if (x == y) {
			return z;
		} else if (y == z) {
			return x;
		} else if (x == z) {
			return y;
		} else
			return 0;

	}

}
