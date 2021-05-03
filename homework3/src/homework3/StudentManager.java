package homework3;

public class StudentManager extends UserManager{

	public void add(Student student)
	{
		System.out.println(student.firstName + " " + student.lastName + " Eklendi");
	}
	
	public void logIn(Student student)
	{
		System.out.println(student.firstName + " " + student.lastName + " Hoþgeldiniz :)");
	}
}
