import java.util.Scanner;

public class PrintWithoutSpace{

    private static void displayWord(String str){
        String[] strArr = str.split(" ");
        for(String s : strArr) System.out.println(s);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        displayWord(str);
        sc.close();
    }
  
}

/*

Problem Statement:-
﻿Write a program that takes a sentence as input and separates each word from the sentence. The program should then display each word on a new line.

Input format :-
The input consists of a string as a sentence or a single string.

Output format :-
The output displays each string in a new line.

Code constraints :-
1 <= Length of the string <= 100

Sample test cases :-
Input 1 :-
Hi_Hello
Output 1 :-
Hi_Hello

Input 2 :-
Stay away & stay safe
Output 2 :-
Stay
away
&
stay
safe

*/
