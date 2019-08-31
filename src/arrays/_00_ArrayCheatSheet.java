package arrays;

import java.util.Arrays;
import java.util.Random;

public class _00_ArrayCheatSheet {
	
	public static void main(String[] args) {
		// 1. make an array of 5 Strings
		String[] food = { "pizza", "ice cream", "burrito", "taco", "watermelon" };
		// 2. print the third element in the array
		System.out.println(food[3]);
		// 3. set the third element to a different value
		food[3] = "pie";
		// 4. print the third element again
		System.out.println(food[3]);
		// 5. use a for loop to print all the values in the array
		// BE SURE TO USE THE ARRAY'S length VARIABLE
for(int i=0;i<food.length;i++) {
	System.out.println(food[i]);
}
		// 6. make an array of 50 integers
int [] array = new int[50];
		// 7. use a for loop to make every value of the integer array a random number


for( int i=0;i<array.length;i++) {
	Random rand = new Random();
	array[i]= rand.nextInt();
}
// 8. without printing the entire array, print only the smallest number in the
// array
Arrays.sort(array);
System.out.println(array[0]);
//9 print the entire array to see if step 8 was correct
for(int a=0;a<array.length;a++) {
	System.out.println(array[a]);
}
//10. print the largest number in the array.
System.out.println(array[array.length-1]);

		

		
	}
}
