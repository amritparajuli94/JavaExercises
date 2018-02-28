package day3;

import java.util.ArrayList;

public class DoggoCompetition {

	public static void main(String[] args) {
		System.out.println(toString(25));
	}

	public static ArrayList<String> makeList(int x) {

		ArrayList<String> places = new ArrayList<String>();
		String ending;
		for (int i = 1; i <= 100; i++) {
			if (i == x) {
				continue;
			}
			switch (i) {
			case 11: {
				ending = "th";
				break;
			}
			case 12: {
				ending = "th";
				break;
			}
			case 13: {
				ending = "th";
				break;
			}

			default: {
				switch (i % 10) {
				case 1: {
					ending = "st";
					break;
				}
				case 2: {
					ending = "nd";
					break;
				}
				case 3: {
					ending = "rd";
					break;
				}
				default: {
					ending = "th";
					break;
				}
				}
			}
			}
			if (i == 1) {
				places.add(i + ending);

			} else {
				places.add(", " + i + ending);
			}

		}
		return places;

	}

	public static String toString(int y) {
		ArrayList<String> list = makeList(y);
		String results = "";
		for (String a : list) {
			results = results + a;
		}
		return results;

	}
}
