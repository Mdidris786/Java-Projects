package jan09;
import java.io.*;
public class FileWriterExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter fw=new FileWriter("C:\\Users\\moham\\OneDrive\\Documents\\testout.txt");
		fw.write("Welcome to mohd");
		fw.close();
	}

}
