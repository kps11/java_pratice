package java_pratice.DataStructure.linkedList.DoubleLinkedlist;

public class DoubleLinkedList {
    DoubleNode head ;

    public void insertAtBegining(int data ){
        DoubleNode newNode = new DoubleNode(data, null, null);
        if ( head == null) {
            head = newNode;
        } else {
            newNode.setNext(head);
            head.setPrev(newNode);
            head = newNode;
        }
    }

    public void insertAtEnd(int data ){
        DoubleNode newNode = new DoubleNode(data, null,null);
        if ( head == null ){
            head = newNode;
        }else {
            DoubleNode currentNode = head;

            while(currentNode.getNext() != null){
                currentNode = currentNode.getNext();
            }
            currentNode.setNext(newNode);
            newNode.setPrev(currentNode);
        }
    }

    public void insertInMidlle( int data, int position){
        DoubleNode newNode = new DoubleNode(data, null,null);
        if ( head.getLength() == 0){
            head = newNode;
        }else{
            int count = 1;
            DoubleNode currentNode = head;
            while (count < position){
                count++;
                currentNode = currentNode.getNext();
            }
            currentNode.getNext().setPrev(newNode);
            newNode.setNext(currentNode.getNext());
            currentNode.setNext(newNode);
            newNode.setPrev(currentNode);
        }
    }

    public void deleteAtBegining(){
        if( head == null){
            throw new Error("List is empty");
        }else {
            head.getNext().setPrev(null);
            head = head.getNext();
        }
    }

    public void deleteAtEnd(){
        if( head == null){
            throw new Error("List is empty");
        }else {
            DoubleNode currentNode = head;

            while ( currentNode.getNext() != null){
                currentNode = currentNode.getNext();
            }
            DoubleNode previousNode = currentNode.getPrev();
            previousNode.setNext(null);
        }
    }

    public void deleteAtMiddle(int position){
        if ( head == null){
            throw  new Error("List is empty");
        }else {
            DoubleNode curentNnode = head;
            int count =1;
            while (count < position){
                curentNnode = curentNnode.getNext();
                count++;
            }
            curentNnode.getNext().getNext().setPrev(curentNnode);
            curentNnode.setNext(curentNnode.getNext().getNext());
        }
    }

    @Override
    public String toString() {
        return "DoubleNode{" +
                "data=" + head.getData() +
                ", next=" + (head.getNext() != null ? "DoubleNode{data=" + head.getNext().getData() + "}" : "null") +
                ", prev=" + (head.getPrev() != null ? "DoubleNode{data=" + head.getPrev().getData() + "}" : "null") +
                '}';
    }

    public void printForward() {
        DoubleNode current = head;
        while (current != null) {
            System.out.print(current.getData() + "  ⇄ ");
            current = current.getNext();
        }
        System.out.println("null");
    }

    public void printBackward() {
        DoubleNode current = head;

        // move to last node
        while (current != null && current.getNext() != null) {
            current = current.getNext();
        }

        // traverse backward
        while (current != null) {
            System.out.print(current.getData() + " ⇄ ");
            current = current.getPrev();
        }
        System.out.println("null");
    }


}
