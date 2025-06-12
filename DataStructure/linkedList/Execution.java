package java_pratice.DataStructure.linkedList;

public class Execution {
    public static void main(String[] args) {
        SingleLinkedList sl = new SingleLinkedList();
        sl.insertAtEnd(6);
        sl.insertAtEnd(10);

        sl.insertAtBegining(5);
        System.out.println(sl.toString());
        sl.insertAtMiddle(3,2);
        System.out.println(sl.toString());

        sl.deleteAtBeigining();
        System.out.println(sl.toString());
        sl.deleteAtEnd();
        System.out.println(sl.toString());
        sl.deleteAtMiddle(2);
        System.out.println(sl.toString());
    }
}
