import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class TwoSumProblem {
	
	private static boolean isPairFound(int[] nums, int target) {
		List<Integer> list = new ArrayList<>();
		int size = nums.length, temp;
		for(int i=0; i<size; i++) {
			temp = target-nums[i];
			if(list.contains(temp)) return true;
			else list.add(nums[i]);
		}
		return false;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] nums = new int[size];
		for(int i=0; i<size; i++) nums[i] = sc.nextInt();
		int target = sc.nextInt();
		if(isPairFound(nums, target))	System.out.print("Pair-Found");
		else System.out.print("Pair-is-not-Found");
		sc.close();
	}
	
}

/*

Coding Challenge 5:-
Arrays: Two Sum Problem

Problem Statement:-
Given an array and a target sum, find two numbers in the array that add up to the target.

Optimal Logic / Approach:-
Use a HashMap. Iterate through the array. For each element x, check if (target - x) exists in the map. If it does, you found the pair. If not, add x to the map. Time complexity: O(N).

*/
