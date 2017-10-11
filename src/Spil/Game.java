package Spil;

import java.io.IOException;
import java.util.Scanner;

import Spil.Player;

public class Game {

	static int turn = 0;
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
		
		while(Player1.getScore() < 40 && Player2.getScore() < 40) {
			nextTurn(turn);
			pressEnter();
		}		

		showScore();
		
		if(Player1.getScore() > Player2.getScore()) {
			System.out.println( Player1.getName()  + " vandt med " + Player1.getScore() + " point!");
		} else {
			System.out.println( Player2.getName()  + " vandt med " + Player2.getScore() + " point!");
		}

	}
	
	public static void nextTurn(int turn) {
		if(turn % 2 == 0) {
			diceGame.rollDice();
			System.out.print( Player1.getName()  + " slog: " + diceGame.getSum());
			Player1.addPoints(diceGame.getSum());
			
		} else {
			diceGame.rollDice();
			System.out.println(Player2.getName()  + " slog: " + diceGame.getSum());
			Player2.addPoints(diceGame.getSum());

			showScore();
			System.out.println();
			System.out.println("Tryk [ENTER] for at gå til næste runde");
		}
		Game.turn++;
	}

	public static void showScore() {

		System.out.println("-------------------------------------");
		System.out.println("Score:");
		System.out.print( Player1.getName()  + ": " + Player1.getScore());
		System.out.print(" | ");
		System.out.print( Player2.getName()  + ": " + Player2.getScore());
		System.out.println();
		System.out.println("-------------------------------------");
	}
	
	public static void pressEnter() {
		Scanner input = new Scanner(System.in);
		input.hasNextLine();
	}

}