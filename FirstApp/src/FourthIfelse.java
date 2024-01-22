import java.util.Scanner;

public class FourthIfelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the a value");
		a=sc.nextInt();
		System.out.println("Enter the b value");
		b=sc.nextInt();
		
		if(a>b)//10>20--single line comment---/*     */--Multiline comment
		{
			System.out.println("A is big");
		}
		else
		{
			System.out.println("B is big");
		}
	}

}
