package introtocs.chatBoard;

public class Tester {
    
    public static void main(String[] args) {
	User chibuzor = new User("Chibuzor", 24);
	User bayo = new User("Bayo", 22);
	
	Message m1 = new Message(bayo, "Who's there?");
	Message m2 = new Message(chibuzor, "I'm online");
	
	ChatBox history = new ChatBox();
	history.postMessage(m1);
	history.postMessage(m2);
	
	System.out.println(history.getMessages());
	
    }
}
