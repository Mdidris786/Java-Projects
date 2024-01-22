package january03;
class A
{
	public void show()
	{
		System.out.println("Iam a Mohamed");
	}
}
class B extends A
{
	public void show()
	{
		super.show();
		System.out.println("Iam a Idris");
	}
}
public class Methodoverrideen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b=new B();
		b.show(); //upcasting
		
		A a=new B();
		a.show(); //downcasting
	}

}
