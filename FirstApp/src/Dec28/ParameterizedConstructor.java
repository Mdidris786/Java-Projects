package Dec28;
class Employee2
{
	int id;
	String name;
	public Employee2(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	int salary;

	public void display()
	{
		System.out.println("The Employee id"+id);
		System.out.println("The Employee Name"+name);
		System.out.println("The Employee Salary"+salary);
	}
}

public class ParameterizedConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee2 e=new Employee2(101,"Jeeva",30000);
		e.display();

	}

}
