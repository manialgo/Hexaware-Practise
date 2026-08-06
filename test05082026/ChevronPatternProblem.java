import java.util.Scanner;
public class ChevronPatternProblem{
    
    private static String chevronPattern(String s, int x){
        if(x==1) return s;

        StringBuilder[] rows = new StringBuilder[x];
        for(int i=0; i<x; i++) rows[i] = new StringBuilder();
        int i=0;
        boolean goingDown = false;
        
        for(char ch : s.toCharArray()){
            rows[i].append(ch);
            if(i==0 || i == x-1)    goingDown = !goingDown;
            i += goingDown ? 1 : -1;
        }
        
        StringBuilder sb = new StringBuilder();
        for(StringBuilder row : rows)   sb.append(row);
        
        return sb.toString();
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        int x = sc.nextInt();
        
        String result = chevronPattern(s, x);
        
        System.out.println(result);
        
        sc.close();
    }
}

/*

Problem Statement:-
In the realm of creative programming, Samantha is presented with an intriguing task that fuses strings and artistry. 
Given the string and the number of rows, she is challenged to fashion an exquisite visual by arranging the string in a row-wise chevron style across the specified rows. 
This entails crafting an arrangement that imitates the unfolding elegance of a chevron pattern, where each row contributes to the artwork's final form. 

With her imaginative spirit ignited, Samantha ingeniously orchestrates the characters into a delightful pattern, conjuring a vibrant canvas that combines the magic of strings with the art of visualization.

Example:-

Input:-
str = "ABCDEFGH"
x = 2

Output:-
ACEGBDFH

Explanation:-
Let us write the input string in a Zig-Zag fashion in 2 rows.
A    C    E    G
    B    D    F    H

Now concatenate the two rows and ignore spaces in every row. We get "ACEGBDFH".

Input format :-
The first line of input consists of the string.
The second line consists of an integer x, the number of rows.

Output format :-
The output prints the string after concatenating x rows in a zigzag (otherwise called a chevron) form.

Refer to the sample input and output for better understanding.

Code constraints :-
1 ≤ x ≤ 1000

Sample test cases :-
Input 1 :-
qrrc
3
Output 1 :-
qrcr

Input 2 :-
rfkqyuqfjkxy
2
Output 2 :-
rkyqjxfqufky

Input 3 :-
ABCDEFGH
2
Output 3 :-
ACEGBDFH


My Explanation:-
So the chevron pattern generally organize like a inverted 'V' shaped character so the moment should be in down or up upon reaching the first and last row of the given 'x' value.
Creating a value Boolean flag for checking whether it reached it's 0th index or the last one.
And we should holds as much StringBuilder required in x*counts for every row in the linear traversing in simultaneously append the characters in the string and if it reaches the 0th and last-1(index) value then change it's direction is required
*/
