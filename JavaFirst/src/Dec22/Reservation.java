package Dec22;

import java.util.Scanner;

public class Reservation {
	int ticketId;
	int age;
	String name;
	String gender;
	String source;
	String destination;
	
	Reservation(){
		ticketId=200345;
		age=25;
		name="Brook";
		gender="Male";
		source="Pune";
		destination="Lucknow";
	}
	
	public void ShowTicket() {
		System.out.println("The Ticket Id is "+ticketId);
		System.out.println("Age is "+age);
		System.out.println("The Passenger Name is "+name);
		System.out.println("Gender is "+gender);
		System.out.println("The Source is "+source);
		System.out.println("The Destination is "+destination);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reservation rs=new Reservation();
		rs.ShowTicket();
	}

}
