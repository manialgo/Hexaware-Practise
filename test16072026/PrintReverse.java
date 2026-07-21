//TEST
import java.util.Scanner;

public class PrintReverse{
	
	private static void mergeSort(int[] nums, int left, int right) {
		if(left < right) {
			int mid = left + (right-left)/2;
			
			mergeSort(nums, left, mid);
			mergeSort(nums, mid+1, right);
			
			merge(nums, left, mid, right);
		}
	}
	
	private static void merge(int[] nums, int left, int mid, int right) {
		int n1 = mid-left+1;
		int n2 = right-mid;
		
		int[] L = new int[n1];
		int[] R = new int[n2];
		
		for(int i=0; i<n1; i++) L[i] = nums[left+i];
		for(int j=0; j<n2; j++)	R[j] = nums[mid+1+j];
		
		int i=0, j=0, k=left;
		
		while(i<n1 && j<n2) {
			if(L[i] < R[j]) {
				nums[k] = L[i];
				i++;
			}else {
				nums[k] = R[j];
				j++;
			}
			k++;
		}
		
		while(i<n1) {
			nums[k] = L[i];
			k++;
			i++;
		}
		
		while(j<n2) {
			nums[k] = R[j];
			k++;
			j++;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] nums = new int[size];
		
		for(int i=0; i<size; i++) nums[i] = sc.nextInt();
		
		mergeSort(nums, 0, size-1);
		
		for(int i=0; i<size; i++) System.out.print(nums[i]+" ");
		sc.close();
	}
}

/*
import java.util.Scanner;
import java.util.Arrays;

public class PrintReverse{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] nums = new int[size];
        for(int i=0; i<size; i++) nums[i] = sc.nextInt();
        Arrays.sort(nums);
        for(int i=size-1; i>=0; i--)  System.out.print((i==0) ? nums[i] : nums[i]+" ");
        sc.close();
    }
}
*/

/*

Problem Statement:-
Raju, an aspiring programmer, is working on a sorting program using the merge sort algorithm. He wants to sort the array and print the sorted array in descending order. Write a program to implement the merge sort algorithm.

Input format :-
The first line consists of an integer N, representing the number of elements in the array.
The second line consists of N space-separated integers, representing the elements of the array.

Output format :-
The output displays N space-separated integers sorted in descending order.

Refer to the sample output for formatting specifications.

Code constraints :-
1 ≤ N ≤ 20
1 ≤ elements of the array ≤ 100

Sample test cases :-
Input 1 :-
8
78 34 23 76 12 10 4 79
Output 1 :-
79 78 76 34 23 12 10 4 

Input 2 :-
5
6 5 4 3 2
Output 2 :-
6 5 4 3 2 

*/




/*

package javalearn;
import java.util.Scanner;
public class Main{
	private static void mergeSort(int[] nums, int left, int right) {
		if(left < right) {
			int mid = left + (right-left)/2;
			
			mergeSort(nums, left, mid);
			mergeSort(nums, mid+1, right);
			
			merge(arr, left, right );
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] nums = new int[size];
		for(int i=0; i<size; i++) nums[i] = sc.nextInt();
		
		mergeSort(nums, 0, size-1);
		
		for(int i=0; i<size; i++) System.out.print(nums[i]+" ");
		sc.close();
	}
}


*/
