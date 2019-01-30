package introtocs.moneycard;

public class DebitCard extends MoneyCard {

	public DebitCard(String cardholder, double balance) {
		this.cardholder = cardholder;
		this.balance = balance;
		accessibility = new AcceptedEverywhere();
	}

}
