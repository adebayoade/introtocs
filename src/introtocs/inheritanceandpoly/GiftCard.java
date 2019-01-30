package introtocs.inheritanceandpoly;

public class GiftCard extends MoneyCard {
    
    public GiftCard(String name, double balance) {
	this.name = name;
	this.balance = balance;
	acceptability = new AcceptedSelectLocation();
    }
}
