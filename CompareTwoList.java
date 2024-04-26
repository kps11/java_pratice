package java_pratice;

import java.util.Scanner;

class SingleLinkedListNode {
	int data;
	SingleLinkedListNode next ;
	public SingleLinkedListNode(int data ) {
		// TODO Auto-generated constructor stub
		this.data = data ;
		this.next = null;
	}
	
}

class SingleLinkedList {
	SingleLinkedListNode head;
	SingleLinkedListNode tail;
	int length;
	public SingleLinkedList() {
		// TODO Auto-generated constructor stub
		this.head =null;
		this.tail = null;
	}
	public void insertNewNode(int data) {
		SingleLinkedListNode newNode = new SingleLinkedListNode(data);
		if(this.head == null) {
			this.head = newNode;
		}else {
			this.tail.next = newNode;
			
		}
		
		this.tail = newNode;
		this.length ++;
		
	}
	
	public void printList () {
		SingleLinkedListNode llist = this.head;
		while(llist != null) {
			System.out.print(llist.data + " ");
			llist = llist.next;
		}
		System.out.println(' ');
	}
}


public class CompareTwoList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int length = sc.nextInt();
		SingleLinkedList first_list = new SingleLinkedList() ;
		SingleLinkedList last_list = new SingleLinkedList();
		
		
		for(int i =0 ; i< length ; i++) {
			int item = sc.nextInt();
			first_list.insertNewNode(item);
		}
		
		int len = sc.nextInt();
		for(int i =0 ; i< len ; i++) {
			int item = sc.nextInt();
			last_list.insertNewNode(item);
		}
		
//	 first_list.printList();
//	 last_list.printList();
	 System.out.println(comapreList(first_list, last_list) ? " same": "not same");

	}
	
	public static boolean comapreList( SingleLinkedList l1, SingleLinkedList l2) {
		SingleLinkedListNode l1Head = l1.head;
		SingleLinkedListNode l2Head = l2.head;
		if( l1.length != l2.length) {
			return false;
		}else {
			int count =0;
			while((l1Head !=null || l2Head != null) && l1Head.data == l2Head.data ) {
				count++;
				l1Head = l1Head.next;
				l2Head = l2Head.next;
			}
			
			if(count != l1.length) {
				return false;
			}else {
				return true;
			}
			
		}
	}

}
