package introtocs.chatBoard;

import java.util.ArrayList;

public class ChatBox {
	ArrayList<Message> history;
	User u;

	/**
	 * constructs the chat
	 */
	public ChatBox() {
		history = new ArrayList<Message>();
	}

	/**
	 * post the chat
	 * @param m the message
	 */
	public void postMessage(Message m) {
		history.add(m);
	}

	/**
	 * gets all the chat messages
	 * 
	 * @return the chat history
	 */
	public String getMessages() {
		String welcome = "Welcome to chat United!\n\n";

		if (history.size() != 0) {
			for (int i = 0; i < history.size(); i++) {
				welcome = welcome + history.get(i).getMessage() + "\n";
			}
		} else {
			throw new IllegalArgumentException("No chat history.");
		}
		return welcome;
	}
}
