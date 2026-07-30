import java.util.Scanner;

public class SumOfDiaEle{
    
    private static int matDiagonalSum(int[][] mat, int row, int col){
        int sum = 0;
        for(int i=0; i<row; i++){
            for(int j=0;j<col; j++){
                if(i==j) sum += mat[i][j];
            }
        }
        return sum;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        
        int[][] mat = new int[m][n];
        
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        
        System.out.println(matDiagonalSum(mat, m, n));
        
        sc.close();
    }
}

/*

Problem Statement:-
Arve is learning about matrices and wants to write a program to find the sum of diagonal elements in a matrix using a 2D array. The program takes an input matrix, calculates the sum of its diagonal elements, and then displays the computed sum.

Assist him in the program.

Input format :-
The first line of input consists of two space-separated integers m and n, representing the matrix's number of rows and columns, respectively.
The next m lines consist of n space-separated integers each, representing the matrix elements.

Output format :-
The output prints an integer representing the sum of diagonal elements.

Refer to the sample output for formatting specifications.

Code constraints :-
In this scenario, the test cases will fall under the following constraints:
2 ≤ m, n ≤ 5
1 ≤ element ≤ 1000
m == n i.e. only square matrices should be used.

Sample test cases :-
Input 1 :-
2 2
1 3
5 6
Output 1 :-
7

Input 2 :-
3 3
1 2 3
5 6 1
4 7 2
Output 2 :-
9

*/
