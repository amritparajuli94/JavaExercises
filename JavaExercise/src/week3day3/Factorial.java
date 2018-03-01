package week3day3;

public class Factorial {

	public static void main(String[] args) {
		reverseFactorial(120);
	}

	public static void reverseFactorial(int input) {
		if (input == 0)
			System.out.println(input + " = 1!");
		if (input == 1)
			System.out.println(input + " = 1!");
		if (input == 2)
			System.out.println(input + " = 2!");

		int i = 2;
		int a = input + 1;
		a -= 1;

		while (i < a) {
			a = a / i;
			if (a == i + 1) {
				System.out.println(input + " = " + a + "!");
				break;
			}
			i++;
		}

		if (i > a) {
			System.out.println(input + " NONE");
		}

	}

}