import java.util.Scanner;

public class inversionCountProblem {
	
	private static int inversionCount(int[] grades, int size) {
		int count = 0;
		for(int i=0; i<size; i++) {
			for(int j=i+1; j<size; j++) {
				if(grades[i] > grades[j]) count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
    	int n = sc.nextInt();
    	int[] grades = new int[n];
    	for(int i=0; i<n; i++) grades[i] = sc.nextInt();
    	
    	System.out.println(inversionCount(grades, n));
    	
		sc.close();
	}

}

/*

Problem Statement:-
Arun is a teacher at a school, and he has recently conducted an exam for your students. The exam grades of the students are represented as an array of integers. He want to determine the number of inversions in the list of grades.

Given an array of integers, find the inversion count in the array using insertion sort. 

Inversion Count: For an array, the inversion count indicates how far (or close) the array is from being sorted. If the array is already sorted, then the inversion count is 0. If an array is sorted in reverse order, then the inversion count is the maximum. 

Formally, two elements arr[i] and arr[j] form an inversion if arr[i] > arr[j] and i < j.

Example1
Input:-
arr[] = {8, 4, 2, 1}

Output:-
6

Explanation:-
The sequence has six inversions (8, 4), (4, 2), (8, 2), (8, 1), (4, 1), (2, 1).

Example 2

Input:-
arr[] = {29, 37, 42, 54, 61}

Output:-
0

Explanation:-
As the sequence is already sorted, there is no inversion count.

Example 3
Input:-
arr[] = {100, 100, 100}

Output:-
0

Explanation:-
As all the elements of the array are the same, there is no inversion count.

Input format :-
The first line of input consists of N, representing the size of the array.
The second line consists of the N array elements, separated by space.

Output format :-
The output prints the inversion count in the given array.

Refer to the sample output for formatting specifications

Code constraints :-
The given test cases fall under the following specifications:
1 ≤ N ≤ 25
1 ≤ array elements ≤ 100

Sample test cases :-
Input 1 :-
4
8 4 2 1
Output 1 :-
6

Input 2 :-
5
20 45 19 37 58
Output 2 :-
3

Input 3 :-
5
29 37 42 54 61
Output 3 :-
0

Input 4 :-
3
100 100 100
Output 4 :-
0

*/
