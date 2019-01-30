package introtocs.moneycard;

public class CreditCard extends MoneyCard {
	// instance variables
	private double creditLimit;

	// CreditCard constructor
	public CreditCard(String cardholder, double creditLimit) {
		this.cardholder = cardholder;
		this.creditLimit = creditLimit;
		accessibility = new AcceptedEverywhere();
	}

	public double getAvailableCredit() {
		return creditLimit - balance;
	}

	@Override
	public void makePurchase(double amount) {
		if (amount > 0.0) {
			if (amount > getAvailableCredit()) {
				throw new IllegalArgumentException("purchase amount greater than available credit.");
			} else {
				balance = balance + amount;
				purchases++;
				if (purchases == 3) {
					points = points + 100;
					maintenanceFee = maintenanceFee + 65;
					purchases = 0;
				}
			}
		} else {
			throw new IllegalArgumentException("purchase amount is invalid.");
		}
	}

	public void makePayment(double amount) {
		if (amount > 0.0) {
			balance = balance - amount;
		} else {
			throw new IllegalArgumentException("invalid payment.");
		}
	}

}
