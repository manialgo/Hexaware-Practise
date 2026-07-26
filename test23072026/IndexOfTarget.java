import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class IndexOfTarget{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int temp;
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i<size; i++){
            temp = sc.nextInt();
            map.put(temp, i);
        }

        int target = sc.nextInt();
        if(map.containsKey(target)) System.out.println(map.get(target));
        else System.out.println("-1");
        sc.close();

    }
}

/*

Problem Statement:-

Search in Rotated Sorted Array
There is an integer array nums sorted in ascending order (with distinct values).

Before being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].

Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.

You must write an algorithm with O(log n) runtime complexity.

Example 1:-
Input:-
nums = 4 5 6 7 0 1 2, target = 0

Output:- 
4

Example 2:-
Input:-
nums = 4 5 6 7 0 1 2, target = 3

Output:- 
-1

Example 3:-
Input:-
nums = 1, target = 0

Output:-
-1

Input format :-
The first line of input contains a space-separated list of distinct integers representing a rotated sorted array.
The second line contains an integer representing the target value to search.

Output format :-
The output prints an integer indicating the index of the target in the array, or -1 if the target is not present.

Refer to the sample output for the formatting specifications.

Code constraints :-
1 ≤ nums.length ≤ 5000
-104 ≤ nums[i] ≤ 104

All values of nums are unique.

nums is an ascending array that is possibly rotated.
-104 ≤ target ≤ 104

Sample test cases :-
Input 1 :-
7
4 5 6 7 0 1 2
0
Output 1 :-
4

Input 2 :-
7
4 5 6 7 0 1 2
3
Output 2 :-
-1

Input 3 :-
1
1
0
Output 3 :-
-1

*/
