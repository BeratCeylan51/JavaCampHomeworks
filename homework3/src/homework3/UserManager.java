package homework3;

public class UserManager {

	public void logIn(User user)
	{
		System.out.println("Kullan�c� Ad� : " + user.getUserName());
		System.out.println("Ho�geldiniz :)");
	}
	
	public void add(User user)
	{
		System.out.println(user.getUserName() + "Eklendi");
	}
}
