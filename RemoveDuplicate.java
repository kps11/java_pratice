package java_pratice;

//problem statement https://leetcode.com/problems/remove-linked-list-elements/description/
import java.util.Scanner;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println(" enter length of the first List ");
		int length1 = sc.nextInt();
		ListNode l1 = new ListNode(), currentNode = l1;
//		int newvalue;
		ListNode newNode;
		System.out.println("Enter data for the first list");
		for (int i = 0; i < length1; i++) {
			 
			newNode = new ListNode(sc.nextInt());
			l1.next = newNode;
			l1 = l1.next;
		}
		System.out.println(" Please enter the dupicate Item");
		int position = sc.nextInt();
		ListNode newListNode =removeDuplicates(currentNode.next, position);
		if( newListNode != null) newListNode.printList();
		sc.close();

	}
	
	public static ListNode removeDuplicates(ListNode l1 , int duplicateitem ) {
		ListNode newNode = new ListNode(0);
		newNode.next = l1;
		
		ListNode currentNode = l1, prevNode = newNode;
		if( l1 == null) {
			return null;
		}
		
		while(currentNode != null) {
			if( currentNode.val == duplicateitem) {
				prevNode.next = currentNode.next;
				 System.out.println(" new line");
			}else {
				prevNode  = currentNode;
			}

			currentNode = currentNode.next;
					}
		return newNode.next;
	}

}
