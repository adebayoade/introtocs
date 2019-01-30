package introtocs.messageboard;

import java.util.ArrayList;

public class MessageBoard {

	ArrayList<Message> board;

	/**
	 * constructs the message board
	 */
	public MessageBoard() {
		board = new ArrayList<Message>();
	}

	/**
	 * posts the message
	 * @param m the message
	 */
	public void postMessage(Message m) {
		board.add(m);
	}

	public String getMessages() {
		String display = "Welcome to the message board!\n\n";
		
		for (int i = 0; i < board.size(); i++) {
			display = display + board.get(i).getMessage() + "\n";
		}
		return display;
	}
}
