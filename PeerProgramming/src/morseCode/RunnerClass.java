package morseCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RunnerClass {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<>();

		map.put(".-", "a");
		map.put("-...", "b");
		map.put("-.-.", "c");
		map.put("-..", "d");
		map.put(".", "e");
		map.put("..-.", "f");
		map.put("--.", "g");
		map.put("....", "h");
		map.put("..", "i");
		map.put(".---", "j");
		map.put("-.-", "k");
		map.put(".-..", "l");
		map.put("--", "m");
		map.put("-.", "n");
		map.put("---", "o");
		map.put(".--.", "p");
		map.put("--.-", "q");
		map.put(".-.", "r");
		map.put("...", "s");
		map.put("-", "t");
		map.put("..-", "u");
		map.put("...-", "v");
		map.put(".--", "w");
		map.put("-..-", "x");
		map.put("-.--", "y");
		map.put("--..", "z");
		map.put(null, " ");

		String a = new String(" ");
		Scanner scan = new Scanner(System.in);
		a = scan.nextLine();

		String[] wordArray = a.split(" / ");

		for (String s : wordArray) {
			String[] wordArray2 = s.split(" ");
			for (String l : wordArray2) {
				System.out.print(map.get(l));
			}
			System.out.print(" ");
		}
	}
}
