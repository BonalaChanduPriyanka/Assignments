package assignment4;
import java.util.Scanner;

public class BookDetails {

	public BookDetails() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b = new Book();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Book No:");
		b.setBookNo(sc.nextInt());
		System.out.println("Enter title:");
		b.setTitle(sc.next());
		System.out.println("Enter Author:");
		b.setAuthor(sc.next());
		System.out.println("Enter price:");
		b.setPrice(sc.nextFloat());
		System.out.println("Book no :" + b.getBookNo() +"\nTitle :" +b.getTitle()+"\nAuthor:"+b.getAuthor()+"\nPrice:"+b.getPrice());
		

	}

}
