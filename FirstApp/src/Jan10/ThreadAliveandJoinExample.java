package Jan10;

class NewThread4 implements Runnable
{
	String name; 
	Thread t;
	NewThread4(String threadname)
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

public class ThreadAliveandJoinExample {
	public static void main(String args[])
	{
		NewThread4 ob1 = new NewThread4("Keywan");
		NewThread4 ob2 = new NewThread4("Bibin");
		NewThread4 ob3 = new NewThread4("Ishan");
		boolean b1,b2,b3;
		b1 = ob1.t.isAlive();
		b2 = ob2.t.isAlive();
		b3 = ob3.t.isAlive();
		System.out.println(" the thread status are "+b1+"   "+b2+"   "+b3);
		try {
			System.out.println("Waiting for threads to finish.");
			ob1.t.join();
			ob2.t.join();
			ob3.t.join();
			} 
		catch (InterruptedException e) 
		{
			System.out.println("Main thread Interrupted");
		}
		System.out.println("After the join method ..");
		b1 = ob1.t.isAlive();
		b2 = ob2.t.isAlive();
		b3 = ob3.t.isAlive();
		System.out.println(" the thread status are "+b1+"   "+b2+"   "+b3);
	}
}
