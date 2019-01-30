package introtocs.practise;

import java.util.ArrayList;

public class MessageBoard {
	
	ArrayList<Message> board;
	
	public MessageBoard() {
		board = new ArrayList<Message>();
	}
	
	public void postMessage(Message m) {
		board.add(m);
	}
	
	public String getMessages() {
		String welcome = "Welcome to the message board.\n\n";
		String theMessages = "";
		
		for (Message m : board) {
			theMessages = theMessages +m.getMessage();
		}
		
		return welcome + theMessages;
	}
	
}
