package assignment4;

public class Customer {
	
	private String customerName;
	private Address residentialAddress;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(String customerName, Address residentialAddress) {
		super();
		this.customerName = customerName;
		this.residentialAddress = residentialAddress;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Address getResidentialAddress() {
		return residentialAddress;
	}

	public void setResidentialAddress(Address residentialAddress) {
		this.residentialAddress = residentialAddress;
	}
	
     String getCustomerDetails() {
		String CustomerDetails = "customer: "+this.customerName + "Residential Address: " +this.residentialAddress;
		return CustomerDetails;
	}

}
