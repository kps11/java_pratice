package java_pratice;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class BalanceString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);	
		String s = sc.next();
		boolean isBalanceString = false;
		char [] charArray = s.toCharArray();
				
		System.out.println(isBalance(charArray) ? "Perfect String" : "Not Balanced tree");
	}
	
	public static boolean isBalance(char [] charArray) {
		char check; 
		Stack<Character> st = new Stack();
		for (int i = 0; i < charArray.length; i++) {
			char character = charArray[i];
			if(character == '(' || character == '[' || character == '{') {
				st.push(charArray[i]);
				continue;
			}
			if (st.isEmpty()) {
				 return false;
			}
			switch (character) {
			
				case ')': 
					check = st.pop();
					if(check == '{' || check == '[') {
						return false;
					}
					break;
				case '}': 
					System.out.println(st.toString());
					check = st.pop();
					if(check == '(' || check == '[') {
						return false;
					}
					break;
				case ']': 
					check = st.pop();
					if(check == '{' || check == '(') {
						return false;
					}
					break;		
				
				}
			
			}
		return st.isEmpty();
	}
}

