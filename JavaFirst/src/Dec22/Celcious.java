package Dec22;

import java.util.Scanner;

public class Celcious {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c,farenheit;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the celcius value is");
		c=sc.nextInt();
		farenheit=(c*9/5)+32;
		System.out.println("The Temperature value is "+farenheit);
	}

}
