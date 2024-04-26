package java_pratice;

import java.util.*;

public class Pratice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome back to java");
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the first number");
		int a = sc.nextInt();
		System.out.println("Please enter the second number");
		int b = sc.nextInt();
		
		Sum sum = new Sum();
		
		System.out.println("Total sum is "+ sum.add(a, b));
		System.out.println("Total sum is hello");

		
	}

}


class Sum{
	public int add ( int a , int b) {
		return a+b;
	}
}
