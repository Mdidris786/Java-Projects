package january03;
interface A2
{
	public void display();
}
interface B2 
{
	public void showthem();
	int a=10;
	int b=10;
}
class C implements A2,B2
{
	public void display(){
		System.out.println("hello world");
	}
	public void showthem() {
		System.out.println(a+b);
	}
}

public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C d=new C();
		d.display();
		d.showthem();
	}

}
