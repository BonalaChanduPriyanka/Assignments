package assignment4;

public abstract class Medicine {
	
	double price;
	String expiryDate;
	
	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public String getExpiryDate() {
		return expiryDate;
	}


	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	public void getDetails() {
		System.out.println("Price : "+this.price+"\n"+"Expiry Date : "+this.expiryDate);
	}
	public abstract void displayLabel();
	public Medicine() {
		// TODO Auto-generated constructor stub
	}

}
