import java.util.Scanner;

public class LongestContinuousSequence {
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) {
        	sc.close();
        	System.out.println("Value-of-K-required(rerun-the-code)");
        	return;
        }
        int K = sc.nextInt();
        String S = sc.next(); // Handles trailing newlines properly
        
        System.out.println(getConsecutiveZeros(S, K));
        sc.close();
    }

    private static int getConsecutiveZeros(String S, int K) {
        int n = S.length();
        int maxInSingle = 0;
        int current = 0;

        // Find maximum zeros in a single instance of S
        for (int i = 0; i < n; i++) {
            if (S.charAt(i) == '0') {
                current++;
                maxInSingle = Math.max(maxInSingle, current);
            } else {
                current = 0;
            }
        }

        // If the string is all zeros
        if (maxInSingle == n) return n * K;

        // If K == 1, boundary joining doesn't apply
        if (K == 1) return maxInSingle;

        // Count leading zeros
        int prefixZeros = 0;
        while (prefixZeros < n && S.charAt(prefixZeros) == '0') prefixZeros++;

        // Count trailing zeros
        int suffixZeros = 0;
        while (suffixZeros < n && S.charAt(n - 1 - suffixZeros) == '0') suffixZeros++;

        // The maximum sequence is either within a single string or across a boundary
        return Math.max(maxInSingle, prefixZeros + suffixZeros);
    }
  
}

/*

Kabir given you a binary string S and an integer k. Your task is to find the Longest continuous sequence of '0' after repeating the given string K time. 

Input format :-
First line of input contains an integer K.
Next line contains a binary string S.

Output format :-
Print an integer denoting the longest continuous sequence of 0

Code constraints :-
1<= S.length() <= 50
1 <= K <= 30

Sample test cases :-
Input 1 :-
3
100001
Output 1 :-
4

*/
