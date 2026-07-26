import java.util.Scanner;

public class GearProblem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int gear1 = sc.nextInt();
		int gear2 = sc.nextInt();
		int gear3 = sc.nextInt();
		int gear4 = sc.nextInt();
		
		if((gear1+gear2 == 10) && ((int)Math.abs(gear3-gear4) == 3)) System.out.println(gear1*gear2*gear3*gear4);
		else System.out.println("Not satisfied");
		
		sc.close();
	}

}


/*

Problem Statement:-
Emma works as a quality control manager at a factory that produces sets of four interconnected gears. Each gear is assigned a specific value based on its size. Emma needs to ensure that the gears meet certain quality criteria before they are approved for assembly.

Given the values of four gears, check the following conditions: -
The sum of the values of the first and second gears must be exactly 10.
The absolute difference between the values of the third and fourth gears must be exactly 3.

If both conditions are met, calculate and display the product of all four gear values to determine the overall compatibility score of the set. If either condition is not met, mark the set as defective and print "Not satisfied."  

Input format :-
The input consists of a single line containing four space-separated integers representing the values of the four gears.

Output format :-
The output prints the compatibility score of the set if the conditions are met.
The output prints "Not satisfied" if the conditions are not met.


Refer to the sample output for the formatting specifications.

Code constraints :-
In the given scenario, the test cases fall under the following constraints:
1 ≤ n1, n2, n3 and n4 ≤ 9

Sample test cases :-
Input 1 :-
3 7 9 6
Output 1 :-
1134

Input 2 :-
3 7 6 9
Output 2 :-
Not satisfied

*/
