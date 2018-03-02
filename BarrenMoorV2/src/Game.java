public class Game {
	int[][] Grid = new int[8][8];
	String[] Move = new String[4];
	int farMoved;
	int[][] grid = new int[8][8];

	public void grid() {
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				this.grid[i][j] = 0;
			}

		}
	}

	public void showGrid() {
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				System.out.print(this.grid[i][j]);
			}
			System.out.println();

		}
	}

	public int[] playerPosition() {
		int[] playerPosition = new int[2];
		playerPosition[0] = (int) (10 * Math.random());
		playerPosition[1] = (int) (10 * Math.random());
		this.grid[playerPosition[0]][playerPosition[1]] = 4;
		return playerPosition;
	}

	public int[] addTreasure(int[] playerPosition) {
		int[] treasurePosition = new int[2];
		do {
			treasurePosition[0] = (int) (10 * Math.random());
			treasurePosition[1] = (int) (10 * Math.random());
		} while (treasurePosition[0] == playerPosition[0] && treasurePosition[1] == playerPosition[1]);
		this.grid[treasurePosition[0]][treasurePosition[1]] = 7;
		return treasurePosition;

	}

	public void askdirection(int[] playerPosition) {

		int i = 0;
		do {
			System.out.println("Enter the direction that you wish to move.'North' 'East' 'South' 'West'");
			String scan = Input.sc.nextLine();

			if (scan.equals("north")) {
				this.grid[playerPosition[0]][playerPosition[1]] = 0;
				playerPosition[0] = playerPosition[0] - 1;
				this.grid[playerPosition[0]][playerPosition[1]] = 4;
				showGrid();

			} else if (scan.equals("south")) {
				this.grid[playerPosition[0]][playerPosition[1]] = 0;
				playerPosition[0] = playerPosition[0] + 1;
				this.grid[playerPosition[0]][playerPosition[1]] = 4;
				showGrid();

			} else if (scan.equals("east")) {
				this.grid[playerPosition[0]][playerPosition[1]] = 0;
				playerPosition[1] = playerPosition[1] + 1;
				this.grid[playerPosition[0]][playerPosition[1]] = 4;
				showGrid();

			} else if (scan.equals("west")) {
				this.grid[playerPosition[0]][playerPosition[1]] = 0;
				playerPosition[1] = playerPosition[1] - 1;
				this.grid[playerPosition[0]][playerPosition[1]] = 4;
				showGrid();

			}
			if (playerPosition == addTreasure(playerPosition)) {
				System.out.println("You Have WON!!!!!!");
			}

		} while (i == 0);

	}

	public void gameOver(int[] playerPosition, int[] treasurePosition) {
		if (playerPosition == treasurePosition) {
			System.out.println("You Have WON!!!!!!");
		}
	}

}
