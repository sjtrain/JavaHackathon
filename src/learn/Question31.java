//Read a file content and write it to a new file in reverse order.(reverse line 1-10 to line 10-1)
package learn;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class Question31 {

	public static void main(String[] args) throws IOException {
		BufferedWriter obufferedwriter = null;
		
		
		//1. path of the file where to write.
		String userdir = System.getProperty("user.dir");
		String fileSeparator = System.getProperty("file.separator");
		
		String spath =  userdir+fileSeparator+"files"+fileSeparator+"WriteFile.txt";
		
		//2. File Writer 
		FileWriter ofilewriter;
		try {
			ofilewriter = new FileWriter(spath);
			obufferedwriter = new BufferedWriter(ofilewriter);
			obufferedwriter.write("Welcome to Java Sessions");
			obufferedwriter.write("\n");
			obufferedwriter.write("Welcome to Manual Sessions");
			obufferedwriter.write("\n");
			obufferedwriter.write("Edited by sherin");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
			
		}finally {
			obufferedwriter.close();
		}
			
			
	}
	
}


