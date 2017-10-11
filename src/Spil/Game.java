package Spil;

import java.io.IOException;
import java.util.Scanner;

import Spil.Player;

public class Game {

	static int turn = 0;
	static int[] playerScores = { 0, 0 };
	static Dice diceGame = new Dice();
	static Player Player1, Player2;
	
	public static void main(String[] args) {
		
		Scanner name = new Scanner(System.in);
		
		System.out.println("Spiller 1 vælger sit navn");
		Player1 = new Player(name.nextLine());

		System.out.println("Spiller 2 vælger sit navn");
		Player2 = new Player(name.nextLine());
		
		
		
		System.out.println("Tryk [ENTER] for at starte spillet");
		pressEnter();
		
		while(playerScores[0] < 40 && playerScores[1] < 40) {
			nextTurn(turn);
			pressEnter();
		}		

		showScore();
		
		if(playerScores[0] > playerScores[1]) {
			System.out.println( Player1.getName()  + " vandt med " + playerScores[0] + " point!");
		} else {
			System.out.println( Player2.getName()  + " vandt med " + playerScores[1] + " point!");
		}

	}
	
	public static void nextTurn(int turn) {
		if(turn % 2 == 0) {
			diceGame.rollDice();
			System.out.print( Player1.getName()  + " slog: " + diceGame.getSum());
			playerScores[0] += diceGame.getSum();
			
		} else {
			diceGame.rollDice();
			System.out.println(Player2.getName()  + " slog: " + diceGame.getSum());
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
		System.out.print( Player1.getName()  + ": " + playerScores[0]);
		System.out.print(" | ");
		System.out.print( Player2.getName()  + ": " + playerScores[1]);
		System.out.println();
		System.out.println("-------------------------------------");
	}
	
	public static void pressEnter() {
		Scanner input = new Scanner(System.in);
		input.hasNextLine();
	}

}