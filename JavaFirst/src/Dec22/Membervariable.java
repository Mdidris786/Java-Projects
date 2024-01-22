package Dec22;
import java.util.*;
public class Membervariable {
	public String name;
	public int Mark;
	public Membervariable(String studname) {
		name=studname;
	}
	public void Subject(int studmark) {
		Mark=studmark;
	}
	public void printstud() {
		System.out.println("name :"+name);
		System.out.println("Mark :"+Mark);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Membervariable sdone=new Membervariable("mohamed");
		sdone.Subject(75);
		sdone.printstud();
	}

}
