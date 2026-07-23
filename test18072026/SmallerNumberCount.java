import java.util.Scanner;

public class SmallerNumberCount {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		int[] nums = new int[size];
		for(int i=0; i<size; i++) nums[i] = sc.nextInt();
		
		int count;
		for(int i=0; i<size; i++) {
			count=0;
			for(int j=i+1; j<size; j++) {
				if(nums[j] < nums[i]) count++;
			}
			nums[i] = count;
		}
		
		for(int val : nums) System.out.print(val+" ");
		sc.close();

	}

}


/*

Problem Statement:-
Given an array of integers, count the number of smaller elements that appear to the right of each element. Output the result as an array of counts corresponding to each element in the original array.

Example:
Input:-
4
5 2 6 1

Output: -
2 1 1 0 

﻿Explanation:-
To the right of 5, there are 2 smaller elements (2 and 1).
To the right of 2, there is only 1 smaller element (1).
To the right of 6, there is 1 smaller element (1).
To the right of 1, there is 0 smaller element.

Input format :-
The first line of input contains a single integer n, representing the length of the array.
The second line contains n space-separated integers, representing the elements of the array.

Output format :-
The output prints a single line containing the counts of smaller elements for each value in the array, separated by a space.

Refer to the sample output for formatting specifications.

Code constraints :-
The given test cases fall under the following specifications:
1 ≤ n ≤ 20
-100 ≤ elements ≤ 100

Sample test cases :-
Input 1 :-
4
5 2 6 1
Output 1 :-
2 1 1 0 

Input 2 :-
2
-1 -1
Output 2 :-
0 0

*/
