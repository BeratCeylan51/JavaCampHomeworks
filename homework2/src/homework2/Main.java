package homework2;

public class Main {

	public static void main(String[] args) {
		
		Course course1 = new Course();
		course1.id = 1;
		course1.courseName = "C#";
		course1.description = "Yazýlým Geliþtirici Yetiþtirme Kampý (C# - Angular)";
		course1.Instructor = "Engin Demiroð";
		
		Course course2 = new Course();
		course2.id = 2;
		course2.courseName = "Java";
		course2.description = "Yazýlým Geliþtirici Yetiþtirme Kampý (Java - React)";
		course2.Instructor = "Engin Demiroð";
		
		Course course3 = new Course();
		course3.id = 3;
		course3.courseName = "Programlamaya Giriþ";
		course3.description = "Programlamaya Giriþ Ýçin Temel kurs";
		course3.Instructor = "Engin Demiroð";
		
		Course[] courses = new Course[] {course1, course2, course3};
		
		for (Course course : courses)
		{
			System.out.println(course.courseName);
		}
		
		CourseManager courseManager = new CourseManager();
		courseManager.add(course1);
		courseManager.remove(course2);
		courseManager.update(course3);
	}

}
