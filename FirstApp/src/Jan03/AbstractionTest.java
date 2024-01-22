package Jan03;
import java.util.*;
abstract class LoginPage
{
	abstract void Login();
}
class HomePage extends LoginPage
{
	void Login()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the USer Name");
		String name=sc.next();
		System.out.println("Enter the Password");
		String pass=sc.next();
		if(name.equals(pass))
		{
			home();
		}
		else
		{
			error();
		}
		
	}
	public void home()
	{
		System.out.println("Welcome to Home PAge");
	}
	public void error()
	{
		System.out.println("Error");
	}
}

public class AbstractionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//LoginPage l=new LoginPage();
		HomePage s=new HomePage();
		s.Login();
		LoginPage l=new HomePage();
		l.Login();

	}

}
