package homework3JavaCollectionsBasics.problems1to4;

import java.util.Arrays;
import java.util.Scanner;

/*Problem 1. Sort Array of Numbers
Write a program to enter a number n and n integer numbers and sort and print them.
 Keep the numbers in array of integers: int[]. Examples:*/
public class SortArrayOfNumbers {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("Enter number of elements: ");
		int numberOfInts=scanner.nextInt();
		int[] nums=new int[numberOfInts];
		
		System.out.print("Enter numbers: ");
		int number=0;
		for (int i = 0; i < numberOfInts; i++) {
			number=scanner.nextInt();
			nums[i]=number;
		}		
		scanner.close();
		
		Arrays.sort(nums);
		
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
	}

}
