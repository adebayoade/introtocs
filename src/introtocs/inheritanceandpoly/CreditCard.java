package introtocs.inheritanceandpoly;

public class CreditCard extends MoneyCard {

    private double creditLimit;

    // constructs a credit card with a determined name and creditLimit
    public CreditCard(String name, double amount) {
	this.name = name;
	creditLimit = amount;
	acceptability = new AcceptedEverywhere();
    }

    public void makePurchase(double amount) {
	if (amount > getAvailableCredit()) {
	    System.err.println("Amount of purchase exceeds available credit.");
	} else {
	    balance = balance + amount;
	}
    }

    public void makePayment(double amount) {
	if (amount > 0.0)
	    balance = balance - amount;
    }

    public double getAvailableCredit() {
	return creditLimit - balance;
    }

}
