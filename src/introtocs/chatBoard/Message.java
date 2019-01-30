package introtocs.chatBoard;

public class Message {
	User user;
	String content;

	/**
	 * constructs a message
	 * @param user the User
	 * @param content the message
	 */
	public Message(User user, String content) {
		this.user = user;
		this.content = content;
	}

	/**
	 * gets the message
	 * @return the content of the message
	 */
	public String getMessage() {
		return content + " by: " + user.getName() + "\n";
	}
}
