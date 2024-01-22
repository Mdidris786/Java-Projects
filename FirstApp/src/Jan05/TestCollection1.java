package Jan05;
import java.util.*;

public class TestCollection1
{
	public static void main(String...args)
	{
		List ls=new ArrayList();
		
		Set a=new HashSet();
		
		ls.add(10);
		ls.add(20);
		ls.add(30);
		ls.add(10);
		ls.add(20);
		ls.add("Jeeva");
		ls.add('M');
		ls.add(true);
		
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(10);
		a.add(30);
		
		a.remove(10);
		ls.remove(2);
		
		System.out.println(ls);
		
		
		System.out.println(a.size());
		System.out.println(ls.size());
	}
}