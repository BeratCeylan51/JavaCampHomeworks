package homework2;

public class CourseManager {

	public void add(Course course)
	{
		System.out.println("Kursun Ad� : " + course.courseName);
		System.out.println("Kursun E�itmeni : " + course.Instructor);
		System.out.println("Eklendi");
	}
	
	public void remove(Course course)
	{
		System.out.println("Kursun Ad� : " + course.courseName);
		System.out.println("Kursun E�itmeni : " + course.Instructor);
		System.out.println("Silindi");
	}
	
	public void update(Course course)
	{
		System.out.println("Kursun Ad� : " + course.courseName);
		System.out.println("Kursun E�itmeni : " + course.Instructor);
		System.out.println("G�ncellendi");
	}
}
