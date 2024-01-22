package Jan10;
class NewThread2 implements Runnable
{
String name; 
Thread t;
NewThread2(String threadname)
{
	name = threadname;
	t = new Thread(this, name);
	System.out.println("New thread: " + t);
	t.start(); 
}
public void run()
{
	try
	{
		for(int i = 5; i > 0; i--)
		{
			System.out.println(name + ": " + i);
			Thread.sleep(1000);
		}
	}
	catch (InterruptedException e)
	{
		System.out.println(name + "Interrupted");
	}
	System.out.println(name + " exiting.");
}
}
public class MultipleThreadsClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new NewThread2("Keywan");
		new NewThread2("Bibin");
		new NewThread2("Ishan");
		try
		{
			Thread.sleep(10000);
			
		}
		catch (InterruptedException e)
		{
			System.out.println("Main thread Interrupted");
		}
		System.out.println("Main thread exiting.");	

	}

}
