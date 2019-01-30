package introtocs.chatBoard;

public class User {
	String name;
	int age;

	/**
	 * constructs a user name
	 * @param name the user's name
	 * @param age the user's age
	 */
	public User(String name, int age) {
		this.name = name;
		this.age = age;
	}

	/**
	 * gets the name
	 * @return the user's name
	 */
	public String getName() {
		return name;
	}

	/**
	 * get the age
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
}
