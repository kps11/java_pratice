package java_pratice.DataStructure.linkedList;

public class SingleLinkedList {
    private SingleNode head;

    public  void insertAtEnd (int value){
        SingleNode newNode = new SingleNode(value, null);
        if (head == null){
            head = newNode;
        }else {
            SingleNode current = head;

            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
    }
    public void insertAtBegining(int value){
      SingleNode newNode = new SingleNode( value, head);
      head = newNode;
    }

    public void  insertAtMiddle( int value, int position){
        if( position ==0){
            insertAtBegining(value);
        } else if (position == head.getLength()) {
            insertAtEnd(value);
        }else{
            SingleNode current = head;
            SingleNode newNode = new SingleNode(value, null);
            int count = 1;
            while (count != position){
                current = current.getNext();
                count ++;
            }
            newNode.setNext(current.getNext());
            current.setNext(newNode);
        }
    }

    public void deleteAtBeigining(){
        if ( head == null){
            throw new Error(" List is Empty");
        }else{
            head= new SingleNode(head.getNext().getData(),head.getNext().getNext());
        }
    }

    public void deleteAtEnd(){
        if ( head == null){
            throw new Error(" List is empty");
        }else {
            SingleNode currentNode = head;
            int count = 1;
            while (count < currentNode.getLength()){
                currentNode = currentNode.getNext();
                count ++;
            }
            currentNode.setNext(null);
        }
    }

    public void deleteAtMiddle(int position){
        if( head == null){
            throw new Error(" List is empty");
        }else{
            SingleNode currentNode = head;
            int count = 1;

            while ( count < position){
                count ++;
                currentNode = currentNode.getNext();
            }
            currentNode.setNext(currentNode.getNext().getNext());

        }
    }

    @Override
    public String toString() {
        return "SingleLinkedList{" +
                "head=" + head +
                '}';
    }
}