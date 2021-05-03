package homework3;

public class Student extends User{

	String firstName;
	String lastName;
	String school;
	
	public Student(int id, String userName, String password, String firstName, String lastName, String school) {
		super(id, userName, password);
		this.firstName = firstName;
		this.lastName = lastName;
		this.school = school;
	}
	
}
