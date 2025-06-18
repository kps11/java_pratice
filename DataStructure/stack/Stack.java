package java_pratice.DataStructure.stack;

public class Stack {
    private StackNode head;

//    public void push ( int data ){
//        StackNode newNode = new StackNode(data, null);
//        if ( head == null){
//            head = newNode;
//        }else {
//            StackNode currentNode = head;
//            while (currentNode.getNext() != null){
//                currentNode = currentNode.getNext();
//            }
//            currentNode.setNext(newNode);
//        }
//
//    }
//
//    public void pop(){
//        if (head == null ){
//            throw new Error("List is empty");
//        }else {
//            StackNode currentNode = head;
//            while (currentNode.getNext().getNext() != null){
//                currentNode = currentNode.getNext();
//            }
//            currentNode.setNext(null);
//        }
//    }
//
//    public int peek(){
//        if ( head == null){
//            throw new Error(" List is empty");
//        }else {
//            StackNode currentNode = head ;
//            while (currentNode.getNext() != null){
//                currentNode = currentNode.getNext();
//            }
//
//            return currentNode.getData();
//        }
//    }


    public void push(int data) {
        StackNode newNode = new StackNode(data, head); // newNode.next = head
        head = newNode;
    }

    public void pop() {
        if (head == null) {
            throw new Error("Stack is empty");
        }
        head = head.getNext(); // just move head to next
    }

    public int peek() {
        if (head == null) {
            throw new Error("Stack is empty");
        }
        return head.getData();
    }
     public int size(){
        if ( head == null){
            return 0;
        }else{
            int count =0;

            StackNode currentNpde = head;
            while ( currentNpde != null){
                currentNpde = currentNpde.getNext();
                count++;
            }

            return count;
        }
     }

     public boolean isEmpty(){
        return this.size() == 0;
     }
   public void printList(){
        StackNode currentNode = head;
        while (currentNode != null){
            System.out.print( currentNode.getData() + "->");
            currentNode = currentNode.getNext();
        }
       System.out.println(" ");
   }
}
