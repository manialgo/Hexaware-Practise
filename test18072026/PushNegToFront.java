// Idea: using the same array, get the negaticve number from left to right and positives from right to left then reverse the positive sides
import java.util.Scanner;

public class PushNegToFront{
	
    private static void reverse(int[] nums, int start, int end){
        int temp;
        while(start<=end){
            temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    
    public static void main(String[] args){
    	
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] nums = new int[size];
        int temp, i=0, j=size-1;
        while(i<=j){
            temp = sc.nextInt();
            if(temp < 0) nums[i++] = temp;
            else nums[j--] = temp;
        }
        
        reverse(nums, i, size-1);
        
        for(int k=0; k<size; k++){
            System.out.print((k==size-1) ? nums[k] : nums[k]+" ");
        }
        
        sc.close();
    }
}


/* NEED A EASY ? LEARN FURTHER

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class PushNegToFront {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i = 0; i < n; i++)  arr[i] = sc.nextInt();
        
        List<Integer> neg = new ArrayList<>();
        List<Integer> pos = new ArrayList<>();
        
        for(int num : arr) {
            if(num < 0) neg.add(num);
            else pos.add(num);
        }
        
        int idx = 0;
        for(int num : neg) arr[idx++] = num;
        for(int num : pos) arr[idx++] = num;
        
        for(int i = 0; i < n; i++) System.out.print((i < n-1) ? arr[i] + " " : arr[i]);
        sc.close();
    }
}

*/

/*

Problem Statement:-
Eva is working on a data pre processing task where she needs to rearrange elements in an array such that all negative numbers come before all the positive numbers. The order of negative numbers and the order of positive numbers should remain the same as in the original array. Eva must write a program to accomplish this rearrangement.

Input format :-
The first line contains an integer n, representing the number of elements in the array.
The second line contains n space-separated integers, representing the elements of the array.

Output format :-
A single line containing the n integers of the array after rearranging, where all negative numbers precede all positive numbers, space-separated.

Refer to the sample output for formatting specifications.

Code constraints :-
2 ≤ N ≤ 30

Sample test cases :-
Input 1 :-
13
12 -23 34 22 -43 -11 -90 8 -87 78 -98 11 13
Output 1 :-
-23 -43 -11 -90 -87 -98 12 34 22 8 78 11 13

Input 2 :-
6
1-3 -4 -5 2 23
Output 2 :-
-3 -4 -5 1 2 23

*/
