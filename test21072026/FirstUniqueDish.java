import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class FirstUniqueDish{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        Map<Integer, Integer> map = new HashMap<>();
        int[] nums = new int[size];
        int i=0, temp;
        while(i < size){
            temp = sc.nextInt();
            nums[i] = temp;
            map.put(temp, map.getOrDefault(temp, 0)+1);
            i++;
        }
        for(int num : nums){
            if(map.get(num) == 1) {
                System.out.println(num);
                System.exit(0);
            }
        }
        System.out.println("-1");
        sc.close();
    }

}

/*

Problem Statement:-
A restaurant receives a series of food orders each day. Sometimes, multiple customers order the same dish. The restaurant manager wants to identify the first unique dish order of the day — the first dish that no other customer ordered. This will help the chef to prepare the dish as a special item for the day.

Write a program to help the restaurant manager find the first unique dish order from the list of orders.

Example 1:-
Input:-
5
1 2 1 3 1

Output:-
2

Explanation: The first unique dish code is 2.

Example 2:-
Input:-
10
1 2 3 4 5 5 4 3 2 1

Output:-
-1

Explanation: Since no dish code occurs only once, the output is -1.

Input format :-
The first line input consists of an integer N representing the number of orders received in a day.
The second line consists of an array of integers of size N, where each integer represents a code for each dish ordered by customers.

Output format :-
The output displays an integer representing the code of the first unique dish order. If there is no unique dish, return -1.

Refer to the sample output for the formatting specifications.

Code constraints :-
1 ≤ N ≤ 10
1 ≤ dish code ≤ 100

Sample test cases :-
Input 1 :-
5
1 2 1 3 1
Output 1 :-
2

Input 2 :-
6
9 4 9 6 7 4
Output 2 :-
6

Input 3 :-
10
1 2 3 4 5 5 4 3 2 1
Output 3 :-
-1

*/
