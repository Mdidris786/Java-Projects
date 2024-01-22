package January02;
class Employee
{
	int id;
	public Employee(int i, String n, int s) {
		this.id = i;
		this.name = n;
		this.salary = s;
	}
	String name;
	int salary;
	public int getsalary()
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
	public int getsalary()
	{
		return super.getsalary()+5000;
	}
}
public class employeetest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager m=new Manager(10034,"Mohamed",30000,"Faculty");
		System.out.println("The Employee id is: "+m.id);
		System.out.println("The Employee Name is: "+m.name);
		System.out.println("The Employee Salary is: "+m.salary);
		System.out.println("The Manager Salary is: "+m.getsalary());
	}

}
