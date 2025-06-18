package java_pratice.DataStructure.Queue;

public class QueueNode {
     private int data;
     private QueueNode next;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public QueueNode(int data, QueueNode next) {
        this.data = data;
        this.next = next;
    }

    public QueueNode getNext() {
        return next;
    }

    public void setNext(QueueNode next) {
        this.next = next;
    }
}
