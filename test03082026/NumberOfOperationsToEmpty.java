import java.util.ArrayList;
import java.util.Scanner;

public class NumberOfOperationsToEmpty{

    private static int smallestValue(ArrayList<Integer> list){
        int min=Integer.MAX_VALUE;
        for(int num : list) min = (min < num) ? min : num ;
        return min;
    }

    private static int noOfOperations(ArrayList<Integer> list){
        int min, res=0, size;
        while(!list.isEmpty()){
          min = smallestValue(list);
          
          if(min == list.get(0)) list.remove(0);  
          else  list.add(list.remove(0));
          //this is similar to left rotate of a list [check the leftRotate(ArrayList<Integer> list)]
          res++;
        }
        return res;
    }

    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<N; i++) list.add(sc.nextInt());

	      int result = noOfOperations(list);
        System.out.println(result);

        sc.close();
    }

}

/*
    private static void leftRotate(ArrayList<Integer> list){
	      int size = list.size(), temp = list.get(0), i;
        for(i=0; i<size-1; i++) list.set(i, list.get(i+1));
        list.set(i, temp);
    }
*/

/*

Problem Statement:-
You are given an integer array nums containing distinct numbers, and you can perform the following operations until the array is empty:

If the first element has the smallest value, remove it.
Otherwise, put the first element at the end of the array.

Return an integer denoting the number of operations it takes to make nums empty.

Example 1
Input: -
3
3 4 -1

Output: -
5

Explanation:-

Operation	Array
1		{4, -1, 3}
2		{-1, 3, 4}
3		{3, 4}
4		{4}
5		{}


Example 2
Input:-
4
1 2 4 3

Output:-
5

Explanation:-
Operation	Array
1		{2, 4, 3}
2		{4, 3}
3		{3, 4}
4		{4}
5		{}


Example 3
Input:-
3
1 2 3

Output:-
3

Explanation:-
Operation	Array
1		{2,3}
2		{3}
3		{}


Input format :-
The first line contains an integer N, the size of the array nums.
The second line contains N space-separated integers num[i], representing the elements of nums.

Output format :-
The output displays an integer denoting the number of operations it takes to make nums empty.

Refer to the sample output for the formatting specifications.

Code constraints :-
The given test case will fall under the following constraints:
2 ≤ N ≤ 10
-100 ≤ num[i] ≤100

Sample test cases :-
Input 1 :-
3
3 4 -1
Output 1 :-
5

Input 2 :-
4
1 2 4 3
Output 2 :-
5

Input 3 :-
3
1 2 3
Output 3 :-
3

*/
