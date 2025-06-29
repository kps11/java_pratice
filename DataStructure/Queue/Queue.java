package java_pratice.DataStructure.Queue;

public class Queue<T> {
   private QueueNode <T> head ;
   private QueueNode <T> tail;

   public void enqueue( T data ){
       QueueNode <T> newNode = new QueueNode<>(data, null);
       if ( head == null){
           head = tail = newNode;
       }else {
           tail.setNext(newNode);
           tail = newNode;
       }
   }

   public T  dequeue(){
       if ( head == null){
           throw new Error("List is empty ");
       }else{
           T frontData = head.getData();
            head = head.getNext();
           if (head == null) {
               tail = null;
           }
            return frontData;

       }
   }

   public T peek(){
       if ( head == null){
           throw new Error("List is empty");
       }
           return head.getData();

   }

   public int size (){
       if ( head == null){
           return  0;
       }else {
           int count = 0;
           QueueNode currentNode = head ;

           while ( currentNode != null){
               currentNode = currentNode.getNext();
               count ++;
           }

           return count;
       }
   }

   public boolean isEmpty(){
       return this.size() == 0;
   }

    public void printQueue() {
        if (head == null) {
            System.out.println("Queue is empty");
            return;
        }

        QueueNode currentNode = head;
        System.out.print("Front → ");
        while (currentNode != null) {
            System.out.print(currentNode.getData() + " → ");
            currentNode = currentNode.getNext();
        }
        System.out.println("null (Rear)");
    }

}
