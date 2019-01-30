package introtocs.practise;

public class User {
	
	private String username;
	private int userage;
	
	/**
	 * constructs a user
	 * @param name the name
	 * @param age the user age.
	 */
	public User(String name, int age) {
		username = name;
		userage = age;
	}
	
	/**
	 * gets the username
	 * @return the username
	 */
	public String getName() {
		return username;
	}
	
	/**
	 * gets the userage
	 * @return the userage
	 */
	public int getAge() {
		return userage;
	}

}
