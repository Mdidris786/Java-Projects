package jan09;
import java.io.*;
public class DataStreamExampleInput {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fin=new FileInputStream("C:\\Users\\moham\\OneDrive\\Documents\\testout.txt");
		int i=fin.read();
		System.out.println((char)i);
		fin.close();
	}

}
