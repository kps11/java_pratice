package java_pratice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SparseArray {
 public static void main( String [] args) {
	
	  List <String> stringList =Arrays.asList("ab", "abc", "ab");
	  List <String> queryList = Arrays.asList("ab", "bc", "abc");
	 System.out.println(matchingStrings(stringList, queryList)); 
	  
}
 
 public static List<Integer> matchingStrings( List <String> stringList ,List <String> queryList){
	 List <Integer> count = new ArrayList<>();
	 Map<String, Integer> frequency = new HashMap<>();
	 int lastIndex=0;
	 String key ="";
	 for (int i = 0; i < stringList.size(); i++) {
		 key =stringList.get(i);
			 frequency.put(key,frequency.getOrDefault(key,0)+1);

	}
	 for(int i =0; i<queryList.size(); i++) {
		 Integer occurance = frequency.get(queryList.get(i));
		 if(occurance != null && occurance >= 0) {
			 count.add(occurance);
		 }else {
			 count.add(0);
		 }
	 }
	 return count;
 }
}
