package homework3;

public class Main {

	public static void main(String[] args) {
		
		Student student1 = new Student(1, "��renciTest1","12345" , "Berat", "Ceylan", "�mer Halisdemir �niversitesi");
		Student student2 = new Student(2, "��renciTest2","12345" , "Sedanur", "Demirkol", "Ege �niversitesi");
		
		Instructor instructor = new Instructor(2, "��retmen", "789465", "Engin", "Demiro�", "ITIL");
		
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
		userManager.logIn(instructor); // kurum ve kurulu�lar i�in kullan�c� ad� kullan !!!

	}

}
