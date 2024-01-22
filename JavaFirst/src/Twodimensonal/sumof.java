package Twodimensonal;

import java.util.Scanner;
public class sumof {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of Array");
		int size=sc.nextInt();
		System.out.println("Enter the Array Element");
		
		int a[]=new int[size];
		int sum=0;
		
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
			sum=sum+a[i];
		}
		System.out.println("the sum of the array "+sum);
	}
}
