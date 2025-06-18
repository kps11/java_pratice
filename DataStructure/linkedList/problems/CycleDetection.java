package java_pratice.DataStructure.linkedList.problems;

import java_pratice.DataStructure.linkedList.SingleLinkedList;
import java_pratice.DataStructure.linkedList.SingleNode;

//Floyd’s Cycle Detection Algorithm
public class CycleDetection {
    public static void main(String[] args) {
        SingleLinkedList sl = new SingleLinkedList();
        sl.insertAtBegining(5);
        sl.insertAtEnd(3);
        sl.insertAtEnd(6);
        sl.insertAtEnd(8);

// Create a loop: last node → node with value 3
        SingleNode head = sl.getHead();
        SingleNode nodeWith3 = null;
        SingleNode current = head;

// Step 1: Find node with data = 3 and last node
        while (current.getNext() != null) {
            if (current.getData() == 3) {
                nodeWith3 = current;
            }
            current = current.getNext();
        }

// Step 2: current is now at the last node
//         link last node's next to nodeWith3
        if (nodeWith3 != null) {
            current.setNext(nodeWith3); // ✅ loop created
        }
        System.out.println(cycleDetection(sl)); ;
    }

    public static boolean cycleDetection ( SingleLinkedList node ){
        SingleNode slow = node.getHead();
        SingleNode fast = node.getHead();

        while (fast != null && fast.getNext() != null) {
            slow = slow.getNext();                // move slow by 1
            fast = fast.getNext().getNext();      // move fast by 2

            if (slow == fast) {
                return true; // ✅ cycle detected
            }
        }

        return false;
    }
}
