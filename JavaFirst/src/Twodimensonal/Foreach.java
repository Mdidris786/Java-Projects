package Twodimensonal;
import java.util.Scanner;
public class Foreach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=sc.nextInt();
		System.out.println("the array element is");
		
		int a[]=new int[5];
		for(int i=0;i<5;i++)
		{
			a[i]=sc.nextInt();		
		}
		for(int i=0;i<5;i++)
		{
			System.out.println("The array of the element is "+a[i]);
		}
	}
}
