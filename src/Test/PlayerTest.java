package Test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Spil.Player;

public class PlayerTest {

	Player testPlayer = new Player("Test");
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetName() {
		//Brug testPlayer.getName() og se om navnet er lig med "Test"
		//Brug assertEquals() for at tjekke testen
		//assert(expected, actual);
		fail("Not yet implemented");
	}

	@Test
	public void testGetScore() {
		//Brug testPlayer.addPoints(10) for at give spilleren 10 point
		//og så brug testPlayer.getScore() for at få scoren
		//Brug assertEquals() for at tjekke testen
		//assert(expected, actual);
		fail("Not yet implemented");
	}

	@Test
	public void testAddPoints() {
		//Brug testPlayer.addPoints(10) for at give spilleren 10 point
		//og så brug testPlayer.getScore() for at få scoren
		//Brug assertEquals() for at tjekke testen
		//assert(expected, actual);
		fail("Not yet implemented");
	}

}