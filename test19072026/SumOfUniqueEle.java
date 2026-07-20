import java.util.Set;
import java.util.HashSet; 
import java.util.Scanner;

public class SumOfUniqueEle{
  
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size1 = sc.nextInt();
        int size2 = sc.nextInt();
        
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        
        for(int i=0; i<size1; i++) set1.add(sc.nextInt());
        for(int i=0; i<size2; i++) set2.add(sc.nextInt());
        
        if(set1.size()==0 && set2.size()==0) {
            System.out.println("-1");
            System.exit(0);
        }
        
        int sum=0;
        if(set1.size() ==0 && set2.size() != 0) {
            for(int i : set2) sum += i;
            System.out.println(sum);
            System.exit(0);
        }
        
        if(set1.size() != 0 && set2.size() == 0){
            for(int i : set1) sum += i;
            System.out.println(sum);
            System.exit(0);
        }
        
        for(int i : set2)   if(!set1.contains(i)) sum += i;
        for(int i : set1)   if(!set2.contains(i)) sum += i;
        
        System.out.println(sum);
        
        sc.close();
    }
}

/*

Problem statement:-
Joe wants to find the sum of numbers that are unique to two lists of integers. He needs a program that takes two lists of integers as input and returns the sum of numbers that appear in only one of the lists. Help Joe by writing a C program that accomplishes this task.

Note: Return -1 if both arrays are null (None in the case of Python). If one of the arrays is null then return the sum of all elements of the other array

Example:-

Input:-
5
4
9 -4 3 2 -5
2 -5 7 9

Output:-
6

Explanation:-
Uncommon elements of two arrays are -4, 3, and 7. Sum of uncommon elements = -4 + 3 + 7 = 6. Thus, the output is 6.

Input format :-
The first line of input consists of the size of the first array, m.
The second line of input consists of the size of the second array, n.
The third line of input consists of m space-separated elements of the first array.
The last line of input consists of n space-separated elements of the first array.

Output format :-
The output displays the sum of all uncommon elements in two arrays.

Refer to the sample output for the formatting specifications.

Code constraints :-
2 ≤ m, n ≤ 10
-100 ≤ array elements ≤ 100

Sample test cases :-
Input 1 :-
6
7
2 4 6 7 8 1
1 4 6 3 5 9 11
Output 1 :-
45

Input 2 :-
6
7
4 8 3 6 2 7
9 7 4 2 3 5 1
Output 2 :-
29

Input 3 :-
5
4
9 -4 3 2 -5
2 -5 7 9
Output 3 :-
6

*/
