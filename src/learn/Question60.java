//write an algorithm to reverse first 3 numbers, then next 3 numbers,
//then next 3 numbers,the number will be  based on variable k. 
//Array = [3,2,4,7,0,3,1,5,8, 4]  k=3  OutPut = [4,2,3,3,0,7,8,5,1,4]
package learn;

import java.util.Scanner;

public class Question60 {
	
	public static int[] reverse(int[] arr,int k) {
		
		int loopcount=arr.length/k;
		if(arr.length % k!=0) {
			loopcount=arr.length/k+1;//to reverse the extra partition
			}
		
		
			for(int i=0;i<loopcount;i++) {
			
				int left=i*k;
				
				//In cases where last set is of size less than k, use (array length - 1) as the right index
				int right=Math.min(((i+1)*k)-1, arr.length-1);
			
				while(left<right) {
				
					int temp=arr[left];
					arr[left]=arr[right];
					arr[right]=temp;
					left++;
					right--;						
			}						
		}
		
		return arr;		
	}
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int size = reader.nextInt();
		
		//Entering elements in an array
		int[] arr = new int[size];
		System.out.println("Enter the elements of the array");
		for (int i = 0; i < size; i++)
			arr[i] = reader.nextInt();
		
		System.out.println("Enter the value of k: ");
		int k=reader.nextInt();
		//Calling the function
		int[] reversedArr = reverse(arr,k);
		
		System.out.println("Reversed array: ");
		for (int i = 0; i < size; i++)
			System.out.println(reversedArr[i]);
		
		reader.close();
		
	}

}
