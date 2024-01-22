package Dec22;
import java.util.Scanner;
public class Employedetails {
	public void showmenu() {
		Scanner sc=new Scanner(System.in);
		System.out.println("----------Menu----------");
		System.out.println("Enter Data");
		System.out.println("Display Data");
		System.out.println("Exit");
		System.out.println("Choose the Menu Option");
		int opt=sc.nextInt();
		switch(opt)
		{
			case 1:
				Enterdata();
				break;
			case 2:
				Displaydata();
				break;
			case 3:
				Exitmenu();
				break;
			default :
				System.out.println("Invalid Menu Option");
		}
	}


	private static void Enterdata() {
		// TODO Auto-generated method stub
		System.out.println("EnterData method is invoked");
	}
	private static void Displaydata() {
		// TODO Auto-generated method stub
		System.out.println("DisplayData method is invoked");
	}
	private static void Exitmenu() {
		// TODO Auto-generated method stub
		System.out.println("Exitmenu method is invoked");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employedetails obj=new Employedetails();
		obj.showmenu();
	}
}
