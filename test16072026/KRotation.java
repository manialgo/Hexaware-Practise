//TEST
import java.util.Scanner;
public class KRotation {
    public static int[] reverse (int[] arr){
        int size = arr.length;
        int temp = arr[0];
        for(int i=0; i<size-1; i++) arr[i] = arr[i+1];
        arr[size-1]=temp;
        return arr;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size; i++) arr[i] = sc.nextInt();
        int K = sc.nextInt();
        for(int i=0; i<K; i++) arr = reverse(arr);
        for(int i=0; i<size; i++) System.out.print((i==size-1) ? arr[i] : arr[i]+" ");
    }
}

/*

Problem statement:-
Given an array 'arr' with 'n' elements, the task is to rotate the array to the left by 'k' steps, where 'k' is non-negative.


Example:-
'arr '= [1,2,3,4,5]
'k' = 1  rotated array = [2,3,4,5,1]
'k' = 2  rotated array = [3,4,5,1,2]
'k' = 3  rotated array = [4,5,1,2,3] and so on.

Sample Input 1: -
8
7 5 2 11 2 43 1 1
2

Sample Output 1:-
2 11 2 43 1 1 7 5

Explanation of Sample Input 1:-
Rotate 1 steps to the left: 5 2 11 2 43 1 1 7
Rotate 2 steps to the left: 2 11 2 43 1 1 7 5

Sample Input 2:-
4
5 6 7 8
3

Sample Output 2:-
8 5 6 7

Explanation of Sample Input 2:-
Rotate 1 steps to the left: 6 7 8 5
Rotate 2 steps to the left: 7 8 5 6
Rotate 3 steps to the left: 8 5 6 7

Expected Time Complexity:-
O(n), where ‘n’ is the size of the array ‘arr’ and ‘k’ is the number of rotations.

Input format :-
The first line of input consists of the number of integers n.
The second line of input consists of n elements in the array separated by spaces.
The third line of input consists of the integer k.

Output format :-
The output prints the rotated elements in the array separated by spaces.

Refer to the sample output for the formatting specifications.

Code constraints :-
1 ≤ n ≤ 20
1 ≤ arr[i] ≤ 90
1 ≤ k ≤ 11

Sample test cases :-
Input 1 :-
8
7 5 2 11 2 43 1 1
2
Output 1 :-
2 11 2 43 1 1 7 5 

Input 2 :-
4
5 6 7 8
3
Output 2 :-
8 5 6 7

*/
