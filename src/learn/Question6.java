//WJP to perform ascending order Selection  sort
package learn;

import java.util.Scanner;

public class Question6 {

	public static int[] selectionSort(int[] arr) {
		int n = arr.length;

		for (int i = 0; i < n - 1; i++) {
			int minIndex = i;

			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			//Swapping
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}

		return arr;

	}

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);

		System.out.println("Enter the size of the array");
		int size = reader.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the elements of the array");
		for (int i = 0; i < size; i++) {
			arr[i] = reader.nextInt();
		}
		int[] sortedArr = selectionSort(arr);
		System.out.println("Sorted array: ");
		for (int i = 0; i < size; i++)
			System.out.println(sortedArr[i]);
		reader.close();
	}
}
