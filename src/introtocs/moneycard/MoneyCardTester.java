package introtocs.moneycard;

import javax.swing.JOptionPane;

public class MoneyCardTester {

    public static void main(String[] args) {
	
    DebitCard dc = new DebitCard("Bayo", 10000.0);
	CreditCard cd = new CreditCard("Victor", 5000.0);
	GiftCard gc = new GiftCard("Bisi", 2000.0);
	
	dc.makePurchase(2000.0);
	dc.makePurchase(3000.0);
	dc.makePurchase(1000.0);
	dc.makePurchase(1000.0);
	dc.makePurchase(1000.0);
	dc.makePurchase(1000.0);
	dc.makeDeposit(5000.0);
	
	cd.makePurchase(1000.0);
	cd.makePurchase(1000.0);
	cd.makePurchase(1000.0);
	
	System.out.println("***************************************");
	System.out.printf("Debit cardholder is %s%n", dc.getCardholder());
	System.out.println(dc.getBalance());
	System.out.println(dc.getUsagePoints());
	System.out.println(dc.getMaintenanceFee());
	System.out.println(dc.getAccessibility());
	System.out.println("***************************************");
	
	System.out.println("***************************************");
	System.out.printf("Credit cardholder is %s%n", cd.getCardholder());
	System.out.println(cd.getBalance());
	System.out.println(cd.getAvailableCredit());
	System.out.println(cd.getAccessibility());
	
	System.out.println("***************************************");
	System.out.printf("Gift cardholder is %s%n", gc.getCardholder());
	System.out.println(gc.getBalance());
	System.out.println(gc.getAccessibility());

    }

}
