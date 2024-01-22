package Jan02;

class Employee
{
	int id;
	String name;
	int salary;
	public Employee(int id, String name, int s) {
		this.id = id;
		this.name = name;
		this.salary=s;
	}
	public int getSalary()
	{
		return salary;
	}
}
class Manager extends Employee
{
	String dept;
	public Manager(int i, String n, int s, String d)
	{
		super(i,n,s);
		this.dept=d;
		
	}
	public int getSalary()
	{
		return super.getSalary()+5000;
	}
}

public class EmployeeTests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Manager m=new Manager(101,"JEeva",30000,"Faculty");
		System.out.println("The Manager Salary is:"+m.getSalary());
		Employee em=new Employee(102, "mom", 30000);
		System.out.println("the employee id is: "+em.id);
	}

}
