import java.util.Scanner;

public class MoveZerosToEnd {
	/* METHOD 1
	private static void moveZeros(int[] nums) {
		int idx=0, size = nums.length;
		for(int i=0; i<size; i++) {
			if(nums[i] != 0)	nums[idx++] = nums[i];
		}
		for(int i=idx; i<size; i++) nums[i]=0;
	}
	*/
	
	/* METHOD 2
	private static void leftShift(int[] nums, int left, int right) {
		int temp = nums[left];
		for(int i=left; i<right; i++) {
			nums[i] = nums[i+1];
		}
		nums[right] = temp;
	}
	
	private static void moveZeros(int[] nums, int noZeros) {
		int size = nums.length, count=0;
		for(int i=0; i<size; i++) {
			if(nums[i] == 0 && count <= noZeros) {
				leftShift(nums, i, size-1);
				i--;
				count++;
			}
			if(count > noZeros) break;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt(), noZeros=0;
		int[] nums = new int[size];
		for(int i=0; i<size; i++) {
			if((nums[i] = sc.nextInt()) == 0) noZeros++;
		}
		moveZeros(nums, noZeros);
		for(int i=0; i<size; i++) System.out.print(nums[i]+" ");
		sc.close();
	}
	
	*/
	
	private static void moveZeros(int[] nums) {
		int i, nonZeroPos=0, temp;
		for(i=0; i<nums.length; i++) {
			if(nums[i] != 0) {
				temp = nums[i];
				nums[i] = nums[nonZeroPos];
				nums[nonZeroPos++] = temp;
			}
		}
	}
  
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] nums = new int[size];
		for(int i=0; i<size; i++) {
			nums[i] = sc.nextInt();
		}
		moveZeros(nums);
		for(int i=0; i<size; i++) {
      System.out.print(nums[i]);
      if(i<size-1) System.out.print(" ");
    }
		sc.close();
	}
  
}


/*

Coding Challenge 2:-
Arrays: Move Zeros to End

Problem Statement:-
Given an array, move all 0s to the end while maintaining the relative order of nonzero
elements.

Optimal Logic / Approach:-
Use a two-pointer approach. Keep a variable 'count' initialized to 0. Traverse the array. If the current
element is non-zero, swap it with arr[count] and increment count. This pushes all zeros to the right.

*/
