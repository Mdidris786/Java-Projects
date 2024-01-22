package Jan09;

import java.io.*;

public class DataStreamExampleInput {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fin=new FileInputStream("testout.txt");    
        int i=fin.read();  
        System.out.print((char)i);    

        fin.close();    

	}

}
