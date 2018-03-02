public class Main {

	public static void main(String[] args) {
		Main a = new Main();

		a.lookMet();

		Game newGrid = new Game();

		newGrid.grid();
		int[] playerPosition = newGrid.playerPosition();
		int[] treasurePosition = newGrid.addTreasure(playerPosition);

		newGrid.showGrid();
		newGrid.askdirection(playerPosition);
		newGrid.gameOver(playerPosition, treasurePosition);

	}

	public void lookMet() {
		System.out.println("Press Enter to start the game.");
		String scan = Input.sc.nextLine();
		if (scan.equals("LOOK")) {
			System.out.println(
					"Welcome to the Barren Moor. You just woke up and found yourself in the middle of the grey swamp.");
			System.out.println("");

		}
	}
}
