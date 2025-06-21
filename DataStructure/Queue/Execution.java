package java_pratice.DataStructure.Queue;

public class Execution {
    public static void main(String[] args) {
        Queue <Integer> queue = new Queue<> ();

        queue.enqueue(5);
        queue.enqueue(8);
        queue.enqueue(10);
        queue.enqueue(6);


        queue.printQueue();
        queue.dequeue();
        queue.printQueue();
    }
}
