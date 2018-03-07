package rpc;

import java.util.ArrayList;

public class GameData {

	public static ArrayList<String> score = new ArrayList<String>();

	public static void inputData(String result) {
		score.add(result);

	}

	public static void displayData() {
		float totalGamesPlayed = 0;
		float winCounter = 0;
		int drawCounter = 0;

		for (String s : score) {
			totalGamesPlayed++;
			if (s.equals("win")) {
				winCounter = winCounter + 1;
			}
			if (s.equals("draw")) {
				drawCounter = drawCounter + 1;
			}
		}
		float aiWinCounter = totalGamesPlayed - winCounter - drawCounter;
		float winPercentage1 = (winCounter / totalGamesPlayed) * 100;

		System.out.println("Total games played : " + (int) totalGamesPlayed);
		System.out.println("Total wins of the player : " + (int) winCounter);
		System.out.println("Total win of the player is " + (int) winPercentage1 + "%");
		System.out.println("Total wins to the AI is " + (int) aiWinCounter);
		System.out.println("Total draws in the game are " + (int) drawCounter);
	}
}