package java_pratice;

import java.io.*;
import java.util.*;




public class JavaArrayList{

	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of list ");
		int size1 = sc.nextInt();
		
		
		
		
		ArrayList <String>ar1 =new ArrayList<>();
	    ArrayList <String>ar2 =new ArrayList<>();
	    for(int i=0;i<size1+1;i++)
	    {
	        ar1.add(sc.nextLine());
	    }
	    
	    System.out.println("Enter no of list ");
		int size2 = sc.nextInt();
		//getting quey input from user
		for(int i =0 ; i<size2+1  ; i++) {
			ar2.add(sc.nextLine());
		}
		System.out.println("al"+ar2);
		
		//remove empty 
		ar1.removeIf(String :: isEmpty);
		ar2.removeIf(String :: isEmpty);
		
		System.out.println(ar1.get(0).charAt(4));
		
		
	}
}