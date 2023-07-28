//WJP to merge two sorted array.(Do not use third array)
package learn;
import java.util.Scanner;
public class Question26 {
	public static void mergeArrays(int[] arr1, int[] arr2) {
		int n1 = arr1.length;
		int n2 = arr2.length;
		
		int[] mergedArray = new int[n1 + n2];
		int i = 0, j = 0, k = 0;
		
		while (i < n1 && j < n2) {
			if (arr1[i] <= arr2[j]) {
				mergedArray[k] = arr1[i];
				i++;
			} 
			else {
				mergedArray[k] = arr2[j];
				j++;
			}
			k++;
		}
		while (i < n1) {
			mergedArray[k] = arr1[i];
			i++;
			k++;
		}
		while (j < n2) {
			mergedArray[k] = arr2[j];
			j++;
			k++;
		}
		System.out.println("Merged Array:");
		for (int num : mergedArray) {
			System.out.print(num + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Enter the size of the array1: ");
		int size1 = reader.nextInt();
		
		int[] arr1 = new int[size1];
		System.out.println("Enter the elements of the array1");
		for (int i = 0; i < size1; i++)
			arr1[i] = reader.nextInt();
		
		System.out.println("Enter the size of the array2: ");
		int size2 = reader.nextInt();
		
		int[] arr2 = new int[size2];
		System.out.println("Enter the elements of the array2");
		for (int i = 0; i < size2; i++)
			arr2[i] = reader.nextInt();
		
		mergeArrays(arr1, arr2);
		reader.close();
	}}
