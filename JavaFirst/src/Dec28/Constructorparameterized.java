package Dec28;
class Employee2{
	int id;
	public Employee2(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	String name;
	int salary;
	public void display() {
		System.out.println("The Employee id "+id);
		System.out.println("The Employee Name "+name);
		System.out.println("The Employee Salary "+salary);
	}
}
public class Constructorparameterized {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee2 em=new Employee2(24515, "IDRIS", 45000); 
		em.display();
	}

}
