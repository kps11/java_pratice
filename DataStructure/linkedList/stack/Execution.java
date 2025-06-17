package java_pratice.DataStructure.linkedList.stack;

public class Execution {
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(5);
        st.push(7);
        st.push(8);
        st.push(9);

        st.printList();
        st.pop();
        st.printList();
        System.out.println(st.peek());
        System.out.println(st.size());
        System.out.println(st.isEmpty());
    }
}
