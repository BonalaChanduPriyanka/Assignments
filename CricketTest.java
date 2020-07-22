package assignment5;
import java.util.Scanner;
public class CricketTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the targetruns");
		int TargetRuns = sc.nextInt();
		System.out.println("enter current overs");
		int CurrentOver = sc.nextInt();
		System.out.println("enter current score");
		int CurrentScore = sc.nextInt();
		OneDayCricket oc = new OneDayCricket(TargetRuns);
		oc.setCurrentOver(CurrentOver);
		oc.setCurrentScore(CurrentScore);
		System.out.println("Current Run rate:");
		System.out.println(oc.calcCurrentRunrate(CurrentScore, CurrentOver));
		System.out.println("Required Run rate:");
		System.out.println(oc.calcReqdRunrate((TargetRuns-CurrentScore),(oc.getMaxOvers()-CurrentOver)));
	}

}
