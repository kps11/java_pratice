package java_pratice;

import java.util.ArrayList;
import java.util.Scanner;

//problem https://www.hackerrank.com/challenges/find-the-merge-point-of-two-joined-linked-lists/problem?isFullScreen=true
public class FIndMergePointOfTwoList {
	public static void main (String [] args) {
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
		
		
		
		System.out.println( findMergeNode(list1.head, list2.head));
	}
	
	public static int findMergeNode(SingleLinkedListNode head1, SingleLinkedListNode head2) {
        SingleLinkedListNode head1_current= head1;
        SingleLinkedListNode head2_current = head2;
        
while(head1_current != head2_current){
	
    if(head1_current.next == null){
        head1_current = head2;
    }else{
        head1_current = head1_current.next; 
    }
     if(head2_current.next == null){
        head2_current = head1;
    }else{
        head2_current = head2_current.next;
    }
}

return head2_current.data ;
    }
}



