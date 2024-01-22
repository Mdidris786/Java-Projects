package OOPS;

	class Employee{
		private int id;
		private String name;
		private int salary;
	
	public void set(int i,String n,int s) {
		this.id=i;
		this.name=n;
		this.salary=s;
	}
	public void get() {
		System.out.println("Enter the Employee id is "+id);
		System.out.println("Enter the Employee name is "+name);
		System.out.println("Enter the Employee id is "+salary);
	}
	}
public class Employeedetail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e=new Employee();
		e.set(10023, "Mohamed", 30000);
		e.get();
		Employee e1=new Employee();
		e1.set(10024, "Idris", 40000);
		e1.get();
	}

}
