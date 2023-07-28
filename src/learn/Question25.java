//Write a program for binary search
package learn;
import java.util.Scanner;

public class Question25 {
	public static int binarySearch(int[] arr, int target) {
		int left = 0;
		int right = arr.length - 1;
		
		while (left <= right) {
			int mid = left + (right - left) / 2;
			// Check if the target is found at the middle index
			if (arr[mid] == target) {
				return mid;
			}
			// If the target is less than the middle element, search in the left half
			if (arr[mid] > target) {
				right = mid - 1;
			}
			// If the target is greater than the middle element, search in the right half
			else {
				left = mid + 1;
			}
		}
		// If the target is not found, return -1
		return -1;
	}

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the size of the array ");
		int size = reader.nextInt();
		
		int[] arr = new int[size];
		System.out.println("Enter the elements of the array");
		for (int i = 0; i < size; i++)
			arr[i] = reader.nextInt();
		
		System.out.println("Enter the element to be searched: ");
		int target = reader.nextInt();

		int result = binarySearch(arr, target);

		if (result == -1) {
			System.out.println("Element not found in the array.");
		} else {
			System.out.println("Element found at index " + result);
		}
		reader.close();
	}}
