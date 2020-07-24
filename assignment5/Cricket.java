package assignment5;

public abstract class Cricket {
	 int maxOvers;
	 int targetScore;
	 int currentOver;
	 int currentScore;
	
	public int getMaxOvers() {
		return maxOvers;
	}
	public void setMaxOvers(int maxOvers) {
		this.maxOvers = maxOvers;
	}
	public int getTargetScore() {
		return targetScore;
	}
	public void setTargetScore(int targetScore) {
		this.targetScore = targetScore;
	}
	
	public int getCurrentOver() {
		return currentOver;
	}
	public void setCurrentOver(int currentOver) {
		this.currentOver = currentOver;
	}
	public int getCurrentScore() {
		return currentScore;
	}
	public void setCurrentScore(int currentScore) {
		this.currentScore = currentScore;
	}
	public Cricket(int targetScore1, int maxOver1) {
		this.targetScore=targetScore1;
		this.maxOvers=maxOver1;
	}
	public abstract double calcCurrentRunrate();
	public abstract double calcReqdRunrate();

}
