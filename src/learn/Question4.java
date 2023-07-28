//Given an array of integers check the Palindrome of the series.
package learn;

import java.util.Scanner;

public class Question4 {

	public static boolean checkPalindrome(int[] arr) {
		boolean flag = true;

		for (int i = 0; i <= arr.length / 2; i++) {

			if (arr[i] != arr[arr.length - 1 - i]) {
				flag = false;
				break;
			}
		}
		return flag;
	}

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		System.out.println("Enter the size of the array ");
		int size = reader.nextInt();

		int[] arr = new int[size];

		System.out.println("Enter the elements of the array");
		for (int i = 0; i < size; i++)
			arr[i] = reader.nextInt();

		boolean result = checkPalindrome(arr);
		if (result) {
			System.out.println("The given array is Palindrome");
		} else {
			System.out.println("The given array is not Palindrome");
		}

		reader.close();
	}
}
