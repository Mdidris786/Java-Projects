package January02;
class Constructorov{
	public Constructorov()
	{
		this(10);
		System.out.println("mohamed");
	}
	public Constructorov(int a)
	{
		this(30,30);
		System.out.println(a+20);
	}
	public Constructorov(int a,int b)
	{
		this(50,20,30);
		System.out.println(a+b);
	}
	public Constructorov(int a, int b, int c)
	{
		System.out.println(a+b+c);
	}
}
public class constructoroverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructorov o=new Constructorov();
	}

}
