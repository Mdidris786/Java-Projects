package Dec20;

import java.util.Scanner;

public class SumofArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Array size");
		int size=sc.nextInt();
		System.out.println("Enter the array elements");
		
		int a[]=new int[size];
		int sum=0;
		
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
			sum=sum+a[i];
		}
		System.out.println("The sum of Array Element is "+sum);

	}

}
