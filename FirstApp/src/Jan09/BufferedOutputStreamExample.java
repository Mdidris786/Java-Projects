package Jan09;
import java.io.*;
public class BufferedOutputStreamExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fout=new FileOutputStream("testout.txt");    
        BufferedOutputStream bout=new BufferedOutputStream(fout);    
        String s="Welcome to jeevaJAVA";    
        byte b[]=s.getBytes();    
        bout.write(b);    
        bout.flush();    
        bout.close();    
        fout.close();    

	}

}
