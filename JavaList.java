package java_pratice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class JavaList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List <Integer> inputList = new ArrayList();
	        Scanner sc = new Scanner(System.in);
	        
	        int size_of_list = sc.nextInt();
        
	        String list_String = sc.nextLine();
	        List <String > stringList  = Arrays.asList(list_String.trim().split(" "));
	        
	        for (String string : stringList) {
	            inputList.add(Integer.parseInt(string));
	        }
	        int no_of_queries = sc.nextInt();
	         for (int i = 0; i < no_of_queries; i++) {
	             String s = sc.next();
	            
	             if( s.equalsIgnoreCase("Insert")) {
	            	 int insert_index = sc.nextInt();
	     	        int insert_value = sc .nextInt();
	     	        
	     	        inputList.add(insert_index, insert_value);
	             }else if ( s.equalsIgnoreCase("delete")) {
	            	 int delete_index = sc.nextInt();
	     	        inputList.remove(delete_index); 
	             }
	            
	         }

	        System.out.println("input list "+ inputList);
	        
		

	}

}
