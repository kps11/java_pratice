package java_pratice;

import java.util.Scanner;

//problem statement https://leetcode.com/problems/reverse-linked-list-ii/description/
public class ReveseLinkedListii {

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
		ListNode reversedList = reversList(currentNode.next,3,5);
		reversedList.printList();
		

	}
	
	public static ListNode reversList ( ListNode head , int left, int right) {
		if( head == null) return head;
		ListNode currentNode = new ListNode(), prevNode= new ListNode(),prevHead = prevNode,newList = new ListNode(), dummy = newList;
		currentNode.next= head ;
		int count =	0;
		while (currentNode!= null) {
			if(count  >= left && count <= right) {
				newList.next = currentNode;
				newList = newList.next;
				if( count == right ) {
					ListNode nextNode= currentNode.next;
					newList.next = null;
					prevNode.next = reverse(dummy.next, nextNode);
					return prevHead.next.next;
				}
			}
			else {
				if(count < left) {
					prevNode.next = currentNode;
					prevNode = prevNode.next;
				}
			}
			count ++;
			currentNode = currentNode.next;
			
		}
		
		return prevHead.next;
	}
	
	public static ListNode reverse( ListNode head , ListNode next) {
		//assigning the node which is after the right position
		ListNode prev= next;
		while( head != null) {
			ListNode newNode = new ListNode(head.val);
			newNode.next = prev;
			prev = newNode;	
			head = head.next;
						
		}
		return prev;
	}

}
