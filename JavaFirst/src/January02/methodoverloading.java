package January02;
class Methodover{
	int add(int a,int b)
	{
	return a+b;
	}
	double add(int a,int b,int c)
	{
		return a+b+c;
	}
	void add(int a)
	{
		System.out.println(a+10);
	}
}
public class methodoverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methodover oj=new Methodover();
		oj.add(10);
		System.out.println(oj.add(20, 40, 40));
		System.out.println(oj.add(40, 40));
	}

}
