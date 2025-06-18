package java_pratice.DataStructure.linkedList.problems;

import java_pratice.DataStructure.linkedList.SingleLinkedList;
import java_pratice.DataStructure.linkedList.SingleNode;

import java.util.ArrayList;
import java.util.List;

public class ReverseList {
    public static void main(String[] args) {
        SingleLinkedList sl = new SingleLinkedList();
        sl.insertAtBegining(5);
        sl.insertAtEnd(3);
        sl.insertAtEnd(6);
        sl.insertAtEnd(8);
//        System.out.println(sl.toString());
        System.out.println(reverseList( sl));

    }

    public static SingleNode reverseList( SingleLinkedList node){
       SingleNode prev = null;
       SingleNode current = node.getHead();
       SingleNode next = null;
       while (current != null){
           next = current.getNext();
           current.setNext(prev);
           prev = current;
           current = next;

       }
       return prev;
    }
}
