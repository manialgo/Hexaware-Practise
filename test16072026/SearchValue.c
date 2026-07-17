//Debug Problem
#include<stdio.h>

int main() {
    int arr[1000][1000];
    int row,col,rSize,cSize,searchValue;
    scanf("%d %d",&rSize,&cSize);

    for( row = 0 ; row < rSize  ; row++) {
        for(col = 0 ; col < cSize ; col++)
            scanf("%d",&arr[row][col]);
    }
   
    scanf("%d",&searchValue);
   
    for( row = 0 ; row < rSize  ; row++){
        for(col = 0 ; col < cSize ; col++){
            if(arr[row][col] == searchValue){
                printf("(%d,%d)",row,col);
                return;
            }
        }
    if(col <cSize)  break;
    }
    
    if(row == rSize)    printf("(-1,-1)");
    
    return 0;
}


/*

Target Value in 2D
Problem Statement:-
Find a target value in a two-dimensional matrix given the number of rows as rowCount and number of columns as columnCount, and return its coordinates. If the value didn't exist, the program had to return (-1,-1).

Input format :-
Input contains rowCount , columnCount, values and the target value

Output format :-
If the value didn't exist, print -1 -1 else print its coordinates

Code constraints :-
1 ≤ array_size ≤ 1000

Sample test cases :-
Input 1 :-
3 4
1 2 3 4
5 6 7 8
9 10 11 12
7
Output 1 :-
(1,2)

*/
