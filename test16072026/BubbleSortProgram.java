package test16072026;

import java.util.Scanner;

public class BubbleSortProgram {

    private static void bubbleSort(int[] arr, int n) {
    	
        for(int i = 0; i < n - 1; i++) {
            for(int j = 0; j < n - i - 1; j++) {
                if(arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
      
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
            
        bubbleSort(arr, n);

        for(int i = 0; i < n; i++) System.out.print((i < n-1) ? arr[i] +" ": arr[i]);
        
        sc.close();
    }

}

/*

Write a program for bubble sorting

Input format :-
Input contains the size and the values

Output format :-
Print the sorted values

Sample test cases :-
Input 1 :-
10
9 6 4 2 65 12 43 89 10 3
Output 1 :-
2 3 4 6 9 10 12 43 65 89 

*/
