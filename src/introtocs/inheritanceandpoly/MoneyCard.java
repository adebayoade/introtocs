package introtocs.inheritanceandpoly;

public class MoneyCard {

    protected double balance;
    protected String name;
    protected Acceptability acceptability;

    public void makePurchase(double amount) {
	if (amount > balance) {
	    System.err.println("Amount of purchase greater than balance.");
	}
	balance = balance - amount;
    }
    
    public void setName(String name) {
	this.name = name;
    }

    public String getName() {
	return name;
    }

    public double getBalance() {
	return balance;
    }
    
    public String getAcceptability() {
	return acceptability.location();
    }
}