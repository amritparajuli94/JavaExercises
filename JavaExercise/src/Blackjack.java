
public class Blackjack {

	public static void main(String[] args) {

		System.out.println(blackJackMethod(21, 25));

	}

	private static int blackJackMethod(int x, int y) {
		// if x greater than y and less than 21 return x
		if (x > y & x <= 21) {
			return x;
			// if y greater than x and less than 21 return y
		} else if (x < y & y <= 21) {
			return y;
		}

		else {
			// else return 0
			return 0;
		}

	}

}
