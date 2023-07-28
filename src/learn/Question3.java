//Given an array of integers, sort the integer values
package learn;

import java.util.Scanner;

public class Question3 {

	public static int[] sortIntegers(int[] numbers) {

		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				int temp = 0;
				if (numbers[i] > numbers[j]) {
					temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
			}
		}
		return numbers;
	}

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		System.out.println("Enter the size of the array");
		int size = reader.nextInt();

		int numbers[] = new int[size];
		System.out.println("Enter the elements of the array");
		for (int i = 0; i < size; i++)
			numbers[i] = reader.nextInt();

		int newarray[] = sortIntegers(numbers);
		System.out.println("Array after sorting: ");

		for (int i = 0; i < size; i++)
			System.out.println(newarray[i]);

		reader.close();
	}
}
