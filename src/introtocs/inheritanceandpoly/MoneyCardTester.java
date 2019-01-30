package introtocs.inheritanceandpoly;

public class MoneyCardTester {

    public static void main(String[] args) {
	DebitCard dc = new DebitCard("Iron man", 10000.0);
	CreditCard cd = new CreditCard("Batman", 5000.0);
	GiftCard gc = new GiftCard("Spider-man", 3000.0);
	
	System.out.println("Debit card");
	System.out.println(dc.getAcceptability());

	System.out.println("Credit card");
	System.out.println(cd.getAcceptability());

	System.out.println("Gift card");
	System.out.println(gc.getAcceptability());

    }

}
