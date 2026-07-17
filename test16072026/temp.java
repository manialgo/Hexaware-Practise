


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
