package Jan02;
class ConstructorO
{
	public ConstructorO()
	{
		this(10);
		System.out.println("Jeeva");
	}
	public ConstructorO(int a)
	{
		this(20,30);
		System.out.println(10+a);
		
	}
	public ConstructorO(int a,int b)
	{
		System.out.println(a+b);
		
	}
}
public class ConstructorOverloadingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorO o=new ConstructorO();

	}

}
