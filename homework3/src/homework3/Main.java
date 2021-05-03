package homework3;

public class Main {

	public static void main(String[] args) {
		
		Student student1 = new Student(1, "ÖğrenciTest1","12345" , "Berat", "Ceylan", "Ömer Halisdemir Üniversitesi");
		Student student2 = new Student(2, "ÖğrenciTest2","12345" , "Sedanur", "Demirkol", "Ege Üniversitesi");
		
		Instructor instructor = new Instructor(2, "Öğretmen", "789465", "Engin", "Demiroğ", "ITIL");
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(student1);
		studentManager.logIn(student1);
		
		System.out.println();
		
		studentManager.add(student2);
		studentManager.logIn(student2);
		
		System.out.println();
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor);
		instructorManager.logIn(instructor);
		
		System.out.println();
		
		UserManager userManager = new UserManager();
		userManager.logIn(instructor); // kurum ve kuruluşlar için kullanıcı adı kullan !!!

	}

}
