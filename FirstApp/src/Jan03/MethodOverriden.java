package Jan03;
class A
{
	public void show()
	{
		System.out.println("I am a A");
	}
}
class B extends A
{
	public void show()
	{
		super.show();
		System.out.println("I am a B");
	}
}

public class MethodOverriden {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		B b=new B();///Upcasting
		b.show();
		
		A a=new B();//Downcasting
		a.show();

	}

}
