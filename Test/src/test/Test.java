package test;

public class Test {

	public static void main(String[] args) {

		int[][] twoDArray = new int[5][10];

		for (int i = 0; i < twoDArray.length; i++) {

			for (int j = 0; j < twoDArray[i].length; j++) {
				System.out.print(twoDArray[i][j]);

			}
			System.out.println();

		}
	}
}
