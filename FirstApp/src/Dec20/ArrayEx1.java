package Dec20;

import java.util.Scanner;

public class ArrayEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array elements");
		
		int a[]=new int[5];
		
		for(int i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int j=0;j<5;j++)
		{
			System.out.print(a[j]+"");
		}
		
		

	}

}
