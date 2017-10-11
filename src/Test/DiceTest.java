package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import Spil.Dice;

public class DiceTest {

Dice testDice = new Dice();
	
	@Test
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
		
		System.out.println("2: " + twoCount + " ~ " + (double)twoCount/1000*100);  
		System.out.println("3: " + threeCount + " ~ " + (double)threeCount/1000*100); 
		System.out.println("4: " + fourCount + " ~ " + (double)fourCount/1000*100);  
		System.out.println("5: " + fiveCount + " ~ " + (double)fiveCount/1000*100);  
		System.out.println("6: " + sixCount + " ~ " + (double)sixCount/1000*100);   
		System.out.println("7: " + sevenCount + " ~ " + (double)sevenCount/1000*100);
		System.out.println("8: " + eightCount + " ~ " + (double)eightCount/1000*100);
		System.out.println("9: " + nineCount + " ~ " + (double)nineCount/1000*100);
		System.out.println("10: " + tenCount + " ~ " + (double)tenCount/1000*100);
		System.out.println("11: " + elevenCount + " ~ " + (double)elevenCount/1000*100);
		System.out.println("12: " + twelveCount + " ~ " + (double)twelveCount/1000*100);
		
		
		boolean twoTrue = false, threeTrue = false, fourTrue = false, fiveTrue = false, sixTrue = false, sevenTrue = false, eightTrue = false,
				nineTrue = false, tenTrue = false, elevenTrue = false, twelveTrue = false;
		
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
		fail("Not yet implemented");
	}

	@Test
	public void testGetEns() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetSum() {
		fail("Not yet implemented");
	}

}
