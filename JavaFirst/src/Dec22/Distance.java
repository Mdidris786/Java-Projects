package Dec22;

import java.util.Scanner;

public class Distance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ut,at;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Velocity value ");
		ut=sc.nextInt();
		System.out.println("Enter the accleration value");
		at=sc.nextInt();
		int Distance=ut+(at*at)/2;
		System.out.println("The total value of distance is "+Distance);
	}

}
