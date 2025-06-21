package java_pratice.DataStructure.Queue;

public class QueueNode<T> {
     private T data;
     private QueueNode next;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public QueueNode(T data, QueueNode next) {
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
