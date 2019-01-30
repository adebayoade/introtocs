package introtocs.practise;

public class MessageTester {
	
	public static void main(String[] args) {
		
		User bayo = new User("Bayo", 25);
		User victor = new User("Victor", 26);
		
		Message m1 = new Message(bayo, "How are you Victor?");
		Message m2 = new Message(victor, "I'm fine thanks");
		
		MessageBoard board = new MessageBoard();
		board.postMessage(m1);
		board.postMessage(m2);
		
		System.out.println(board.getMessages());
	}
}
