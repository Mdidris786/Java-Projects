package january03;
import java.util.*;
abstract class Loginpage
{
	abstract void Login();
}
class Homepage extends Loginpage
{
	void Login()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the username");
		String name=sc.next();
		System.out.println("Enter the password");
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
		System.out.println("Welcome to the homepage");
	}
	public void error()
	{
		System.out.println("error");
	}
}
public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Homepage h=new Homepage();
		h.Login(); // Upcasting methd
		
		Loginpage l=new Homepage();
		l.Login();
	}

}
