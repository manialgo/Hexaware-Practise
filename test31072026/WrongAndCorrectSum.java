import java.util.Scanner;

public class WrongAndCorrectSum{

    private static int wrongsetsum(int[] nums, int size){
        int sum = 0, i;
        for(i=0; i<size; i++) sum += (nums[i] < 0) ? -1*nums[i] : nums[i];
        return sum;
    }

    private static int correctsetsum(int[] nums, int size){
        int sum = 0, i;
        for(i=0; i<size; i++) sum += nums[i];
        return sum;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] nums = new int[size];
        int i, wrongSum, correctSum;
        for(i=0; i<size; i++) nums[i] = sc.nextInt();

        wrongSum = wrongsetsum(nums, size);
        correctSum = correctsetsum(nums, size);

        System.out.println(wrongSum+"\n"+correctSum);

        sc.close();
    }
}

/*

Problem Statement:-
Write a program that takes an integer array as input and calculates the sum of its elements in two different ways.

Create a function wrongsetsum that calculates the sum of the absolute values of all the elements in the array. This sum is referred to as the "wrong set sum". It can be obtained by taking the absolute value of each element and summing them together.

Create a function correctsetsum that calculates the sum of all the elements in the array without taking their absolute values. This sum is referred to as the "correct set sum".

Finally, the program should display both the "wrong set sum" and the "correct set sum".

Input format :-
The first line of input consists of the size of the array, N.
The second line of input consists of elements of the array, arr separated by spaces.

Output format :-
The first line of output prints the wrong sum.
The second line of output prints the correct sum.

Code constraints :-
2 <= N <= 100
-103 <= arr[i] <= 103

Sample test cases :-
Input 1 :-
5
-1 2 -3 4 -5
Output 1 :-
15
-3

*/
