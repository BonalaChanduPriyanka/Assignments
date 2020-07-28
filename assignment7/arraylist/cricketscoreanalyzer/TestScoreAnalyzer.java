package cricketscoreanalyzer;

import java.util.*;

public class TestScoreAnalyzer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ScoreAnalyzer sc = new ScoreAnalyzer();
		Scanner scan = new Scanner(System.in);
		System.out.println("enter no of batsmens");
		int batsmen = scan.nextInt();
		
		System.out.println("enter runs");
		
		for (int i = 0; i < batsmen; i++) {
			
			sc.addRunsToList(scan.nextInt());
		}

		sc.displayRuns();
		System.out.println("RunRate :" + sc.calcRunRate()+"\t");
		System.out.println("LowestRunsScored :" + sc.lowestRunsScored());
		System.out.println("noofbatsmens :" + batsmen);

	}

}
