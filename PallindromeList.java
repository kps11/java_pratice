package java_pratice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//problem statement https://leetcode.com/problems/palindrome-linked-list/description/

public class PallindromeList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println(" enter length of the  List ");
		int length1 = sc.nextInt();
		ListNode l1 = new ListNode(), currentNode = l1;
//		int newvalue;
		ListNode newNode;
		System.out.println("Enter data for the  list");
		for (int i = 0; i < length1; i++) {
			 
			newNode = new ListNode(sc.nextInt());
			l1.next = newNode;
			l1 = l1.next;
		}
		
		System.out.println(isPallindrome(currentNode.next));
	
	}
	
	public static boolean isPallindrome (ListNode head ) {
//		if( head == null && head.next == null) return true;
//		List<Integer > newList = new ArrayList<Integer>();
//		while ( head != null) {
//			newList.add(head.val);
//			head = head.next;
//		}
//		int start = 0 , end = newList.size()-1;
//		while(start < end && start <= newList.size()-1) {
//			if(newList.get(end) == newList.get(start)) {
//				 start ++;
//		            end --;
//				continue;
//			}else {
//				return false;
//			}
//			
//			
//		}
//		
//		
//		return true;
//	}
		//new approch 
		ListNode slow = head ;
		ListNode fast = head ;
		
		//find the middle of the list 
		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		
		if( fast != null ) slow = slow.next;
		
		ListNode reverseHead = reverse(slow);
		
		while( reverseHead != null) {
			if( reverseHead.val == head.val) {
				reverseHead = reverseHead.next;
				head = head.next;

			}else {
				return false;
			}
			
			
			
		}
		return true;
	
	}
	
	public static ListNode reverse( ListNode head ) {
		ListNode prev= null;
		while( head != null) {
			ListNode newNode = new ListNode(head.val);
			newNode.next = prev;
			prev = newNode;	
			head = head.next;
						
		}
		return prev;
	}

}
