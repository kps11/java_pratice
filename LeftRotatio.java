package java_pratice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeftRotatio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Integer>a = new ArrayList<> ();
		a.add(4);
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(5);
		a.add(6);
		a.add(7);
		a.add(8);
		a.add(9);
		
		System.out.println(a);
		System.out.println(a.subList(0, 5));
		System.out.println("result " + leftRotation(a, 5));
		
		}
	
	public static List<Integer> leftRotation(List a, int rIndex){
		List <Integer> leftList;
		List <Integer> rightList;
		int length = a.size();
		if(length > rIndex) {
			leftList = a.subList(0, rIndex);
			rightList = a.subList(rIndex, length);
		}else {
			int newRIndex = rIndex % length ;
			leftList = a.subList(0, newRIndex);
			rightList = a.subList(newRIndex, length);
			System.out.println("left List "+ leftList);
		}
			
		
		rightList.addAll(leftList);
		return rightList;
	}

}
