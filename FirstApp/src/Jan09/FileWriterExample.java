package Jan09;
import java.io.*;
public class FileWriterExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter fw=new FileWriter("testout.txt");    
        fw.write("Welcome to jeevaJAVA");    
        fw.close();    

	}

}
