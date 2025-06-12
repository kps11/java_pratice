package java_pratice.DataStructure.linkedList;

public class SingleNode {
    private int data ;
    private SingleNode next;

    public int getLength() {
        int count =1 ;
        SingleNode current = this;
        while (current.getNext() != null){
            current = current.getNext();
            count ++;
        }
        return count;
    }

    @Override
    public String toString() {
        return "SingleNode{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }

    public SingleNode() {
    }

    public SingleNode(int data, SingleNode next) {
        this.data = data;
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public SingleNode getNext() {
        return next;
    }

    public void setNext(SingleNode next) {
        this.next = next;
    }
}
