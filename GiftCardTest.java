package assignment3;

public class GiftCardTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GiftCard gc=new GiftCard(100, 0.0, true);
		gc.rechargeCard(2000);
		System.out.println("new balance"+gc.getBalance());
		gc.swipeCard(400);
		System.out.println("new balance"+gc.getBalance());
		gc.swipeCard(500);
		System.out.println("new balance"+gc.getBalance());
		
		GiftCard gc1=new GiftCard();
		gc1.setActive(true);
		gc1.rechargeCard(3000);
		gc1.swipeCard(500);
		gc1.swipeCard(2600);
		System.out.println(gc1.getBalance());
	}

}
