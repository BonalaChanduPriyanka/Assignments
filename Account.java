package assignment3;
public class Account {
	double initialBalance;
	public double getInitialBalance() {
		return initialBalance;
	}

	public void setInitialBalance(double initialBalance) {
		this.initialBalance = initialBalance;
		if(initialBalance>=500)//CONSIDER ACCOUNT IS ACTIVE WHEN MINIMUM BAL IS 500
		{
			System.out.println("Account is ACTIVE");
		}
	}
	
	public void deposit(double depamount) {
			this.initialBalance+=depamount;
			System.out.println("current Balance =" + this.initialBalance);
		
	}
	public void withdraw(double witamount) {
			this.initialBalance-=witamount;
			System.out.println("current Balance =" + this.initialBalance);
			
	}

}