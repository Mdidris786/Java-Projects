package Jan09;
import java.io.*;
class Student implements Serializable
{
	 int id;  
     String name;  
     public Student(int id, String name) {  
      this.id = id;  
      this.name = name;  
     }  
}

public class SerializationTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Student s1 =new Student(211,"ravi");  
		  
		  FileOutputStream fout=new FileOutputStream("f.txt");  
		  ObjectOutputStream out=new ObjectOutputStream(fout);  
		  
		  out.writeObject(s1);  
		  out.flush();  
		  
		  ObjectInputStream in=new ObjectInputStream(new FileInputStream("f.txt"));  
	      Student s=(Student)in.readObject();  
	      System.out.println(s.id+" "+s.name);  
	      
	      

	}

}
