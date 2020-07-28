package cricketscoreanalyzer;

import java.util.Collections;
import java.util.LinkedList;

public class ScoreAnalyzer {
	private LinkedList<Integer> runsData = new LinkedList<>();

	public ScoreAnalyzer(LinkedList<Integer> runsDate) {
		super();
		this.runsData = runsData;
	}
	public ScoreAnalyzer() {
		
	}
	boolean addRunsToList(int runs) {
		return runsData.add(runs);
	}
	public float calcRunRate() {
		float runscored=0.0f;
		for(int i=0;i<runsData.size();i++)
		{
			 runscored+= runsData.get(i);
		}
		return runscored/50;
		
	}
	public double lowestRunsScored() {
		return (Collections.min(runsData));
	}
	public void displayRuns() {
		for(int i : runsData) {
			System.out.println(runsData.indexOf(i)+"-"+i);
			
		}
	}

}
