import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class FirstNonRepeatingCharacter {

	private static char firstNonRepeatChar(String s) {
		Map<Character, Integer> map = new HashMap<>();
		char[] chArr = s.toCharArray();
		int size = chArr.length;
		char temp;
		for(int i=0; i<size; i++) {
			temp = chArr[i];
			map.put(temp, map.getOrDefault(temp, 0)+1);
		}
		for(int i=0; i<size; i++) {
			temp = chArr[i];
			if(map.get(temp) == 1) return temp;
		}
		return '0';
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char result = firstNonRepeatChar(s);
		if(result == '0') System.out.println("No non-repeated Characters");
		else System.out.println(result);
		
		sc.close();
	}

}


/*

Coding Challenge 1:-

Strings: First Non-Repeating Character

Problem Statement:-
Write the logic to find the first non-repeating character in a string.
E.g., for 'hexaware', 'h' is the first.

Optimal Logic / Approach:

Use a HashMap or an integer array of size 256. Traverse the string and store the frequency of each
character. Traverse the string again and return the first character with a frequency of 1.

*/
