package jan05;
import java.util.*;
public class Collectiontest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List l=new ArrayList();
		Set s=new HashSet();
		
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(10);
		l.add(20);
		l.add(30);
		l.add("amjid");
		l.add('m');
		l.add(true);
		
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(10);
		s.add(20);
		
		l.remove(2);
		s.remove(20);
		
		System.out.println(l);
		System.out.println(s);
		System.out.println(l.size());
		System.out.println(s.size());
	}

}
