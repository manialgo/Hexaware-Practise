import java.util.Scanner;

public class LongestCommonPrefix{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] strs = new String[n];
        int min=200,j;
        for(int i=0; i<n; i++){
            strs[i] = sc.next();
            min = Math.min(min, strs[i].length());
        }
        String res = "";
        char ch='a';
        for(int i=0; i<min; i++){
            ch = strs[0].charAt(i);
            for(j=0; j<n; j++){
                if(ch != strs[j].charAt(i)) break;
            }
            if(j < n) break;
            if(j == n) res += ch;
        }
        System.out.println("\""+res+"\"");
        
        sc.close();
    }
}

/*

Problem Statement:-
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string ""

Example 1:-
Input:-
3
flower
flow
flight

Output:-
"fl"

Explanation:-
All three words start with "fl", so that is the longest common prefix.
After "fl", the third word "flight" differs from "flow" and "flower".
Hence, "fl" is the longest common starting sequence in all strings.

Example 2:-
Input:-
3
dog
racecar
car

output:-
""

Explanation: There is no common prefix among the input strings.

Input format :-
The first line contains an integer n — the number of strings.
The next n lines each contain a string (lowercase English letters only).

Output format :-
The output consists of a single line containing the longest common prefix among all the input strings.
If there is no common prefix, output an empty string


Refer to the sample output for formatting specifications.

Code constraints :-
1 <= strs.length <= 200
0 <= strs[i].length <= 200

strs[i] consists of only lowercase English letters if it is non-empty.

Sample test cases :-
Input 1 :-
3
flower
flow
flight
Output 1 :-
"fl"

Input 2 :-
3
dog
racecar
car
Output 2 :-
""

*/
