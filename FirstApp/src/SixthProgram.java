import java.util.Scanner;

public class SixthProgram {
	public static void main(String...args)
	{
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the a value");
		a=sc.nextInt();
		System.out.println("Enter the b value");
		b=sc.nextInt();
		System.out.println("Enter the c value");
		c=sc.nextInt();
		if(a>b)//10>20
		{
			if(a>c)
			{
				System.out.println("A is big");
			}
			else
			{
				System.out.println("C is big");
			}
		}
		else
		{
			if(b>c)//20>30
			{
				System.out.println("B is big");
			}
			else
			{
				System.out.println("C is big");
			}
		}
	}

}
