import java.util.Scanner;

public class RemoveDuplicateInString{
  
    private static String removeDuplicates(String s){
        int[] arr = new int[26];
        int i;
        StringBuilder sb = new StringBuilder();
        
        for(i=0; i<s.length(); i++) arr[s.charAt(i)-'a']++;
        
        for(i=0; i<26; i++) if(arr[i] >=1) sb.append((char)(i+97));
        
        return sb.toString();
    }
  
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
      
        String s = sc.next();
      
        String result = removeDuplicates(s);
        System.out.println(result);
      
        sc.close();
    }
}

/*

Problem Statement:-
Given a string s, remove duplicate letters so that every letter appears once and only once. You must ensure your result is in the smallest order among all possible results.

Example 1:-
Input:-
s = "bcabc"

Output:-
"ABC"

Example 2:-
Input:-
cbacdcbc

Output:-
abcd

Input format :-
The first line of input consists of a string s, representing the input string.

Output format :-

Refer to the sample output for the formatting specifications.

Code constraints :-
1 ≤ s.length ≤ 100
s consists of only lowercase English letters.

Sample test cases :-
Input 1 :-
bcabc
Output 1 :-
abc

Input 2 :-
cbacdcbc
Output 2 :-
abcd

*/
