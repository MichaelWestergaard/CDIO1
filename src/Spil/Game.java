package Spil;

import java.io.IOException;

public class Game {

	static int turn = 0;
	static int[] playerScores = { 0, 0 };
	static Dice diceGame = new Dice();
	
	public static void main(String[] args) {
		
		System.out.println("Tryk [ENTER] for at starte spillet");
		pressEnter();
		
		while(true) {

			if(playerScores[0] > 40 || playerScores[1] > 40) {
				break;
			}		
			 
			nextTurn(turn);
			pressEnter();
		}		

		showScore();
		
		if(playerScores[0] > playerScores[1]) {
			System.out.println("Spiller 1 vandt med " + playerScores[0] + " point!");
		} else {
			System.out.println("Spiller 2 vandt med " + playerScores[1] + " point!");
		}

	}
	
	public static void nextTurn(int turn) {
		if(turn % 2 == 0) {
			diceGame.rollDice();
			System.out.println("Spiller 1 slog: " + diceGame.getSum());
			playerScores[0] += diceGame.getSum();
			
		} else {
			diceGame.rollDice();
			System.out.println("Spiller 2 slog: " + diceGame.getSum());
			playerScores[1] += diceGame.getSum();

			showScore();
			System.out.println();
			System.out.println("Tryk [ENTER] for at gå til næste runde");
		}
		Game.turn++;
	}

	public static void showScore() {

		System.out.println("-------------------------------------");
		System.out.println("Score:");
		System.out.print("Spiller 1: " + playerScores[0]);
		System.out.print(" | ");
		System.out.print("Spiller 2: " + playerScores[1]);
		System.out.println();
		System.out.println("-------------------------------------");
	}
	
	public static void pressEnter() {
		try {
			System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}