package Dec22;

import java.util.Scanner;

public class Volume {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r,h,Volume;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius");
		r=sc.nextInt();
		System.out.println("Enter the height");
		h=sc.nextInt();
		Volume=22/7*r*r*h;
		System.out.println("The Volume of the cylinder "+Volume);
	}

}
