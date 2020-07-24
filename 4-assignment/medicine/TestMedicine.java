package assignment4;
import java.util.*;

public class TestMedicine {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Medicine [] obj=new Medicine[5];
		
		
		 Random random = new Random();
	      
	   for(int i=0;i<=2;i++)
	   {
		   switch(random.nextInt(3)) {
		   
		   case 1:
			   obj[i] = new Tablet();
			   break;
		   case 2:
			   obj[i] = new Ointment();
			   break;
		   case 3:
			   obj[i] = new Syrup();
			   break;
		   
		   }
		   System.out.println("Enter Expiry Date");
		   obj[i].setExpiryDate(sc.next());
		   System.out.println("Enter Price");
		   obj[i].setPrice(sc.nextDouble());
		   obj[i].getDetails();
		   obj[i].displayLabel();
	   }
	    

	}

}