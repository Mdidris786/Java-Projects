package Dec27;

class Employee
{
	private int id;
	private String name;
	private int salary;
	
	public void set(int i,String n,int s)
	{
		this.id=i;
		this.name=n;
		this.salary=s;
	}
	public void get()
	{
		System.out.println("The Employee id"+id);
		System.out.println("The Employee name"+name);
		System.out.println("The Employee Salary"+salary);
	}
}

public class EmployeeTestOOPS1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e=new Employee();
		e.set(101, "Jeeva", 30000);
		//e.id=203;
		e.get();
		Employee e2=new Employee();
		e.set(102,"Karthick", 45000);
		e.get();
		

	}

}
