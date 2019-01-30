package introtocs.practise;

public class CreditCard {

    // instance variables
    private String cardholder;
    private double balance;
    private int purchases;
    private String cardtype;
    private double creditLimit;
    private double availableCredit;
    private double maintenanceFee;
    private int cardUsage;
    private int rewardPoints;

    /**
     * Constructs a credit card with a predetermined credit limit.
     * 
     * @param name
     *            the cardholder's name.
     */
    public CreditCard(String name) {
	cardholder = name;
	creditLimit = 500.0;
	balance = 0.0;
	cardtype = "visa";
	availableCredit = creditLimit;
    }

    /**
     * Constructs a credit card with a defined name and credit limit.
     * 
     * @param name
     *            the cardholder's name.
     * @param amount
     *            the cardholder's credit limit.
     */
    public CreditCard(String name, double amount) {
	cardholder = name;
	creditLimit = amount;
	balance = 0.0;
	cardtype = "mastercard";
	availableCredit = creditLimit;
    }

    /**
     * Make a purchase on the credit card increasing the balance.
     * 
     * @param amount,
     *            the amount of purchase.
     */
    public void makePurchase(double amount) {
	if (amount > availableCredit) {
	    balance = balance + amount + 50.0;
	    availableCredit = availableCredit - amount;
	    cardUsage++;
	} else {
	    balance = balance + amount;
	    availableCredit = availableCredit - amount;
	    purchases++;
	    cardUsage++;
	}

	if (cardUsage == 3) {
	    maintenanceFee = maintenanceFee + 50.0;
	    balance = balance + maintenanceFee; // adds maintenance fee to the balance
	    cardUsage = 0; // resets the cardUsage
	}
    }

    /**
     * Makes a payment of the credit card decreasing the balance.
     * 
     * @param amount,
     *            the amount of decrease of the balance.
     */
    public void makePayment(double amount) {
	// validates a real payment
	if (amount > 0.0) {
	    balance = balance - amount;
	}
	// resets the availableCredit after paying off the credit card
	if (balance == 0.0)
	    availableCredit = creditLimit;
    }

    /**
     * Gets the cardholder's name.
     * 
     * @return the card holder.
     */
    public String getCardholder() {
	return cardholder;
    }

    /**
     * Gets the maintenance fee
     * 
     * @return the maintenance fee.
     */
    public double getMaintenanceFee() {
	return maintenanceFee;
    }

    /**
     * assigns 100 points for each purchase without a credit limit charge.
     * 
     * @return reward points.
     */
    public int getRewardPoints() {
	for (int i = 0; i < purchases; i++) {
	    rewardPoints = rewardPoints + 100;
	}
	return rewardPoints;
    }

    /**
     * Gets the credit limit
     * 
     * @return credit limit.
     */
    public double getCreditLimit() {
	return creditLimit;
    }

    /**
     * Gets the balance.
     * 
     * @return the balance.
     */
    public double getBalance() {
	return balance;
    }

    /**
     * Get the available credit on the credit card.
     * 
     * @return the available credit.
     */
    public double getAvailableCredit() {
	return availableCredit;
    }
}
