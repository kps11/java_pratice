package java_pratice;

import java.util.Scanner;

//class SingleLinkedListNode {
//	int data;
//	SingleLinkedListNode next ;
//	public SingleLinkedListNode(int data ) {
//		// TODO Auto-generated constructor stub
//		this.data = data ;
//		this.next = null;
//	}
//	
//}
//
//class SingleLinkedList {
//	SingleLinkedListNode head;
//	SingleLinkedListNode tail;
//	int length;
//	public SingleLinkedList() {
//		// TODO Auto-generated constructor stub
//		this.head =null;
//		this.tail = null;
//	}
//	public void insertNewNode(int data) {
//		SingleLinkedListNode newNode = new SingleLinkedListNode(data);
//		if(this.head == null) {
//			this.head = newNode;
//		}else {
//			this.tail.next = newNode;
//			
//		}
//		
//		this.tail = newNode;
//		this.length ++;
//		
//	}
//	
//	public void printList () {
//		SingleLinkedListNode llist = this.head;
//		while(llist != null) {
//			System.out.print(llist.data + " ");
//			llist = llist.next;
//		}
//		System.out.println(' ');
//	}
//}


public class MergeTwoList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleLinkedList list1 = new SingleLinkedList();
		SingleLinkedList list2 = new SingleLinkedList();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the 1st list length ");
		int length_one = sc.nextInt();
		System.out.println("enter the 2nd list length ");
		int length_two = sc.nextInt();
		
		for (int i = 0; i < length_one; i++) {
			int data = sc.nextInt();
			
			list1.insertNewNode(data);
		}
		
		System.out.println("enter data for the second one");
		for (int i = 0; i < length_two; i++) {
			int data = sc.nextInt();
			
			list2.insertNewNode(data);
		}
		
		mergetwoList(list1.head, list2.head);

	}
	
	public static void mergetwoList(SingleLinkedListNode head1,SingleLinkedListNode head2) {
		
		SingleLinkedListNode dummy = new SingleLinkedListNode(0);
		SingleLinkedListNode current_node = dummy;
		while(head1 != null && head2 !=null) {
			//merge list 
			if( head1.data <= head2.data) {
				current_node.next = head1;
				head1 = head1.next;
			}else {
				current_node.next = head2;
				head2 = head2.next;
			}
			current_node = current_node.next;
			
		}
		current_node.next = head1 !=null ? head1:head2;
		
		
		while(dummy != null) {
			System.out.println(dummy.data);
			dummy = dummy.next;
		}
		
	}

}
