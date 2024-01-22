package jan09;
import java.io.*;
public class DataOutputStreamExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream file=new FileOutputStream("C:\\Users\\moham\\OneDrive\\Documents\\testout.txt");
		DataOutputStream data=new DataOutputStream(file);
		data.writeInt(68);
		data.flush();
		data.close();
		file.close();
	}

}
