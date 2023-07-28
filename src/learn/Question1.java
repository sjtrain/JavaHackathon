//Consider there is a 3 Boolean variable called a, b, c.Check if at least two out of three Booleans are true 
package learn;
import java.util.Scanner;
public class Question1 {
	
	public static boolean checkBoolean(boolean a,boolean b, boolean c) {
		
		if(a==true && b==true||b==true && c==true||a==true && c==true) 
			return true;
		else
			return false;		
		
	}	
	public static void main(String[] args) {
		
		Scanner reader= new Scanner(System.in);
		
		System.out.println("Enter value for a");
		boolean a= reader.nextBoolean();
		
		System.out.println("Enter value for b");
		boolean b= reader.nextBoolean();
		
		System.out.println("Enter value for c");
		boolean c= reader.nextBoolean();
		
		boolean result=checkBoolean(a,b,c);
		if(result==true)
			System.out.println("Two variables are true");
		else
			System.out.println("No two variables are true");
		
		reader.close();			
	}
}
