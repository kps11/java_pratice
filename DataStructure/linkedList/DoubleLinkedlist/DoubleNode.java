package java_pratice.DataStructure.linkedList.DoubleLinkedlist;

public class DoubleNode {
    private int data;
    private DoubleNode next;
    private DoubleNode prev;

    public DoubleNode(int data, DoubleNode next, DoubleNode prev) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }

    @Override
    public String toString() {
        return "DoubleNode{" +
                "data=" + data +
                ", next=" + next +
                ", prev=" + prev +
                '}';
    }

    public int getLength(){
        if ( this == null){
            return  0;
        }else{
            DoubleNode currentNode = this;
            int count = 0;
            while( currentNode != null){
                count ++;
                currentNode = currentNode.getNext();
            }

            return count;
        }
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public DoubleNode getNext() {
        return next;
    }

    public void setNext(DoubleNode next) {
        this.next = next;
    }

    public DoubleNode getPrev() {
        return prev;
    }

    public void setPrev(DoubleNode prev) {
        this.prev = prev;
    }
}
