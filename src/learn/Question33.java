//A circus is designing a tower routine consisting of people standing
//atop one another’s shoulders. For practical and aesthetic reasons, each person 
//must be both shorter and lighter than the person below him or her. Given the 
//heights and weights of each person in the circus, write a method to compute the largest
//possible number of people in such a tower. 
//EXAMPLE: Input (ht, wt): (65, 100) (70, 150) (56, 90) (75, 190) (60, 95) (68, 110) 
//Output: The longest tower is length 6 and includes from top to bottom: (56, 90) (60,95) (65,100) (68,110) (70,150) (75,190)
package learn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
class Person {
	    int height;
	    int weight;

	    public Person(int height, int weight) {
	        this.height = height;
	        this.weight = weight;
	    }
	}

public class Question33 {
	    public static int largestTower(List<Person> people) {
	        // Sort the people based on their heights in ascending order
	        people.sort(Comparator.comparingInt(p -> p.height));

	        
	        int n = people.size();
	        int[] dp = new int[n]; // Dynamic programming array to store the longest tower length at each index

	        // Initialize the dp array with 1, as the minimum tower length is 1 for each person
	        Arrays.fill(dp, 1);

	        // Iterate over the people and calculate the longest tower length
	        for (int i = 1; i < n; i++) {
	            for (int j = 0; j < i; j++) {
	                // Check if the current person can be added to the tower based on the height and weight conditions
	                if (people.get(i).weight > people.get(j).weight && dp[i] < dp[j] + 1) {
	                    dp[i] = dp[j] + 1;
	                }
	            }
	        }

	        // Find the maximum value in the dp array
	        int maxTowerLength = Arrays.stream(dp).max().orElse(0);

	        return maxTowerLength;
	    }
	        

	    public static void main(String[] args) {
	        List<Person> people = new ArrayList<>();
	        people.add(new Person(65, 100));
	        people.add(new Person(70, 150));
	        people.add(new Person(56, 90));
	        people.add(new Person(75, 190));
	        people.add(new Person(60, 95));
	        people.add(new Person(68, 110));

	        int maxTowerLength = largestTower(people);
	        System.out.println("The longest tower is length " + maxTowerLength + " and includes from top to bottom:");

	        // Print the people in the longest tower
	        people.sort(Comparator.comparingInt(p -> p.height));
	        for (Person person : people) {
	            System.out.println("(" + person.height + ", " + person.weight + ")");
	        }
	    }
	}
