import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {
  // METHOD 1	
	private static boolean isAnagram(String str1, String str2) {
		char[] chArr1 = str1.toCharArray();
		Arrays.sort(chArr1);
		
		char[] chArr2 = str2.toCharArray();
		Arrays.sort(chArr2);
		
		return String.valueOf(chArr1).equals(String.valueOf(chArr2));
	}
	
	/* METHOD 2
	private static boolean isAnagram(String str1, String str2) {
		int[] characters = new int[26];
		
		char[] chArr1 = str1.toCharArray();
		int size1 = chArr1.length;
		
		char[] chArr2 = str2.toCharArray();
		int size2 = chArr2.length;
		
		for(int i=0; i<size1; i++) characters[chArr1[i] - 97]++;
		for(int i=0; i<size2; i++) characters[chArr2[i] - 97]--;
		
		for(int i=0; i<26; i++) if(characters[i] != 0) return false;
		
		return true;
	}
	*/
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str1 = sc.next();
		String str2 = sc.next();
		
		if(isAnagram(str1, str2)) System.out.print("Is-Anagram");
		else System.out.print("It-is-not-a-Anagram");
		
		sc.close();
	}
}

/*

Coding Challenge 4:-
Strings: Valid Anagram
Problem Statement:- Check if two given strings are anagrams of each other (contain the same characters in any order).

Optimal Logic / Approach:-
Method 1:- Sort both strings and compare. (O(n log n)).
Method 2 (Better): Create an array of size 26 (for alphabets). Increment counts for string 1, decrement counts for string 2. If the array is all zeros at the
end, they are anagrams. (O(n)).

*/
