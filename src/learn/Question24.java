/*Write a program which inputs a positive natural number N and prints the possible 
consecutive number combinations, which when added give N*/
package learn;

import java.util.Scanner;

public class Question24 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		System.out.print("Enter a positive natural number: ");
		int N = reader.nextInt();

		System.out.println("Possible consecutive number combinations are: ");

		for (int start = 1; start <= N / 2; start++) {
			int sum = start;
			int currentNumber = start + 1;

			while (sum < N) {
				sum = sum + currentNumber;
				currentNumber++;
				if (sum == N) {
					for (int i = start; i < currentNumber; i++) {
						System.out.print(i);
						if (i != currentNumber - 1) {
							System.out.print(" + ");
						}
					}
					System.out.println();
				}
			}
		}

		reader.close();
	}

}
