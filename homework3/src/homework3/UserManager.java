package homework3;

public class UserManager {

	public void logIn(User user)
	{
		System.out.println("Kullanýcý Adý : " + user.getUserName());
		System.out.println("Hoþgeldiniz :)");
	}
	
	public void add(User user)
	{
		System.out.println(user.getUserName() + "Eklendi");
	}
}
