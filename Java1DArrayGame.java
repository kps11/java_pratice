package java_pratice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
 
public class Java1DArrayGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int leap = 4; 
		Integer [] array = {0,1,1,0,1,1,1,1,1,1,1,0,1,1,0,1,1,1,1,0,0,0,0,1,1,0,1,0,1,1,0,1,0,1,0,1,1,0,0,1,0,1,1,1,1,1,0,1,0,1,1,1,1,1,1,1,1,0,1,1,0,0,0,1,0,1,0,1
};
		List <Integer> game = Arrays.asList(array);
		System.out.println( (canWin(leap, game,0)) ? "YES" : "NO" );
	}
	
	public static boolean canWin(int leap,List gameArr ,int index) {
		
		System.out.println("Index "+ index );
		if(index < 0 || gameArr.get(index) == Integer.valueOf(1)) {
			return false;
		}
		if(index +1 > gameArr.size() -1 || index + leap > gameArr.size()-1) {
			return true;
		}
		
		gameArr.set(index, 1);
		
		
		return canWin(leap, gameArr, index+1) || canWin(leap, gameArr, index+ leap) || canWin(leap, gameArr, index-1);
	}

}



