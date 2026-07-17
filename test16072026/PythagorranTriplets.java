package test16072026;

import java.util.Scanner;

public class PythagorranTriplets {
  
    public static void generatePythagoreanTriplets(int limit) {
        int m = 2, a, b, c;
        boolean broke=false;
        while (true) {
            broke = false;
            for (int n = 1; n < m; n++) {
                a = m * m - n * n;
                b = 2 * m * n;
                c = m * m + n * n;
                if (c > limit) {
                    broke = true;
                    break;
                }
                if (a > 0 && b > 0) System.out.printf("%d %d %d\n", a, b, c);
            }
            if (broke && (m * m + 1 * 1) > limit) break;
            m++;
        }
    }
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        generatePythagoreanTriplets(limit);
        sc.close();
    }

}

/*
BRUTE FORCE APPROACH

package test16072026;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Comparator;

public class PythagorranTriplets{

	private static int[][] pythagoreanTriplets(int limit) {
		List<int[]> triplets = new ArrayList<>();
        int a2b2, c;
        for(int a=1; a<limit; a++){
            for(int b=a; b<limit; b++){
                a2b2 = a*a +  b*b;
                c = (int) Math.sqrt(a2b2);
                if(c*c == a2b2 && c <= limit)	triplets.add(new int[]{a, b, (int)c});
            }
        }
        
        triplets.sort(Comparator.comparingInt(t -> t[2]));
        
        return triplets.toArray(new int[triplets.size()][]);
	}
  
  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int limit = sc.nextInt();
        
      int[][] result = pythagoreanTriplets(limit);
        
      for(int[] num: result)	System.out.printf("%d %d %d\n", num[0], num[1], num[2]);
        
      sc.close();
    }
    
}

*/

/*

Problem Statement:-
A Pythagorean triplet is a set of three integers a, b and c such that a^2 + b^2 = c^2. Given a limit, generate all Pythagorean Triples with values smaller than given limit.

Sample test cases :-
Input 1 :-
20
Output 1 :-
3 4 5
8 6 10
5 12 13
15 8 17
12 16 20

Input 2 :-
70
Output 2 :-
3 4 5
8 6 10
5 12 13
15 8 17
12 16 20
7 24 25
24 10 26
21 20 29
16 30 34
9 40 41
35 12 37
32 24 40
27 36 45
20 48 52
11 60 61
48 14 50
45 28 53
40 42 58
33 56 65

*/
