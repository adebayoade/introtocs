package introtocs.practise;

public class Message {
	
	private User user;
	private String message;
	
	/**
	 * constructs a new message
	 * @param u the user
	 * @param m the message
	 */
	public Message(User u, String m) {
		user = u;
		message = m;
	}
	
	/**
	 * gets the message.
	 * @return the message.
	 */
	public String getMessage() {
		return String.format("%s by: %s%n", message, user.getName());
	}
}
