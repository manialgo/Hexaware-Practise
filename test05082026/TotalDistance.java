import java.util.Scanner;
public class TotalDistance{
    
    private static int totalDistance(int[] nums, int size){
        int sum=0;
        for(int num : nums) sum += (num*1);
        return sum;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i, result;
        int N = sc.nextInt();
        int[] dayOne = new int[N];
        for(i=0; i<N; i++) dayOne[i] = sc.nextInt();
        
        int M = sc.nextInt();
        int[] dayTwo = new int[M];
        for(i=0; i<M; i++) dayTwo[i] = sc.nextInt();
        
        result = totalDistance(dayOne, N) + totalDistance(dayTwo, M);
        
        System.out.println("Total distance covered: "+result+" units");
        
        sc.close();
    }
}

/*

Problem Statement:-
You are given the number of steps taken by a person on two consecutive days. Your task is to merge the step counts from both days and calculate the total distance covered by the person, assuming that each step covers a fixed distance of 1 unit.

Write a program that takes the step counts for the two days as input, merges them, calculates the total distance covered, and outputs the result.

Example:-
Input:-
2
100 150
3
200 250 300

Output:-
Total distance covered: 1000 units

Explanation:-
Merge two arrays into a single array: [100, 150, 200, 250, 300].
Now, calculate the total distance covered by multiplying each step count by the fixed step distance, which is 1 unit.
For 100 steps: 100 * 1 = 100 units
For 150 steps: 150 * 1 = 150 units
For 200 steps: 200 * 1 = 200 units
For 250 steps: 250 * 1 = 250 units
For 300 steps: 300 * 1 = 300 units
Adding up these distances, the total distance covered is: Total distance = 100 + 150 + 200 + 250 + 300 = 1000 units.

Input format :-
The first line of input consists of an integer N, representing the number of steps taken on the first day.
The second line consists of N space-separated integers, representing the steps.
The third line consists of an integer M, representing the number of steps taken on the second day.
The fourth line consists of M space-separated integers, representing the steps.

Output format :-
The output prints the total distance covered by the person in units.

Refer to the sample output for formatting specifications.

Code constraints :-
1 ≤ N, M ≤ 100
1 ≤ steps ≤ 1000

Sample test cases :-
Input 1 :-
2
100 150
3
200 250 300
Output 1 :-
Total distance covered: 1000 units

Input 2 :-
4
50 75 100 125
5
150 200 250 300 350
Output 2 :-
Total distance covered: 1600 units

*/
