package homework3;

public class InstructorManager extends UserManager{

	public void add(Instructor instructor)
	{
		System.out.println(instructor.firstName + " " + instructor.lastName + " Eklendi");
	}
	
	public void logIn(Instructor instructor)
	{
		System.out.println(instructor.firstName + " " + instructor.lastName + " Hoþgeldiniz :)");
	}
}
