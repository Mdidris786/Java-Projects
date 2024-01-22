package Jan08;

import java.util.*;

class Student1
{
	int id;
	String name;
	int age;
	public Student1(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

}
class AgeComparator implements Comparator<Student1>{  
	

	@Override
	public int compare(Student1 s1, Student1 s2) {
		if(s1.age==s2.age)  
			return 0;  
		else if(s1.age>s2.age)  
			return 1;  
		else  
			return -1;
	}  
}  
class NameComparator implements Comparator<Student1>{  
	

	@Override
	public int compare(Student1 s1, Student1 s2) {
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
		  
		System.out.println("Sorting by Name");  
		
		Collections.sort(al,new NameComparator());  
		
		for(Student1 st: al){  
		System.out.println(st.id+" "+st.name+" "+st.age);  
		}  
		  
		System.out.println("sorting by Age");  
		
		Collections.sort(al,new AgeComparator());  
		
		for(Student1 st: al){  
		System.out.println(st.id+" "+st.name+" "+st.age);  
		}  

	}

}
