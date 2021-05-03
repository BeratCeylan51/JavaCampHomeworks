package homework3;

public class Instructor extends User{

	String firstName;
	String lastName;
	String certificate;
	
	public Instructor(int id, String userName, String password, String firstName, String lastName, String certificate) {
		super(id, userName, password);
		this.firstName = firstName;
		this.lastName = lastName;
		this.certificate = certificate;
	}
}
