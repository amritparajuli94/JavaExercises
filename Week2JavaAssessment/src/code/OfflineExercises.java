package code;

public class OfflineExercises {

	// Given a string, return a string where
	// for every char in the original,
	// there are two chars.

	// doubleChar("The") → "TThhee"
	// doubleChar("AAbb") → "AAAAbbbb"
	// doubleChar("Hi-There") → "HHii--TThheerree"

	public String doubleChar(String str) {
		String s = "";

		for (int i = 0; i < str.length(); i++) {
			s = s + str.charAt(i) + str.charAt(i);
		}

		return s;
	}
	//
	// A sandwich is two pieces of bread with something in between. Return the
	// string that is between the first and last appearance of "bread" in the
	// given string, or return the empty string "" if there are not two pieces
	// of bread.

	// getSandwich("breadjambread") → "jam"
	// getSandwich("xxbreadjambreadyy") → "jam"
	// getSandwich("xxbreadyy") → ""

	public String getSandwich(String str) {

		int firstWord = -1;
		int lastWord = -1;
		for (int i = 0; i < str.length() - 5; i++) {
			if (str.substring(i, i + 5).equals("bread")) {
				firstWord = i;
				break;
			}
		}
		for (int i = str.length() - 5; i >= 0; i--) {
			if (str.substring(i, i + 5).equals("bread")) {
				lastWord = i;
				break;
			}
		}
		if (firstWord != -1 && lastWord != -1 && firstWord != lastWord)
			return str.substring(firstWord + 5, lastWord);
		return "";
	}

	// Given three ints, a b c, one of them is small, one is medium and one is
	// large. Return true if the three values are evenly spaced, so the
	// difference between small and medium is the same as the difference between
	// medium and large.

	// evenlySpaced(2, 4, 6) → true
	// evenlySpaced(4, 6, 2) → true
	// evenlySpaced(4, 6, 3) → false

	public boolean evenlySpaced(int a, int b, int c) {
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		if (a == b && a == c)
			return true;

		if (a == b || b == c || a == c)
			return false;

		num1 = Math.abs(a - b);
		num2 = Math.abs(a - c);
		num3 = Math.abs(b - c);

		if ((num1 == num2) || (num1 == num3) || (num2 == num3))
			return true;

		return false;
	}

	// Given a string and an int n, return a string made of the first and last n
	// chars from the string. The string length will be at least n.

	// nTwice("Hello", 2) → "Helo"
	// nTwice("Chocolate", 3) → "Choate"
	// nTwice("Chocolate", 1) → "Ce"

	public String nTwice(String input, int a) {
		return (input.substring(0, a) + input.substring(input.length() - a));

	}

	// Given a string, return true if it ends in "ly".

	// endsLy("oddly") → true
	// endsLy("y") → false
	// endsLy("oddy") → false

	public boolean endsly(String input) {
		return false;
	}

	// Given a string, return recursively a "cleaned" string where adjacent
	// chars that are the same have been reduced to a single char. So "yyzzza"
	// yields "yza".

	// stringClean("yyzzza") → "yza"
	// stringClean("abbbcdd") → "abcd"
	// stringClean("Hello") → "Helo"
	public String stringClean(String input) {
		return "";
	}

	// The fibonacci sequence is a famous bit of mathematics, and it happens to
	// have a recursive definition. The first two values in the sequence are 0
	// and 1 (essentially 2 base cases). Each subsequent value is the sum of the
	// previous two values, so the whole sequence is: 0, 1, 1, 2, 3, 5, 8, 13,
	// 21 and so on. Define a recursive fibonacci(n) method that returns the nth
	// fibonacci number, with n=0 representing the start of the sequence.

	// fibonacci(0) → 0
	// fibonacci(1) → 1
	// fibonacci(2) → 1

	public int fibonacci(int input) {

		return -1;
	}

	// We have a number of bunnies and each bunny has two big floppy ears. We
	// want to compute the total number of ears across all the bunnies
	// recursively (without loops or multiplication).
	//
	// bunnyEars(0) → 0
	// bunnyEars(1) → 2
	// bunnyEars(2) → 4

	public int bunnyEars(int input) {
		if (input == 0) {
			return 0;

		}
		if (input == 1) {
			return 2;

		}
		return 2 + bunnyEars(input - 1);
	}

}
