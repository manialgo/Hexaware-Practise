import java.util.Scanner;

public class LongestCommonSubSequenceProblem {
	
    public static int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();

        int[][] dp = new int[m+1][n+1];
        
        for(int i=1; i<=m; i++){
            for(int j=1; j<=n; j++){
                if(text1.charAt(i-1) == text2.charAt(j-1)) dp[i][j] = dp[i-1][j-1] + 1;
                else dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
            }
        }
        return dp[m][n];
    }
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String text1 = sc.next();
		String text2 = sc.next();
		
		int result = longestCommonSubsequence(text1, text2);
		System.out.println(result);
		
		sc.close();
	} 
}

/*

Problem Statement:-
Given two strings, text1, and text2, return the length of their longest common subsequence. If there is no common subsequence, return 0.

A subsequence of a string is a new string generated from the original string with some characters (can be none) deleted without changing the relative order of the remaining characters. For example, "ace" is a subsequence of "abcde".

A common subsequence of two strings is a subsequence that is common to both strings.

Input format :-
The first line of input consists of a string representing text1.
The second line of input consists of a string representing text2.

Output format :-
The output prints a single integer representing, the length of the Longest Common Subsequence of the two strings.

Refer to the sample output for the formatting specifications.

Code constraints :-
In the given scenario, the test cases will fall under the following constraints:
1 ≤ text1.length, text2.length ≤ 100
text1 and text2 consist of only lowercase English characters.

Sample test cases :-
Input 1 :-
abcde
ace
Output 1 :-
3

Input 2 :-
abc
abc
Output 2 :-
3

Input 3 :-
abc
def
Output 3 :-
0

*/
