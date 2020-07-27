import java.util.Scanner;

public class program14 {
	int factorial(int number)
	{
		int factorial=1;
		for(int i=number;i!=0;i--)
		{
			factorial=factorial*i;
		}
		return factorial;
	}
	public static void main(String args[])
	{
		prog14 obj=new prog14();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		System.out.println("Enter the value of r");
		int r=sc.nextInt();
		double nCr=obj.factorial(n)/(obj.factorial(n-r)*obj.factorial(r));
		System.out.println("The nCr value is : "+nCr);
		
		sc.close();
	}
}