package jan09;
import java.io.*;
public class BufferedOutputStreamExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fout=new FileOutputStream("C:\\Users\\moham\\OneDrive\\Documents\\testout.txt");    
        BufferedOutputStream bout=new BufferedOutputStream(fout);    
        String s="Welcome to MohamedJAVA";    
        byte b[]=s.getBytes();    
        bout.write(b);    
        bout.flush();    
        bout.close();    
        fout.close();    

	}

}
