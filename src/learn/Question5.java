/*Given an array prints the unique numbers 
and also print the number of occurrences of duplicate numbers*/
package learn;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Question5 {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int size = reader.nextInt();
		
		//Declaring an array
		int[] arr = new int[size];
		System.out.println("Enter the elements of the array1");
		for (int i = 0; i < size; i++)
			arr[i] = reader.nextInt();

		// Map to store number counts
		Map<Integer, Integer> countMap = new HashMap<>();

		// Count occurrences of each number and add elements
		for (int num : arr) {
			countMap.put(num, countMap.getOrDefault(num, 0) + 1);
		}

		System.out.println("Unique Numbers:");
		for (int num : countMap.keySet()) {
			System.out.print(num + " ");
		}

		System.out.println("\nNumber of Occurrences of Duplicate Numbers:");
		for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey() + " - " + entry.getValue());
			}
		}
		reader.close();
	}

}
