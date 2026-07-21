import java.util.Scanner;

class Node{
	Node prev, next;
	int data;
	Node(int data){
		this.data = data;
		prev = next = null;
	}
}

class DLL{
	Node head;
	
	DLL(){
		head = null;
	}


	void append(int data) {
		Node nn = new Node(data);
		
		if(head == null) head = nn;
		else {
			Node temp = head;
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = nn;
			nn.prev = temp;
		}
		
	}
	

	void displayUnitRightToLeft() {
		if(head == null) {
			System.out.println("List Empty");
			return;
		}
		Node temp = head;
		while(temp.next != null) temp = temp.next;
		while(temp != null) {
			System.out.print(temp.data+" ");
			temp = temp.prev;
		}
		System.out.println();
	}
	 
}

public class DoublyLinkedListReversePrint {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DLL dll = new DLL();
		
		int size = sc.nextInt();
		int count = 0;
		
		while(count < size) {
			dll.append(sc.nextInt());
			count++;
		}
		System.out.println();
		
		dll.displayUnitRightToLeft();
		
		sc.close();
	}
		
}


/*

Problem Statement:-
Vinu manages an inventory system for a small warehouse. Each item in the inventory has a unique identification number. Vinu needs a program that helps him keep track of the items by appending each new item to a list and then printing the list of items in reverse order. This will help him verify the most recently added items first.
You are tasked with writing a program that creates a doubly linked list to manage this inventory. The program should allow Vinu to append new items to the end of the list and then print the items in reverse order of their addition.

Input format :-
The first line contains an integer N, representing the number of items to be added.
The second line contains an integer representing the ID of an item, separated by a space.

Output format :-
The output displays the list of item IDs in reverse order, separated by spaces.

Refer to the sample output for the formatting specifications.
Code constraints :-
1 ≤ N ≤ 10
1 ≤ ID ≤ 1000

Sample test cases :-
Input 1 :-
5
104 90 167 2 98
Output 1 :-
98 2 167 90 104 

Input 2 :-
10
371 18 288 342 196 357 224 295 68 35
Output 2 :-
35 68 295 224 357 196 342 288 18 371 

*/
