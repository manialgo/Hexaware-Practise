import java.util.Scanner;
public class IdxAddMat{
    
    private static int[][] sumOfIdx(int row, int col){
        int[][] mat = new int[row][col];
        
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                mat[i][j] = i+j;
            }
        }
        
        return mat;
    }
    
    private static void matPrint(int[][] mat, int row, int col){
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(mat[i][j]+"\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        
        int[][] result = sumOfIdx(m, n);
        
        matPrint(result, m, n);
        
        sc.close();
    }
}

/*

Problem Statement:-
Johnsy wants to create a matrix in which the elements are formed differently. The elements are formed by adding the values of their index positions. Write a program that obtains the order of the matrices and creates a matrix by adding the values of their index positions.

Input format :-
The input line consists of the order of the matrices m and n separated by a space.

Output format :-
The output prints the matrix elements in matrix format. The elements are formed by adding the values of their index positions.

Give a tab space between the elements.

Refer to the sample output for formatting specifications.

Sample test cases :-
Input 1 :-
3 3
Output 1 :-
0	1	2	
1	2	3	
2	3	4	


*/
