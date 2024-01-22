package Method;

import java.util.Scanner;

class oper
{
	public int add(int a,int b)
	{
		return a+b;
	}
	public int sub(int a,int b)
	{
		return a-b;
	}
	public int mul(int a,int b)
	{
		return a*b;
	}
	public int div(int a,int b)
	{
		return a/b;
	}
}
public class Methodtwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the a value is");
		int a=sc.nextInt();
		System.out.println("Enter the b value is");
		int b=sc.nextInt();
		System.out.println("Enter the Choices");
		int ch=sc.nextInt();
		
		oper k=new oper();
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
		default :
			System.out.println("Invalid");
		}
		}

}
