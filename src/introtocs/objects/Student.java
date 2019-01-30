package introtocs.objects;

public class Student {

    // instance variables.
    private String name;
    private int age;
    private String department;
    
    /**
     * Constructs a new Student
     * @param name the student's name
     * @param department the student's department 
     * @param age the student's age
     */
    public Student(String name, String department, int age) {
	this.name = name;
	this.department = department;
	this.age = age;
    }

    /**
     * gets the student's name.
     * 
     * @return the name.
     */
    public String getName() {
	return name;
    }

    /**
     * gets the student's age
     * 
     * @return the age.
     */
    public int getAge() {
	return age;
    }

    /**
     * gets the student's department.
     * 
     * @return the department.
     */
    public String getDept() {
	return department;
    }

    /**
     * get's the student's biodata
     * 
     * @return the biodata.
     */
    public String getBiodata() {
	return "Name is: " + name + "\n" + "Dept is: " + department + "\n" + "Age is: " + age + "\n";
    }
}
