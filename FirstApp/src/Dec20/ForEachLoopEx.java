package Dec20;

import java.util.Scanner;

public class ForEachLoopEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array elements");
		
		int a[]=new int[5];
		
		for(int i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int b:a)//Associative Array
		{
			System.out.println(b);
		}
		
		

	}

}
