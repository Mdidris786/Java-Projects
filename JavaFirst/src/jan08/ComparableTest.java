package jan08;
import java.util.*;
class Student implements Comparable<Student>
{
	int id;
	String name;
	int age;
	public Student(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	@Override
	public int compareTo(Student st) {
		// TODO Auto-generated method stub
		if(age==st.age)  
		return 0;  
		else if(age>st.age)  
		return 1;  
		else  
		return -1;  
	}
}
public class ComparableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> ar=new ArrayList<Student>();
		ar.add(new Student(101,"Mohamed",26));
		ar.add(new Student(102,"Idris",23));
		ar.add(new Student(103,"Ibrahim",20));
		
	
		Collections.sort(ar);
		
		for(Student st:ar)
		{
			System.out.println(st.id+""+st.name+""+st.age);
		}
	}

}
