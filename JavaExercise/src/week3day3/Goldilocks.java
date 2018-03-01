package week3day3;

import java.util.ArrayList;

public class Goldilocks {

	public static void main(String[] args) {
		ArrayList<Integer> test = new ArrayList<Integer>();

		test.add(100);
		test.add(120);
		test.add(297);
		test.add(90);
		test.add(66);
		test.add(110);
		test.add(257);
		test.add(113);
		test.add(276);
		test.add(191);
		test.add(280);
		test.add(129);
		test.add(219);
		test.add(163);
		test.add(254);
		test.add(193);
		test.add(86);
		test.add(153);
		test.add(206);
		test.add(147);
		test.add(276);
		test.add(191);
		test.add(280);
		test.add(129);
		test.add(219);
		test.add(163);
		test.add(254);
		test.add(193);
		test.add(86);
		test.add(153);
		test.add(206);
		test.add(147);

		test.add(71);
		test.add(137);
		test.add(104);
		test.add(40);
		test.add(238);
		test.add(127);
		test.add(52);
		test.add(146);
		test.add(129);
		test.add(197);
		test.add(144);
		test.add(59);
		test.add(157);
		test.add(124);
		test.add(210);
		test.add(59);
		test.add(11);
		test.add(54);
		test.add(268);
		test.add(119);
		test.add(261);
		test.add(121);
		test.add(12);
		test.add(189);
		test.add(186);
		test.add(108);
		test.add(174);
		test.add(21);
		test.add(77);
		test.add(18);
		test.add(54);
		test.add(90);
		test.add(174);
		test.add(52);
		test.add(16);
		test.add(129);
		test.add(59);
		test.add(181);
		test.add(290);
		test.add(123);
		test.add(248);
		test.add(132);

		System.out.println(numbers(test));
	}

	public static boolean seatTester(int goldW, int goldT, int seatW, int seatT) {
		if (goldW <= seatW && goldT >= seatT)
			return true;
		else {
			return false;
		}
	}

	public static String numbers(ArrayList<Integer> input) {

		int goldW = input.get(0);
		int goldT = input.get(1);
		String seats = "";
		for (int position = 2; position < input.size(); position += 2) {
			if (seatTester(goldW, goldT, input.get(position), input.get(position + 1))) {
				seats += (position) / 2 + " ";
			}
		}

		return seats;
	}

}
