package introtocs.inheritanceandpoly;

public class DebitCard extends MoneyCard {
    
    // Constructs a debit card with a determined name and balance.
    public DebitCard(String name, double amount) {
	this.name = name;
	balance = amount;
	acceptability = new AcceptedEverywhere();
    }
    
    public void deposit(double amount) {
	if (amount > 0.0)
	    balance = balance + amount;
    }

}
