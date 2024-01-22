import java.util.Scanner;
public class Fourth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value a");
		a=sc.nextInt();
		System.out.println("Enter the value b");
		b=sc.nextInt();
		
		if(a>b)
		{
			System.out.println("A is Big");
		}
		else
		{
			System.out.println("B is Big");
		}
	}

}
