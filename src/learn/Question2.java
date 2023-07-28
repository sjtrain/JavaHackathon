//write a program to find factorial
package learn;

import java.util.Scanner;

public class Question2 {
	public static int calculateFactorial(int num) {
		int factorial = 1;
		if (num == 0)
			return 1;
		for (int i = num; i >= 1; i--) {
			factorial = factorial * i;
		}

		return factorial;

	}

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = reader.nextInt();
		System.out.println("Factorial of " + num + " is " + calculateFactorial(num));
		reader.close();
	}

}


