import java.util.Scanner;
public class seventh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the a value");
		a=sc.nextInt();
		System.out.println("Enter the b value");
		b=sc.nextInt();
		System.out.println("Enter the choices");
		int ch=sc.nextInt();
		
		switch(ch)
		{
		case 1:
			c=a+b;
			System.out.println(c);
			break;	
		case 2:
			c=a-b;
			System.out.println(c);
			break;
		case 3:
			c=a*b;
			System.out.println(c);
			break;
		case 4:
			c=a/b;
			System.out.println(c);
			break;
		default:
			System.out.println("Invalid Choices");
		}
	}

}
