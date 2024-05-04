package java_pratice;

import java.util.Scanner;

//problem statement https://leetcode.com/problems/rotate-list/description/
public class RotateList {

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
		 
		ListNode newList = rotateList(currentNode.next,2);
		

	}
	
	public static ListNode rotateList( ListNode ll, int k) {
		if( ll == null) return null;
		int key = k % size(ll);
		ListNode currentList = new ListNode(), prevNode= null, newList= currentList;
		currentList.next = ll ;
		for ( int i =0 ; i < key; i++) {

			while(currentList != null) {
				if(currentList.next == null) {
					prevNode.next = null;
					currentList.next =  newList.next;
					newList.next = currentList;
					currentList = newList.next;
					break;
				}
				prevNode = currentList;
				currentList = currentList.next;
			}		
		}		
		return newList.next;
	}
	
	public static int size( ListNode ll){
	    ListNode curr = new ListNode();
	    curr.next = ll;
	
	    int length =-1;
	    while( curr != null){
	        length ++;
	        curr= curr.next ;
	    }
	    	return length;
	}
}
