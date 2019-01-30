package introtocs.objects;

public class Teacher {
    
    String name;
    
    /**
     * constructs a new teacher
     * @param name the teacher's name
     */
    public Teacher(String name) {
	this.name = name;
    }
    
    /**
     * Gets the Teacher's name
     * @return the teacher's name
     */
    public String getName() {
	return name;
    }

}
