package Dec22;
import java.util.Scanner;
public class Primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=sc.nextInt();
		int count=0;
		for(int i=1;i<=11;i++)
		{
			if(num%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println("Number"+num+" is a prime number");
		}
		else {
			System.out.println("Number"+num+" is not a prime number");
		}
	}

}
