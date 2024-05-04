package java_pratice;

import java.util.Scanner;

//problem Statement https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/description/
public class BinaryToInteger {

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
		
		 int result  =  getDecimalValue(currentNode.next);
		
		 System.out.println(" result "+ result );
	}
	
	 public static int getDecimalValue(ListNode head) {
	        int res =0;
	        while( head != null){
	            res*=2;
	            res = res + head.val;
	            head  = head.next ;
	        }
	        return res;
	    }

}
