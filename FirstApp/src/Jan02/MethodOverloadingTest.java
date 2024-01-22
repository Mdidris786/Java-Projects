package Jan02;
class MethodO
{
	int add(int a, int b)
	{
		return a+b;
	}
	
	double add(int a ,int b, int c)
	{
		return a+b+c;
	}
	void add(int a)
	{
		System.out.println(a+10);
	}
}

public class MethodOverloadingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodO o=new MethodO();
		o.add(10);
		System.out.println(o.add(10,20,30));
		System.out.println(o.add(10, 20));

	}

}
