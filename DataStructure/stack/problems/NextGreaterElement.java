package java_pratice.DataStructure.stack.problems;

import java_pratice.DataStructure.stack.Stack;

import java.util.Arrays;
//Next Greater Element
//For each element in an array, find the next greater element using stack.
public class NextGreaterElement {
    public static void main(String[] args) {
        Stack st = new Stack();
        int [] input = {4, 5, 2, 10};
        int [] result = new int[input.length];
        Arrays.fill(result, -1);
        for (int i = 0; i < input.length; i++) {
            while (!st.isEmpty() && input[i] > input[st.peek()]) {
                int idx = st.pop();
                result[idx]=input[i];

            }
            st.push(i);
        }

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ,");

        }
    }
}
