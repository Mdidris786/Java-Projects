package jan05;
import java.util.*;
class Student{
	int id;
	String name;
	String std;
	public Student(int id, String name, String std) {
		this.id = id;
		this.name = name;
		this.std = std;
	}
	public String toString()
	{
		return id+""+name+""+std;
	}
}
public class StudentID {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student(100," Mohamed ","12th");
		Student s2=new Student(101," Idris ","12th");
		Student s3=new Student(102," Ibrahim ","12th");
		Student s4=new Student(103," Sameer ","12th");
		Student s5=new Student(104," Praveen ","12th");
		Student s6=new Student(104," Tarik ","12th");
		
		Collection<Student> dd=new	HashSet<>();
		dd.add(s1);
		dd.add(s2);
		dd.add(s3);
		dd.add(s4);
		dd.add(s5);
		
//		System.out.println(dd);
		
		for (Student s:dd)
		{
			System.out.println(s);
		}
	}

}
