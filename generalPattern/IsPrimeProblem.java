import java.util.Scanner;

public class IsPrimeProblem {
	
	private static boolean isPrime(int N) {
		for(int i=2; i<(int) Math.sqrt(N); i++) {
			if(N % i == 0) return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		if(isPrime(N)) System.out.print("Prime-Number");
		else System.out.print("Not-a-Prime-Number");
		sc.close();
	}

}

/*

Coding Challenge 3:-
Math/Logic: Check Prime (Optimized)

Problem Statement:-
Write a highly optimized function to check if a large number N is prime.

Optimal Logic / Approach:-
Instead of iterating from 2 to N, iterate from 2 to sqrt(N). If N is divisible by any number in this range, it is
not prime. Time complexity: O(sqrt(N)).

*/
