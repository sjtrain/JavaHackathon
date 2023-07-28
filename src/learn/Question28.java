//WJP to find factorial of a number using recursion
package learn;

import java.util.Scanner;

public class Question28 {

	public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } 
        else {
            return n * factorial(n - 1);
        }
    }
    public static void main(String[] args) {
    	Scanner reader = new Scanner(System.in);
		System.out.println("Enter the number:  ");
		int number = reader.nextInt();
		
        int result = factorial(number);

        System.out.println("Factorial of " + number + " = " + result);
        reader.close();
    }
}