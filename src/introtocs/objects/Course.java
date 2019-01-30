package introtocs.objects;

public class Course {
    private Student student;
    private String courseName;
    private Teacher teacher;
    
    /**
     * constructs a new course
     * @param t the teacher
     * @param s the student
     * @param name the course name
     */
    public Course(Teacher t, Student s, String name) {
	teacher = t;
	student = s;
	courseName = name;
    }
    
    /**
     * gets the course
     * @return the course name
     */
    public String getCourse() {
	return courseName;
    }
    
    /**
     * gets the teacher of the course
     * @return the teacher's name.
     */
    public String getTeacher() {
	return teacher.getName();
    }
}