package java_pratice;

import java.util.Scanner;
//problem statement https://leetcode.com/problems/add-two-numbers/description/
class ListNode {
	int val;
	ListNode next;
	ListNode(){
		
	}
	ListNode(int val){
		this.next= null;
		this.val = val;
	}
	
	public void printList() {
		ListNode currentNode = this;
		while(currentNode != null) {
			System.out.println("list value "+ currentNode.val);
			currentNode= currentNode.next;
		}
	}
}

public class AddtwoList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println(" enter length of the first List ");
		int length1 = sc.nextInt();
		System.out.println(" enter length of the second List ");
		int length2 = sc.nextInt();
		ListNode l1 = new ListNode();
		ListNode l2 = new ListNode();
		ListNode newNode,currentNode1 = l1, currentNode2= l2;
		int newvalue;
		System.out.println("Enter data for the first list");
		for (int i = 0; i < length1; i++) {
			 newvalue = sc.nextInt();
			newNode = new ListNode(newvalue);
			l1.next = newNode;
			l1 = l1.next;
		}
		
		System.out.println("Enter data for the second list");
		for (int i = 0; i < length2; i++) {
			 newvalue = sc.nextInt();
			newNode = new ListNode(newvalue);
			l2.next = newNode;
			l2= l2.next;
		}
		
		
		addTwoNumberList(currentNode1.next, currentNode2.next);
		
	}
	
	public static ListNode addTwoNumberList(ListNode l1, ListNode l2) {
		int sum =0,  newNumber=0,carryNumber=0,l2_value , l1value;
		ListNode newList = new ListNode(), currentList,newNode;
		currentList= newList;
		while ( l1!= null || l2 != null) {
			l1value = l1 != null ? l1.val :0;
			l2_value = l2 != null ? l2.val :0;
			newNumber = l1value +l2_value+ carryNumber;
			carryNumber = newNumber/10;
			newNode = new ListNode(newNumber%10);
			currentList.next = newNode;
			currentList = currentList.next;
			l1= l1 != null ? l1.next:l1 ;
			l2 = l2 !=null ? l2.next :l2;
		}
		if(carryNumber >0) {
			newNode = new ListNode(carryNumber);
			currentList.next = newNode;
		}
		return l1;
	}

}
