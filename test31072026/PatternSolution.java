import java.util.Scanner;
public class PatternSolution{

    private static void patternPrint(int N){
        int i, j, k;
        for(i=0; i<N; i++) System.out.print(N+" ");
        System.out.println();
        for(j=1; j<N; j++){
            for(k=0; k<N; k++){
                if(k == N/2) System.out.print(j+" ");
                else System.out.print(N+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        patternPrint(N);
        sc.close();
    }
}

/*

Problem Statement:-
Write a program to print the following pattern.

Input:-
5

Output:-

5 5 5 5 5 
5 5 1 5 5 
5 5 2 5 5 
5 5 3 5 5 
5 5 4 5 5 

Input format :-
The input consists of an integer N.

Output format :-
The output prints the required pattern as given in the problem statement.

Refer to the sample output for the formatting specifications.

Code constraints :-
1 <= N <= 20

Sample test cases :-
Input 1 :-
5
Output 1 :-

5 5 5 5 5 
5 5 1 5 5 
5 5 2 5 5 
5 5 3 5 5 
5 5 4 5 5 


*/
