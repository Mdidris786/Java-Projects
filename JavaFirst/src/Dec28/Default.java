package Dec28;
class Employee{
	int id;
	String name;
	int salary;
	public Employee() {
		id=200145;
		name="Mohamed";
		salary=20000;
	}
	public void display() {
		System.out.println("The Employee id "+id);
		System.out.println("The Employee Name "+name);
		System.out.println("The Employee Salary "+salary);
	}
}

public class Default {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp=new Employee();
		emp.display();
	}

}
