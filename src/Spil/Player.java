package Spil;

public class Player {

	public String name;
	int score = 0;

	public Player (String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public int getScore() {
		return score;
	}
	
	public void addPoints(int score) {
		this.score += score;
	}

}