import java.util.Scanner;

public class LastWord {
	//Method 1
	private static void lastWordLength(String s) {
		s = s.trim();
		int lastSpaceIdx = s.lastIndexOf(' ');
		
		String lastWord = s.substring(lastSpaceIdx+1);
		System.out.println(lastWord.length());
		System.out.println(lastWord);
		
	}

  //Method 2
	private static void lastWordLength(String s) {
		int end = s.length()-1, res=0, start;
		
		while(end>=0 && s.charAt(end) == ' ') end--;
		
		start = end;
		
		while(start>=0 && s.charAt(start) != ' ') {
			res++;
			start--;
		}
		
		start += 1;
		end += 1;
		
		if(res > 0) {
			System.out.println(res);
			System.out.println(s.substring(start, end));
		}else System.out.println("String Empty");
		
	}
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	String s = sc.nextLine();
	
	lastWordLength(s);

	sc.close();
	}
}


/*

Problem Statement:-
Given a string s consisting of words and spaces, return the length of the last word in the string.

Example 1:-
Input: s = "Hello World"

Output: -
5
World

Explanation: The last word is "World" with length 5.          

Example 2:-
Input:-
s = "luffy is still joyboy"

Output:-
6
joyboy

Explanation: The last word is "joyboy" with length 6.

Input format :-
The input consists of a string s.

Output format :-
The first line of output prints the length of the last word in the string.
The second line prints the last word in the string.

Refer to the sample output for the formatting specifications.

Code constraints :-
1 ≤ s.length ≤ 100
s consists of only English letters and spaces ' '.

There will be at least one word in s.

Sample test cases :-
Input 1 :-
Hello World
Output 1 :-
5
World

Input 2 :-
luffy is still joyboy
Output 2 :-
6
joyboy

*/
