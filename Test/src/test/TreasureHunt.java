package test;

import java.util.Scanner;

public class TreasureHunt {

	/** The treasure array. */
	private int[][] treasureArray;

	/** The Constant treasureArraySize. */
	private static final int treasureArraySize = 5;

	/** The input. */
	Scanner input;

	/**
	 * Fill tresure array with user input.
	 */
	private void fillTresureArray() {
		System.out.println("Enter the tresure array (5x5) separated by spaces: ");
		for (int i = 0; i < treasureArraySize; i++) {
			for (int j = 0; j < treasureArraySize; j++) {
				// System.out.println("Enter value for ["+(i+1)+"]"+" ["+(j+1)+"]: ");
				treasureArray[i][j] = input.nextInt();
			}
		}
	}

	/**
	 * Find treasure.
	 */
	private void findTreasure() {
		boolean found = false;
		int currentCellRow = 0;
		int currentCellCol = 0;
		while (!found) {
			System.out.println("Currently in row " + (currentCellRow + 1) + " col " + (currentCellCol + 1));
			int value = treasureArray[currentCellRow][currentCellCol];
			int nextCellCol = value % 10 - 1;
			value /= 10;
			int nextCellRow = value % 10 - 1;
			if (nextCellCol == currentCellCol && nextCellRow == currentCellRow) {
				System.out.println("Treasure found");
				found = true;
			} else {
				currentCellCol = nextCellCol;
				currentCellRow = nextCellRow;
			}

		}
	}

	/**
	 * Instantiates a new treasure hunt.
	 */
	TreasureHunt() {
		input = new Scanner(System.in);
		treasureArray = new int[treasureArraySize][treasureArraySize];
		fillTresureArray();
		findTreasure();
	}

	/**
	 * The main method.
	 *
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		new TreasureHunt(); // Creating object
	}

}
