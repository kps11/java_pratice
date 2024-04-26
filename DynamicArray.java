package java_pratice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DynamicArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] [] q = {{1, 0, 5}, {1, 1, 7}, {1, 0, 3}, {2, 1, 0}, {2, 1, 1}};
				
		List <List<Integer>> queries = new ArrayList<>();
		
		 for (int[] array : q) {
	            List<Integer> tempList = new ArrayList<>();
	            for (int item : array) {
	                tempList.add(item);
	            }
	            queries.add(tempList);
	        }
		
		System.out.println("rresult "+ dynamicArray(2,queries)); 
		

	}
	
	public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
	    // Write your code here
	List <Integer> result = new ArrayList<>();
	List <List<Integer>> container = new ArrayList<>();
	int lastAnswer = 0 ;
	for(int i =0; i<n ;i++) {
		List<Integer> childList = new ArrayList<>();
		container.add(i, childList);
	}
	for (List <Integer> query : queries) {
	    int x = query.get(1);
	    int y = query.get(2);
	    
	    int index = (x ^ lastAnswer)%n; 
	    
	    if(query.get(0) == 1){
	    	container.get(index).add(y);
	    }else{
	        lastAnswer = container.get(index) .get(y % container.get(index).size());   
	        result.add(lastAnswer);
	    }
	    System.out.println(" container "+ container);
	    
	}
	return result;
	    }

}
