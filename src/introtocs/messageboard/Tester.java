package introtocs.messageboard;

public class Tester {

	public static void main(String[] args) {

		User bayo = new User("Adebayo");
		User victor = new User("Victor");

		Message m1 = new Message(bayo, "How are there?");
		Message m2 = new Message(victor, "Hi Bayo");

		MessageBoard board = new MessageBoard();
		board.postMessage(m1);
		board.postMessage(m2);

		System.out.println(board.getMessages());

	}

}
