import java.util.Scanner;

public class MaxProfit{
	
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] nums = new int[size];
        
        for(int i=0; i<size; i++) nums[i] = sc.nextInt();
           
        int maxProfit=0;
            
        for(int i=1; i<size; i++){
          if(nums[i] > nums[i-1]) {
            maxProfit += nums[i] - nums[i-1];
          }
        }
            
        System.out.println(maxProfit);
        sc.close();
    }
    
}


/*

Problem statement:-
Joyal is interested in maximizing his profit by buying and selling a particular product. He has a list of prices for the product over a period of time. Joyal wants to find the maximum profit he can make by buying and selling the product at different prices within this period.

Write a program to help Joyal find the maximum profit he can make. The program should take as input the number of days Joyal has observed the prices, followed by the prices of the product on each day. It should then output the maximum profit Joyal can make.

Example:-
Input:-
7
2 30 15 10 8 25 80

Output:-
100

Explanation:-
For transaction 1, the share is bought at 2 and sold at 30. Profit = 30 – 2 = 28.
For transaction 2, the share is bought at 8 and sold at 80. Profit = 80 – 8 = 72.
Total profit = transaction 1 profit + transaction 2 profit = 28+72=100.
Thus, the output is 100.

Input format :-
The first line of input consists of the size of the array, n.
The next line of input consists of n space-separated array elements.

Output format :-
The output displays the maximum profit.

Refer to the sample output for the formatting specifications.

Code constraints :-
1 ≤ n ≤ 15
1 ≤ array elements ≤ 1000

Sample test cases :-
Input 1 :-
7
2 30 15 10 8 25 80
Output 1 :-
100

Input 2 :-
8
10 5 22 65 8 75 90 80
Output 2 :-
142

Input 3 :-
7
2 30 15 10 8 25 80
Output 3 :-
100

*/
