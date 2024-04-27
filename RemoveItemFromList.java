package java_pratice;

import java.util.Scanner;

//problem https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/
//class ListNode {
//	int val;
//	ListNode next;
//	ListNode(){
//		
//	}
//	ListNode(int val){
//		this.next= null;
//		this.val = val;
//	}
//	
//	public void printList() {
//		ListNode currentNode = this;
//		while(currentNode != null) {
//			System.out.println("list value "+ currentNode.val);
//			currentNode= currentNode.next;
//		}
//	}
//}
public class RemoveItemFromList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println(" enter length of the first List ");
		int length1 = sc.nextInt();
		ListNode l1 = new ListNode(), currentNode = l1;
		int newvalue;
		ListNode newNode;
		System.out.println("Enter data for the first list");
		for (int i = 0; i < length1; i++) {
			 newvalue = sc.nextInt();
			newNode = new ListNode(newvalue);
			l1.next = newNode;
			l1 = l1.next;
		}
		System.out.println(" Please enter the position");
		int position = sc.nextInt();
		ListNode newListNode =removeFromNthPosition(currentNode.next,length1, position);
		newListNode.printList();
		sc.close();
	}
	
	public static ListNode removeFromNthPosition(ListNode currentNode ,int length, int position) {
		ListNode l1 = currentNode;
		int count = 0;
		int deletePosition = (length-position-1) >= 0 ? length-position-1 :length;
		if(position == 0 ) {
			return currentNode;
		}else {
			if(deletePosition == length){
                return currentNode.next;
            }
		while(count < deletePosition) {
			l1 = l1.next;
			count++;
		}
		l1.next = l1.next.next;
		return currentNode;
		}
	}

}
