package Method;
class Method
{
	public void Method()//called--definition
	{
		System.out.println("Hello World");
	}
	public int add(int a,int b)
	{
		return a+b;
	}
	public double div(int a,int b)
	{
		double c=a%b;
		return c;
	}
	public int adds(int...a)
	{
		int sum=0;
		for (int b:a)
		{
			sum=sum+b;
		}
		return sum;
	}
}
public class Methodprog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method s=new Method();//object create syntax;
		s.Method();
		System.out.println(s.add(30, 30));
		System.out.println(s.div(10, 20));
		//int a[]= {10,20,30,40,50};
		System.out.println(s.adds(10,20,30,40,50));
	}

}
