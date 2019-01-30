package introtocs.objects;

public class Tester {

    public static void main(String[] args) {
	// create students
	Student bayo = new Student("Bayo", "Computer Science", 22);
	Student victor = new Student("Bayo", "Computer Eng", 25);
	
	// create teachers
	Teacher sam = new Teacher("Sam");
	Teacher edward = new Teacher("Edward");
	
	// create courses
	Course mth = new Course(sam, victor, "MTH");
	Course cobol = new Course(edward, bayo, "COBOL" );
	
	System.out.println(cobol.getTeacher());
	System.out.println(cobol.getClass());

    }

}
