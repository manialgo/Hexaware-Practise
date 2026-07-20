import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class RemoveSpace{
  
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        List<Character> list = new ArrayList<>();
        for(char ch : s.toCharArray()){
            if(!list.contains(ch)) list.add(ch);
        }
        s="";
        //for(Character ch : list) s += ch;
        for(int i=0; i<list.size(); i++)	s+=list.get(i);
        System.out.println(s);
        sc.close();
    }
  
}

/*

Problem Statement:-
You have been given a string having space-separated multiple words. Reprint the string after removing the characters that occur more than once in the string. You are supposed to remove the later occurrences of a character.

Input format :-
The input consists of a string that may have white spaces.

Output format :-
The output displays the string as per the mentioned specification.

Code constraints :-
1 <= Length of the string <= 50

Sample test cases :-
Input 1 :-
aaaaaaaaa
Output 1 :-
a

Input 2 :-
quick fox jumps lake
Output 2 :-
quick foxjmpslae

*/
