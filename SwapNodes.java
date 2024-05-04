package java_pratice;

import java.util.Scanner;
import java_pratice.*;
// problem statement https://leetcode.com/problems/swap-nodes-in-pairs/description/
public class SwapNodes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println(" enter length of the  List ");
		int length1 = sc.nextInt();
		ListNode l1 = new ListNode(0), currentNode = l1;
		ListNode newNode;
		System.out.println("Enter data for the  list");
		for (int i = 0; i < length1; i++) {
			 
			newNode = new ListNode(sc.nextInt());
			l1.next = newNode;
			l1 = l1.next;
		}
		 
		//new List 
		ListNode newList = swappedList(currentNode.next);
		
	newList.printList();
		

	}
	public static ListNode swappedList ( ListNode head ) {
		if( head == null ) return null;
		ListNode currentNode = new ListNode();
		currentNode.next = head ;
		ListNode dummy = currentNode;
		
		
		while(dummy != null) {
			ListNode first = dummy.next;
			ListNode second = null;
			ListNode secondNext ;
		if( first != null ) {
			second = first.next;
		}
		if( second != null) {
			secondNext = second.next;
			second.next = first ;
			dummy.next = second;
			first.next = secondNext;
			dummy = first ;
			
		}else {
			break;
		}
		
		}
		return currentNode.next;
	}
	
}
