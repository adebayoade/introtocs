package introtocs.moneycard;

public class MoneyCard {
	// instance variables.
	protected String cardholder;
	protected double balance;
	protected int purchases;
	protected int points;
	protected double maintenanceFee;
	protected Accessibility accessibility;

	/**
	 * make purchase using the card subtracting from the balance.
	 * @param amount is the amount of purchase.
	 */
	public void makePurchase(double amount) {
		if (amount > 0.0 && amount > balance) {
			throw new IllegalArgumentException("purchase amount greater than available balance");
		} else {
			balance = balance - amount;
			purchases++;
			if (purchases == 3) {
				points = points + 100;
				maintenanceFee = maintenanceFee + 65.0;
				purchases = 0;
			}
		}
	}

	/**
	 * change the name on the card holder.
	 * @param name is the new name to set.
	 */
	public void setCardholder(String name) {
		cardholder = name;
	}

	/**
	 * make deposit on the card.
	 * @param amount is the amount to be added to the card.
	 */
	public void makeDeposit(double amount) {
		if (amount > 0.0) {
			balance = balance + amount;
		} else {
			throw new IllegalArgumentException("invalid deposit amount.");
		}
	}

	public String getAccessibility() {
		return accessibility.location();
	}

	public int getUsagePoints() {
		return points;
	}

	/**
	 * get the cardholder's name
	 * @return cardholder.
	 */
	public String getCardholder() {
		return cardholder;
	}

	/**
	 * get the balance on the card.
	 * @return balance on the card.
	 */
	public double getBalance() {
		return balance;
	}

	public double getMaintenanceFee() {
		return maintenanceFee;
	}
}
