package java_pratice.DataStructure.Queue.Problems;

import java_pratice.DataStructure.Queue.Queue;
import java_pratice.DataStructure.stack.Stack;

//Reverse the First K Elements
//Given a queue and a number k, reverse the first k elements of the queue.

public class Reverse_First_K_Elements_Of_A_Queue {
    public static void main(String[] args) {
        Queue <Integer> queue = new Queue<>();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        int k = 3;

        reverseQueue(queue,k);
        queue.printQueue();


    }
    public static void reverseQueue(Queue <Integer> queue, int k){
        int count =0;
        Stack st = new Stack();
        while ( count < k){
            st.push(queue.dequeue());
            count ++;
        }
        while (!st.isEmpty()){
            queue.enqueue(st.pop());
        }

        for (int i = 0; i < queue.size() -k; i++) {
            queue.enqueue(queue.dequeue());
        }
    }
}
