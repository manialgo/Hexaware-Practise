import java.util.Scanner;
public class MaxSumOfSubArray{
    
    private static int maxSum(int[] nums, int N){
        // Kadane's Algorithm
        int sum = nums[0], maxSum = nums[0], i;
        for(i=1; i<N; i++){
            sum = ( nums[i] > sum+nums[i] ) ? nums[i] : sum+nums[i] ;
            maxSum = (maxSum > sum) ? maxSum : sum;
        }
        return maxSum;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] nums = new int[N];
        for(int i=0; i<N; i++) nums[i] = sc.nextInt();
        int result =  maxSum(nums, N);
        System.out.println(result);
      
        sc.close();
    }
}

/*

Problem Statement:-
Given an array arr[] of size N. The task is to find the sum of the contiguous subarray within an arr[] with the largest sum. 

For example, in an array [-2, -3, 4, -1, -2, 1, 5, -3], the contiguous subarray [4, -1, -2, 1, 5] has the largest sum, which is 7.

Input format :-
The first input consists of the number of array elements N.
The second input consists of N space-separated integers representing the elements of the array.

Output format :-
The output displays the sum of the contiguous sub-array that has the largest sum.

Refer to the sample output for formatting specifications.

Sample test cases :-
Input 1 :-
8
-2 -3 4 -1 -2 1 5 -3
Output 1 :-
7

*/
