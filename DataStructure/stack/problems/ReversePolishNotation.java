package java_pratice.DataStructure.stack.problems;

import java_pratice.DataStructure.stack.Stack;

import java.util.Arrays;

public class ReversePolishNotation {
    public static void main(String[] args) {
        Stack st = new Stack();
        String [] operators = {"+", "-", "*","/"};
        String query = "5 1 2 + 4 * + 3 -";
        String [] tokens = query.split(" ");
        for (int i = 0; i < tokens.length; i++) {
            if (Arrays.asList(operators).contains(tokens[i])){
                getExpressionValue(st,tokens[i]);
            }else {
                st.push(Integer.parseInt( tokens[i]));

            }

        }

        System.out.println(st.pop());
    }

    public static void getExpressionValue (Stack st ,String operator){
        int operand1 = st.pop();
        int operand2 = st.pop();
        switch (operator){
            case "+":
                st.push(operand2 + operand1);
                break;
            case "-":
                st.push( operand2 - operand1);
                break;
            case "*":
                st.push( operand2 * operand1);
                break;
            case "/":
                st.push(operand2 / operand1);
                break;
            default:
                System.out.println(" unsupported chracter");

        }
    }
}
