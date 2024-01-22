import java.util.Scanner;
public class Fifth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value a");
		a=sc.nextInt();
		
		if(a%2==0)
		{
			System.out.println("A is Even");
		}
		else
		{
			System.out.println("A is Odd");
		}
	}

}
