package introtocs.moneycard;

public class GiftCard extends MoneyCard {
    public GiftCard(String cardholder, double balance) {
	this.cardholder = cardholder;
	this.balance = balance;
	accessibility = new AcceptedSelectLocation();
    }
}
