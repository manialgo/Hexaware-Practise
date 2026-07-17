package test16072026; 

import java.util.Scanner;

public class MatrixRotation {
 
	private static int[][] antiClockwise(int row, int col, int[][] img) {
		int newRow = col, newCol=row;
		int[][] result = new int[newRow][newCol];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                result[col - 1 - j][i] = img[i][j];
            }
        }
        return result;
	}
	
	private static int[][] clockWise(int row, int col, int[][] img){
		int newRow = col, newCol=row;
		int[][] result = new int[newRow][newCol];
		for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                result[j][row - 1 - i] = img[i][j];
            }
        }
		return result;
	}
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int row = sc.nextInt();
        int col = sc.nextInt();
        int flag = sc.nextInt();
        
        int[][] img = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                img[i][j] = sc.nextInt();
            }
        }
        
        int newRow = col;
        int newCol = row;
        int[][] result = new int[newRow][newCol];
        
        if (flag == 1) result = clockWise(row, col, img);
        else if (flag == 0) result = antiClockwise(row, col, img);
        
        for (int i = 0; i < newRow; i++) {
            for (int j = 0; j < newCol; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
        
        sc.close();
    }
}


/*

Matrix Rotation:-
An image is representing m*n matrix of integers, where each integer represents a pixel value.Write an algorithm to rotate an image by 90 degree left or right according to the value of flag variable. If r=the flag value is 0, then rotate to the left and if flag value is 1 , then rotate to the right

Case 1:-

Flag = 1 
Input:-

 2 3 1 

 4 6 3 

 5 4 2 

Output:-

 5 4 2 

 4 6 3 

 2 3 1 

Case 2:- 

Flag = 0 

 Input:-

 2 1 

 3 4 

 Output:-

 4 1 

 3 2


Complete rotatePixelImage( int **arr , int m , int n , int flag) to get the desired output.

Input format :-
The input to the method consist of four arguments

img , a matrix of integers representing the pixels of the image

rows, an integer representing the no of rows(m)

columns, an integer representing the no of columns(n)

flag , an integer representing the rotation of the image

Output format :-
Return a matrix of integers representing the pixels of the image rotated according to the value of the flag variable

Code constraints :-
1 ≤ array_size ≤ 1000

Sample test cases :-
Input 1 :-
3 3 1
2 3 1
4 6 3
5 4 2
Output 1 :-
5 4 2 
4 6 3 
2 3 1 

*/
