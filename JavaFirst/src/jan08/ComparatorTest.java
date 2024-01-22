package jan08;
import java.util.*;
class Student1
{
	int id;
	String name;
	int age;
	public Student1(int id, String name, int age)
	{
		this.id = id;
		this.name = name;
		this.age = age;
	}
}


	class AgeComparator implements Comparator<Student1>
	{
		@Override
		public int compare(Student1 s1, Student1 s2)
		{
			// TODO Auto-generated method stub
			if(s1.age==s2.age)
			return 0;
			else if(s1.age>s2.age)
			return 1;
			else
			return -1;
		}
	}

	
	class NameComparator implements Comparator<Student1>
	{
		@Override
		public int compare(Student1 s1, Student1 s2)
		{
			// TODO Auto-generated method stub
			return s1.name.compareTo(s2.name);
		}
	}

public class ComparatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Student1> al=new ArrayList<Student1>();
		al.add(new Student1(101,"Vijay",23));  
		al.add(new Student1(106,"Ajay",27));  
		al.add(new Student1(105,"Jai",21)); 
		
		System.out.println("Sorting by name");
		Collections.sort(al,new NameComparator());
		for(Student1 s: al)
		{
			System.out.println(s.id+""+s.name+""+s.age);
		}
		
		
		System.out.println("Sorting by age");
		Collections.sort(al,new AgeComparator());
		for(Student1 s: al)
		{
			System.out.println(s.id+""+s.name+""+s.age);
		}
	}

}
