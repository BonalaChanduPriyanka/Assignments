package assignment4;
//import java.util.Scanner;

public class EngineeringBook extends Book {
	
	private String category;

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	public static void main(String[] args) {
		EngineeringBook eb=new EngineeringBook();
		eb.setCategory("ECE");
		eb.setAuthor("priyanka");
		eb.setBookNo(01);
		eb.setPrice(100);
		eb.setTitle("Analog Electronics");
		System.out.println(eb.getAuthor()+"\n"+eb.getCategory()+"\n"+eb.getBookNo()+"\n"+eb.getPrice()+"\n"+eb.getTitle());
	}
}
