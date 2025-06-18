package java_pratice.DataStructure.DoubleLinkedlist;

public class Execution {
    public static void main(String[] args) {
        DoubleLinkedList dl = new DoubleLinkedList();
        dl.insertAtBegining(4);
        dl.insertAtBegining(6);
        dl.insertAtEnd(10);
        dl.insertInMidlle(8,2);
        dl.printForward();
//        System.out.println(dl.toString());
//        dl.deleteAtBegining();
//        dl.deleteAtEnd();
        dl.deleteAtMiddle(2);
        dl.printForward();
        dl.printBackward();
    }
}
