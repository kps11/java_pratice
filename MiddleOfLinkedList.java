package java_pratice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

//Problem statement https://leetcode.com/problems/middle-of-the-linked-list/

public class MiddleOfLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println(" enter length of the  List ");
		int length1 = sc.nextInt();
		ListNode l1 = new ListNode(), currentNode = l1;
		ListNode newNode;
		System.out.println("Enter data for the  list");
		for (int i = 0; i < length1; i++) {
			 
			newNode = new ListNode(sc.nextInt());
			l1.next = newNode;
			l1 = l1.next;
		}
		
		ListNode middle =  middleNode(currentNode.next);
		middle.printList();

	}
	
    public static ListNode middleNode(ListNode head) {
        ListNode slow = head, fast = head ;

        while( fast.next != null && fast.next.next !=null){
            slow = slow.next ;
            fast = fast.next.next;
        }
        if( fast.next != null ) slow = slow.next;

        return slow;
    }

}
