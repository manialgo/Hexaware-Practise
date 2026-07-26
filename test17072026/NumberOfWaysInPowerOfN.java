import java.util.Scanner;

public class NumberOfWaysInPowerOfN {
	
    private static int getAllWays(int remainingSum, int power, int base){
    	
    	int result = (int)Math.pow(base, power);
    	if (result == remainingSum)	return 1 ;
    	
    	if (result > remainingSum)	return 0 ;
    	return getAllWays(remainingSum - result, power, base + 1) + getAllWays(remainingSum, power, base + 1) ;
      
    }
    
	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        
    	int x = sc.nextInt() ;
    	int n = sc.nextInt() ;
    
    	System.out.println( getAllWays(x, n, 1) ) ;
    	
		  sc.close();
	}

}


/*

Problem Statement:-
Write a program using recursion to return the number of ways to express x as a sum of nth powers of unique natural numbers.

Example 1
Input:-
10
2

Output:-
1

Explanation:-
x = 10
n = 2
10 = 12 + 32, hence we have only 1 possibility.

Example 2
Input:-
100
2

Output:-
3

Explanation:-
x = 100
n = 2
100 = 102 OR 62 + 82 OR 12 + 32 + 42 + 52 + 72, hence total 3 possibilities.

Function Specifications: getAllWays(int, int, int)

Input format :-
The first line of input consists of the integer x.
The second line consists of the integer n.

Output format :-
The output is the number of ways to express x as a sum of nth powers of unique natural numbers.

Refer to the sample output for formatting specifications.

Code constraints :-
1 ≤ x ≤ 105
1 ≤ n ≤ 5

Sample test cases :-
Input 1 :-
100
2
Output 1 :-
3

Input 2 :-
10
2
Output 2 :-
1

Input 3 :-
109
5
Output 3 :-
0

*/
