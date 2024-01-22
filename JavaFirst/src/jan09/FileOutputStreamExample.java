package jan09;
import java.io.*;
public class FileOutputStreamExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fout=new FileOutputStream("C:\\Users\\moham\\OneDrive\\Documents\\testout.txt");
		fout.write(68);
		fout.close();
		System.out.println("Success");
	}

}
