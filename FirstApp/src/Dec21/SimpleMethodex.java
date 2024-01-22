package Dec21;
class Sample
{
	public void Simple()//called---Definition
	{
		System.out.println("Hello world");
	}
	public int add(int a, int b)
	{
		return a+b;
		
	}
	public double div(int a,int b)
	{
		double c=a%b;
		return c;
	}
	public int addss(int...a)//Variable length arguments
	{
		int sum=0;
		for (int b:a)//Associative Array
		{
			 sum=sum+b;
		}
		return sum;
	}
}
public class SimpleMethodex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sample s=new Sample();//object create syntax;
		s.Simple();//Calling--declaration
		System.out.println(s.add(10,20));
		System.out.println(s.div(10,20));
		//int a[]={10,20,30,40,50};
		System.out.println(s.addss(10,20,30,40,50));
		

	}

}
