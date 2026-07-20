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
	
	
	void displayUnitLeftToRight() {
		if(head == null) {
			System.out.println("List Empty");
			return;
		}
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println();
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
	
	
	boolean isPalindrome() {
		Node start = head;
		if(start==null) return false;
		else {
			int count=0, size=0;
			Node end = head;
			while(end.next != null) {
				end = end.next;
				size++;
			}
			size /= 2;
			while(count < size) {
				if(start.data != end.data) return false;
				count++;
				end = end.prev;
				start = start.next;
			}
			return true;
		}
	}

  
}

public class DoublyLinkedListPalidromeCheck {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DLL dll = new DLL();
		int size = sc.nextInt();
		int count=0;
		while(count < size) {
			dll.append(sc.nextInt());
			count++;
		}
		System.out.println();
		
		dll.displayUnitLeftToRight();
		dll.displayUnitRightToLeft();
		
		if(dll.isPalindrome()) System.out.println("The doubly linked list is a palindrome");
		else System.out.println("The doubly linked list is not a palindrome");
		
		sc.close();
	}
		
}

/*

Problem Statement:-
Tom is a software developer working on a project where he has to check if a doubly linked list is a palindrome. He needs to write a program to solve this problem. Write a program to help Tom check if a given doubly linked list is a palindrome or not.

Input format :-
The first line consists of an integer N, representing the number of elements in the linked list.
The second line consists of N space-separated integers representing the linked list elements.

Output format :-
The first line of output displays the elements of the doubly linked list in forward order, separated by spaces.
The second line of output displays the elements of the doubly linked list in reverse order, separated by spaces.

The third line prints:-
"The doubly linked list is a palindrome" if the list reads the same forward and backward.
"The doubly linked list is not a palindrome" if the list does not match when reversed.

Refer to the sample output for the formatting specifications.

Code constraints :-
In this scenario, the test cases fall under the following constraints:
2 ≤ N ≤ 20
-100 ≤ elements ≤ 100

Sample test cases :-
Input 1 :-
5
1 2 3 2 1
Output 1 :-
1 2 3 2 1 
1 2 3 2 1 
The doubly linked list is a palindrome

Input 2 :-
5
1 2 3 4 5
Output 2 :-
1 2 3 4 5 
5 4 3 2 1 
The doubly linked list is not a palindrome

Input 3 :-
6
-1 -2 -3 -3 -2 -1
Output 3 :-
-1 -2 -3 -3 -2 -1 
-1 -2 -3 -3 -2 -1 
The doubly linked list is a palindrome

*/
