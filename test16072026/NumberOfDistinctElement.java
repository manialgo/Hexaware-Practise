package test16072026;

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class NumberOfDistinctElement{
  
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<>();
        int temp1 = sc.nextInt(), temp2 = sc.nextInt();
        
        int temp=0;
        for(int i=0; i<temp1+temp2; i++) {
            temp = sc.nextInt();
            if(set.contains(temp)) set.remove(temp);
            else set.add(temp);
        }
        
        System.out.println(set.size());
        
        sc.close();
    }
}

/*
PROBLEM APPROACH
package learningStack;

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class NumberOfDistinctElement {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int len1 = sc.nextInt();
        int len2 = sc.nextInt();
        
        int[] arr1 = new int[len1];
        for(int i = 0; i < len1; i++) arr1[i] = sc.nextInt();
        
        int[] arr2 = new int[len2];
        for(int i = 0; i < len2; i++)	arr2[i] = sc.nextInt();
        
        int result = distinctElementCount(arr1, len1, arr2, len2);
        System.out.println(result);
        
        sc.close();
    }
    

    public static int distinctElementCount(int[] arr1, int len1, int[] arr2, int len2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        
        for(int num : arr1)	set1.add(num);
        
        for(int num : arr2) set2.add(num);
        
        int count1 = 0;
        for(int num : set1) if(!set2.contains(num)) count1++;
        
        
        int count2 = 0;
        for(int num : set2) if(!set1.contains(num)) count2++;
        
        return count1 + count2;
    }
}

*/

/*

Problem Statement:-
Given two positive integer arrays ary1 and arr2 of lengths len1 and len2 respectively. Write a program to count the number of elements which are not common In the arrays.
The input to the function distinctElementCount of two arrays arr1 and arr2 and their lengths len1 and len2 respectively.
The function return the number of elements which are not common in both arrays.

Example.

arr1 = {1, 2,3, 4, 5, 6, 7, 8, 9, 10}, lent = 10 

arr2 = {11, 12, 13, 4, 5, 6, 7, 18, 19, 20}, len2 = 10 

The distinct elements are 1, 2, 3, 8, 9, 10, 11, 12, 13, 18, 19 and 20 so the function should return 12.

Input format :-
Input contains the length of the arrays and the values

Output format :-
Print non repeating elements in { } and the count

Code constraints :-
1 ≤ n ≤105
1 ≤ values ≤ 109

Sample test cases :-
Input 1 :-
5 6
34 89 12 45 93
12 93 45 23 78 35
Output 1 :-
5

*/
