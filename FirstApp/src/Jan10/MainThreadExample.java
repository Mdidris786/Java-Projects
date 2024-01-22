package Jan10;

public class MainThreadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread t = Thread.currentThread();
		System.out.println(" the thread is :"+t);
		t.setName("Ramesh");
		System.out.println(" Name changed :"+t);
		try
		{
			for(int i=0;i<5;i++)
			{
				System.out.println(" value is :"+i);
				t.sleep(1000);
			}
		}catch(InterruptedException e)
		{
			System.out.println("Main thread interrupted:::");
		}

	}

}
