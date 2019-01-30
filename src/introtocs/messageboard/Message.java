package introtocs.messageboard;

public class Message {

	private User user;
	private String content;
	
	/**
	 * Constructs a message
	 * @param user the User
	 * @param content the message content
	 */
	public Message(User user, String content) {
		this.user = user;
		this.content = content;
	}

	public String getMessage() {
		return content + " - by - " + user.getName();
	}
}
