import java.util.Scanner;

public class ProbabilityOfPouring{
	//The constraint gives the maximum
	//approx ranges: for extreme case of n=5000
	static final int Max = 200;
	
	//double array for the memorization
	static double[][] memo = new double[Max][Max];

	private static double fun(int A, int B) {
		if(A <=0  && B <= 0) return 0.5;
		if(A <= 0) return 1.0;
		if(B <= 0) return 0.0;
		
		// if fails need to return the values in that particular array values
		// eventually that value comprises of separable individual splits
		// Example:
		// f(4,4) = 0.25 * [ f(4-4,4-0) + f(4-3,4-1) + f(4-2,4-2) + f(4-1,4-3) ]
	    //	  	  = 0.25 * [ f(0,4) + f(1,3) + f(2,2) + f(3,1) ]
		
		if(memo[A][B] >= 0) return memo[A][B];
		
		//Memorization strategy
		memo[A][B] = 0.25*(fun(A-4, B) + fun(A-3, B-1) + fun(A-2, B-2) + fun(A-1, B-3));
		
		//returing the final one
		return memo[A][B];
	}
	
	private static double soupPouring(int N) {
		// if N> 4800 it converges the probability to 0.99999-- it eventually touches the 1.0 so efficiently break that case
		return N > 4800 ? 1.0 : fun((N+24)/25, (N+24)/25);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0; i<Max; i++) {
			for(int j=0; j<Max; j++)
				memo[i][j] = -1.0;
		}
		//possibilities for we are getting the probability 0.0 so need to fix the values to -1.0 at initital
		//else need to remove the -1.0 means have to condition at line-22 to "if(memo[A][B] > 0) return memo[A][B];"
		
		System.out.printf("%.3f",soupPouring(n));
		sc.close();
	}
}


/*

Problem Statement:-
There are two types of soup: type A and type B. Initially, we have n ml of each type of soup. 

There are four kinds of operations:-

Serve 100 ml of soup A and 0 ml of soup B,
Serve 75 ml of soup A and 25 ml of soup B,
Serve 50 ml of soup A and 50 ml of soup B, and
Serve 25 ml of soup A and 75 ml of soup B.

When we serve some soup, we give it to someone, and we no longer have it. For each turn, we will choose from the four operations with an equal probability of 0.25. If the remaining volume of soup is not enough to complete the operation, we will serve as much as possible. We stop once we no longer have some quantity of both types of soup.

Note that we do not have an operation where all 100 ml of Soup B are used first.

Return the probability that soup A will be empty first, plus half the probability that A and B become empty at the same time. Use Recursion to solve the problem.

Example:-
Sample Input 1
n = 50

Sample Output 2
0.625

Explanation
If we choose the first two operations, A will become empty first.
For the third operation, A and B will become empty at the same time.
For the fourth operation, B will become empty first.
So the total probability of A becoming empty first plus half the probability that A and B become empty at the same time, is 0.25 * (1 + 1 + 0.5 + 0) = 0.625.

Input format :-
The input consists of an integer n, representing the total volume of the soup.

Output format :-
The output prints the probability that soup A will be empty first, plus half the probability that A and B become empty at the same time.

Refer to the sample output for formatting specifications.

Code constraints :-
0 ≤ n ≤ 100

Sample test cases :-
Input 1 :-
50
Output 1 :-
0.625

Input 2 :-
100
Output 2 :-
0.719

*/
