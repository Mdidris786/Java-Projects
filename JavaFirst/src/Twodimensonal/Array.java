package Twodimensonal;
import java.util.Scanner;
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of the Array");
		int size=sc.nextInt();
		System.out.println("Enter the Array Element is");
		
		int a[]=new int[5];
		for(int i=0;i<5;i++)
		{
			a[i]=sc.nextInt();		
		}
		for(int i=0;i<5;i++)
		{
			System.out.println("The Array Element is "+a[i]);		
		}

	}
}