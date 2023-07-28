//WJP to perform ascending order Quick sort
package learn;
import java.util.Arrays;
import java.util.Scanner;
public class Question27 {	
	public static int partition(int arr[], int low, int high)
    {
        int pivot = arr[high];
        int swapIndex = (low-1); // index of smaller element
       
        for (int j=low; j<high; j++)
        {
            // If current element is smaller than or
            // equal to pivot
            if (arr[j] <= pivot)
            {
                swapIndex++;
 
                // swap arr[i] and arr[j]
                int temp = arr[swapIndex];
                arr[swapIndex] = arr[j];
                arr[j] = temp;
            }
        } 
        // swap arr[swapIndex+1] and arr[high] (or pivot)
        int temp = arr[swapIndex+1];
       
        arr[swapIndex+1] = arr[high];
        arr[high] = temp;
 
        return swapIndex+1; // returning the index of pivot element
    }
	public static void sort(int arr[], int low, int high)
    {
        if (low < high)
        {
            //pi is partitioning index, arr[pi] is now at right place 
            int pi = partition(arr, low, high);
 
            // Recursively sort elements before partition and after partition
            sort(arr, low, pi-1);
            sort(arr, pi+1, high);
        }
    }
     
 // Driver program
    public static void main(String args[])
    {
    	Scanner reader = new Scanner(System.in);
		
		System.out.println("Enter the size of the array: ");
		int size = reader.nextInt();
		
		int[] arr = new int[size];
		System.out.println("Enter the elements of the array1");
		for (int i = 0; i < size; i++)
			arr[i] = reader.nextInt();
    	      
        sort(arr, 0, size-1);
 
        System.out.println("Sorted array");
       
	    System.out.println(Arrays.toString(arr));
    
        reader.close();
    }
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	





	   




	 