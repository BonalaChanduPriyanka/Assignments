package assignment3;
import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account acc=new Account();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter initial balance:");
		double iBal = sc.nextDouble();
		acc.setInitialBalance(iBal);
		if(iBal>=500) {
		System.out.println("Enter the balance to deposit:");
		double depositAmount = sc.nextDouble();
		acc.deposit(depositAmount);
		}
		else{
			System.out.println("account is INACTIVE");
		}
		if(iBal >=500) {
			System.out.println("Enter the balance to withdraw:");
			double withdrawAmount = sc.nextDouble();
			acc.withdraw(withdrawAmount);
		}
		else {
			System.out.println("cannot withdraw");
		}
			

	}

}
