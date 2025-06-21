package java_pratice.DataStructure.Queue.Problems;

import java_pratice.DataStructure.Queue.Queue;

import java.util.Scanner;

public class GenerateBinary {
    public static void main(String[] args) {
        Queue<String> output = new Queue<>();
        Queue <String> input = new Queue<>();
        input.enqueue("1");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int count = 0;

        while (count < n){
            String item = input.dequeue();
            output.enqueue(item);
            input.enqueue(item+"0");
            input.enqueue(item+"1");
            count ++;

        }
        output.printQueue();
        input.printQueue();
    }
}
