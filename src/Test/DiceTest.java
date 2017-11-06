package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import Spil.Dice;

public class DiceTest {

	Dice testDice = new Dice();
	
	@Test	//Test af 'raflebægeret' (diceRoll funktionen) hen over 1000 kast,
			//samt hvorvidt de stemmer overens med den teoretiske sandsynlighed.
	public void diceRollTest() {
		int[] rolls = new int[1000];
		int twoCount = 0, threeCount = 0, fourCount = 0, fiveCount = 0, sixCount = 0, sevenCount = 0, eightCount = 0, nineCount = 0,
			tenCount = 0, elevenCount = 0, twelveCount = 0;
		
		for (int i = 0; i < 1000; i++) {
			
			testDice.rollDice();
			rolls[i] = testDice.getSum();
			switch(rolls[i]) {
			case 2:
				twoCount++;
				break;
			case 3:
				threeCount++;
				break;
			case 4:
				fourCount++;
				break;
			case 5:
				fiveCount++;
				break;
			case 6:
				sixCount++;
				break;
			case 7:
				sevenCount++;
				break;
			case 8:
				eightCount++;
				break;
			case 9:
				nineCount++;
				break;
			case 10:
				tenCount++;
				break;
			case 11:
				elevenCount++;
				break;
			case 12:
				twelveCount++;
				break;
			}
		}
		
		System.out.println("2: " + twoCount + " ~ " + (double)twoCount/1000*100);			//Sandsynligheden bør være 2,78%
		System.out.println("3: " + threeCount + " ~ " + (double)threeCount/1000*100);		//Sandsynligheden bør være 5,56% 
		System.out.println("4: " + fourCount + " ~ " + (double)fourCount/1000*100);  		//Sandsynligheden bør være 8,33%
		System.out.println("5: " + fiveCount + " ~ " + (double)fiveCount/1000*100);  		//Sandsynligheden bør være 11,11%
		System.out.println("6: " + sixCount + " ~ " + (double)sixCount/1000*100);   		//Sandsynligheden bør være 13,89%
		System.out.println("7: " + sevenCount + " ~ " + (double)sevenCount/1000*100);		//Sandsynligheden bør være 16,67%
		System.out.println("8: " + eightCount + " ~ " + (double)eightCount/1000*100);		//Sandsynligheden bør være 13,89%
		System.out.println("9: " + nineCount + " ~ " + (double)nineCount/1000*100);			//Sandsynligheden bør være 11,11%
		System.out.println("10: " + tenCount + " ~ " + (double)tenCount/1000*100);			//Sandsynligheden bør være 8,33%
		System.out.println("11: " + elevenCount + " ~ " + (double)elevenCount/1000*100);	//Sandsynligheden bør være 5,56%
		System.out.println("12: " + twelveCount + " ~ " + (double)twelveCount/1000*100);	//Sandsynligheden bør være 2,78%
		
		
		boolean twoTrue = false, threeTrue = false, fourTrue = false, fiveTrue = false, sixTrue = false, sevenTrue = false, eightTrue = false,
				nineTrue = false, tenTrue = false, elevenTrue = false, twelveTrue = false;
		
		//Der er en tilladt afvigelse på 3% for sandsynligheden eftersom der altid vil være afvigelser, især med mindre værdier såsom 1000.
		
		if(twoCount >= 0 && twoCount <= 58) {
			twoTrue = true;
		}
		if(threeCount >= 26 && threeCount <= 86) {
			threeTrue = true;
		}
		if(fourCount >= 53 && fourCount <= 113) {
			fourTrue = true;
		}
		if(fiveCount >= 81 && fiveCount <= 141) {
			fiveTrue = true;
		}
		if(sixCount >= 109 && sixCount <= 169) {
			sixTrue = true;
		}
		if(sevenCount >= 137 && sevenCount <= 197) {
			sevenTrue = true;
		}
		if(eightCount >= 109 && eightCount <= 169) {
			eightTrue = true;
		}
		if(nineCount >= 81 && nineCount <= 141) {
			nineTrue = true;
		}
		if(tenCount >= 53 && tenCount <= 113) {
			tenTrue = true;
		}
		if(elevenCount >= 26 && elevenCount <= 86) {
			elevenTrue = true;
		}
		if(twelveCount >= 0 && twelveCount <= 58) {
			twelveTrue = true;
		}
		
		if(twoTrue == false || threeTrue == false || fourTrue == false || fiveTrue == false || sixTrue == false || sevenTrue == false ||
			eightTrue == false || nineTrue == false || tenTrue == false || elevenTrue == false || twelveTrue == false) {
			fail("Dice roll does not meet the requirements.");
		}

	}

	@Test
	public void testDiceSum() {
		//Test om diceSum metoden virker efter hensigten
		int dice1 = 5, dice2 = 2;
		
		int expected = dice1 + dice2;
		testDice.diceSum(dice1, dice2);
		int actual = testDice.getSum();
		
		assertEquals(expected, actual);
		
	}

	
	
	
	@Test	//Test af hvor ofte terningerne har samme værdi, samt hvorvidt antallet stemmer overens med den teoretiske sandsynlighed.
	public void testGetEns() {
		int ensCount = 0, forskelligCount = 0;
		
		for(int i=0; i < 1000; i++) {
			
			testDice.rollDice();
			boolean ens = testDice.getEns();
			
			if(ens == true) {
				ensCount++;
			}
			else{
				forskelligCount++;
			}
			
		}
		
		System.out.println("Ens: " + ensCount + " ~ " + (double)ensCount/1000*100); 						//Sandsynligheden bør være 16,67%
		System.out.println("Forskellig: " + forskelligCount + " ~ " + (double)forskelligCount/1000*100); 	//Sandsynligheden bør være 83,33%
		
		boolean ensTrue = false, forskelligTrue = false;
		
		//Tilladt afvigelse 3%.
		
		if(ensCount >= 137 && ensCount <= 197) {
			ensTrue = true;
		}
		if(forskelligCount >= 803 && forskelligCount <= 863) {
			forskelligTrue = true;
		}
		
		if(ensTrue == false || forskelligTrue == false) {
			fail("The probability doesn't match the expected value");
		}
		
	
		
		
	}

	@Test
	public void testGetSum() {
		
		int dice1 = 5, dice2 = 2;
		testDice.diceSum(dice1, dice2);
		
		int expected = 7;
		
		int actual = testDice.getSum();
		
		assertEquals(expected, actual);
	}

}
