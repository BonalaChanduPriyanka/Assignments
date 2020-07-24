package assignment4;
import java.util.Scanner;

public class TestCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Customer c = new Customer();
		Address address = new Address("Ist Main HSR Layout", "Bangalore");
		c.setCustomerName("John"+"\n");
		c.setResidentialAddress(address);
		System.out.println(c.getCustomerDetails());
		scan.close();
	}

}
