
package Spil;

public class Dice {

	private int dice1;
	private int dice2;
	private int sum;	
	
	public void rollDice() {
		dice1 = (int)(Math.random()*6) + 1; //Terning 1 sættes til at være 1-6
		dice2 = (int)(Math.random()*6) + 1; //Terning 2 sættes til at være 1-6
		diceSum(dice1, dice2);
	}
	
	public void diceSum(int value1, int value2) {
		sum = value1 + value2; //Finder summen af de to terninger
	}

	public boolean getEns() {
		if(dice1 == dice2) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public int getSum() {
		return sum;
	}
	
}
