package Dec28;

class Employee
{
	int id;
	String name;
	int salary;
	public Employee()
	{
		id=101;
		name="Jeevan";
		salary=30000;
	}
	public void display()
	{
		System.out.println("The Employee id"+id);
		System.out.println("The Employee Name"+name);
		System.out.println("The Employee Salary"+salary);
	}
}

public class EmployeeTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e=new Employee();
		e.display();

	}

}
