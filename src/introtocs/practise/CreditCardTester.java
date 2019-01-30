package introtocs.practise;

import java.util.ArrayList;

public class CreditCardTester {

	public static void main(String[] args) {
		
		// create multiple credit cards
		CreditCard card1 = new CreditCard("Victor");
		CreditCard card2 = new CreditCard("Bayo", 1500.0);
		CreditCard card3 = new CreditCard("Jane", 1000.0);
		
		ArrayList<CreditCard> cards = new ArrayList<CreditCard>();
		cards.add(card1);
		cards.add(card2);
		cards.add(card3);
		

		// make purchases on card1
		card1.makePurchase(100.0);
		card1.makePurchase(200.0);
		card1.makePurchase(100.0);
		card1.makePurchase(100.0);
		card1.makePurchase(100.0);
		card1.makePayment(700);
		card1.makePurchase(100.0);
		card1.makePurchase(200.0);
		card1.makePurchase(100.0);
		card1.makePurchase(100.0);
		card1.makePurchase(100.0);
		card1.makePayment(900);
		
		for (CreditCard i : cards) {
		System.out.printf("Cardholder's name is %s%n", i.getCardholder());
		System.out.printf("Credit limit is %s%n", i.getCreditLimit());
		System.out.printf("Available credit is %s%n", i.getAvailableCredit());
		System.out.printf("Balance is %s%n", i.getBalance());
		System.out.printf("Reward point(s) is %s%n", i.getRewardPoints());
		System.out.println("............................................");
		}
		
		/**
		System.out.printf("Cardholder's name is %s%n", card1.getCardholder());
		System.out.printf("Credit limit is %s%n", card1.getCreditLimit());
		System.out.printf("Available credit is %s%n", card1.getAvailableCredit());
		System.out.printf("Balance is %s%n", card1.getBalance());
		System.out.printf("Reward point(s) is %s%n", card1.getRewardPoints());
		System.out.println("............................................");
		*/
	}
}
