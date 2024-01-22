import java.util.Scanner;
public class sixth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("A is Big");
		a=sc.nextInt();
		System.out.println("B is Big");
		b=sc.nextInt();
		System.out.println("C is Big");
		c=sc.nextInt();
		
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("A is Big");
			}
			else
			{
				System.out.println("C is Big");
			}
		}
		else
		{
			if(b>c)
			{
				System.out.println("B is Big");
			}
			else
			{
				System.out.println("C is Big");
			}
		}
	}

}
