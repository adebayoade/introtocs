package introtocs.messageboard;

public class User {

	private String name;

	/**
	 * constructs the user
	 * @param name the user's name.
	 */
	public User(String name) {
		this.name = name;
	}

	/**
	 * gets the name
	 * @return the user's name.
	 */
	public String getName() {
		return name;
	}
}
