package Dec20;

import java.util.Scanner;

public class ReverseofArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Array size");
		int size=sc.nextInt();
		System.out.println("Enter the array elements");
		
		int a[]=new int[5];
		for(int i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
			
		}
		for(int i=a.length-1;i<=a.length;i--)
		{
			System.out.println(a[i]);
		}

	}

}
