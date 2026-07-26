import java.util.Scanner;

public class BubbleSortProfitLossAnalysis{

    private static void bubbleSort(int[] nums, int size){
        int temp;
        for(int i=0; i<size-1; i++){
            for(int j=0; j<size-i-1; j++){
                if(nums[j] > nums[j+1]){
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] nums = new int[size];
        for(int i=0; i<size; i++) nums[i] = sc.nextInt();
        bubbleSort(nums, size);
        for(int i=0; i<size; i++) {
            System.out.print((i==size-1) ? nums[i] : nums[i]+" ");
        }
        sc.close();
    }
}


/*

Problem Statement:-
Lena, a financial analyst, needs to sort daily profit and loss values for a stock portfolio, which can be either positive or negative. Using a bubble sorting technique, she must arrange these values in ascending order.

Help Lena ensure the profit and loss values are sorted accurately.

Input format :-
The first line of input consists of an integer n, representing the number of daily values.
The second line consists of n space-separated integers, representing the profit(positive) and loss(negative) values.

Output format :-
The output prints the sorted profit and loss values in ascending order.

Refer to the sample output for formatting specifications.

Code constraints :-
1 ≤ n ≤ 10
-100 ≤ profit/loss values ≤ 100

Sample test cases :-
Input 1 :-
6
23 -45 67 12 57 13
Output 1 :-
-45 12 13 23 57 67 

Input 2 :-
7
45 35 75 15 -78 65 -34
Output 2 :-
-78 -34 15 35 45 65 75

*/
