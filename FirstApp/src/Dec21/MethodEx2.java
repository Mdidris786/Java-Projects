package Dec21;

import java.util.Scanner;

class Sims
{
	public int add(int a ,int b)
	{
		return a+b;
	}
	public int sub(int a ,int b)
	{
		
		return a-b;
	}
	public int mul(int a ,int b)
	{
		return a*b;
	}
	public int div(int a ,int b)
	{
		return a/b;
	}
}

public class MethodEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the a value");
		int a=sc.nextInt();
		System.out.println("enter the b value");
		int b=sc.nextInt();
		System.out.println("Enter the Choices");
		int ch=sc.nextInt();
		Sims k=new Sims();
		switch(ch)
		{
		case 1:
			System.out.println(k.add(a, b));
			break;
		case 2:
			System.out.println(k.sub(a, b));
			break;
		case 3:
			System.out.println(k.mul(a, b));
			break;
		case 4:
			System.out.println(k.div(a, b));
			break;
		default:
			System.out.println("Invalid");
			
		}

	}

}
