package java_pratice.DataStructure.stack.problems;

//import java_pratice.DataStructure.stack.Stack;

import java.util.Arrays;
//Balanced Parentheses
//Check if the expression has balanced brackets (), {}, [].
class StackNode{
    private String data;
    private StackNode next;

    public StackNode(String data, StackNode next) {
        this.data = data;
        this.next = next;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public StackNode getNext() {
        return next;
    }

    public void setNext(StackNode next) {
        this.next = next;
    }
}

class  Stack {
    private StackNode head;

    public void push ( String data){
        StackNode newNode = new StackNode(data, head);
        head = newNode;
    }
    public String pop (){
        if (head == null){
            throw new Error("List is empty");
        }else {
            String data = head.getData();
            head = head.getNext();
            return  data;
        }
    }
    public int size(){

            int count = 0;
            StackNode currentNode = head ;

            while (currentNode != null){
                currentNode = currentNode.getNext();
                count ++;
            }
            return count;
    }
}

public class BalancedParentheses {
    public static void main(String[] args) {
        Stack st = new Stack();
        String query = "()[]{}{";
        String [] openParanthesis = { "(", "{", "["};
        String [] tokens = query.split("");
        boolean isInvalid = false;
        for (String item : tokens){
            if(Arrays.asList(openParanthesis).contains(item)){
                st.push(item);
            }else {
                if (!validateString(st,item)){
                    isInvalid = true;
                    break;
                }

            }
        }

        if ( st.size() == 0 && !isInvalid){
            System.out.println(" valid string");
        }else {
            System.out.println("invalid String ");
        }
    }
    public static boolean validateString(Stack st , String item) {

        switch (item){
            case ")":
                return st.pop().equals("(") ;
            case "}":
                return st.pop().equals("{");
            case "]":
                return  st.pop().equals("[") ;

            default:
                return false;

        }
    }
}
