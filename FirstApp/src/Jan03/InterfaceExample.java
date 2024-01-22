package Jan03;

interface A1
{
	public void display();
}
interface B1
{
	public void show();
	int a=10;
	int b=20;
}

class D implements A1,B1
{
	public void display()
	{
		System.out.println("Hello word");
	}
	
	public void show()
	{
		
		System.out.println(a+b);
	}
}

public class InterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//A a=new A();
		
		D d=new D();
		d.display();
		d.show();

	}

}
