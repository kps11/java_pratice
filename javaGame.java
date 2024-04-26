package java_pratice;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class javaGame {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
	        int q = scan.nextInt();
	        while (q-- > 0) {
	            int n = scan.nextInt();
	            int leap = scan.nextInt();
	            
	            Integer[] gameArray = new Integer[n];
	            for (int i = 0; i < n; i++) {
	                gameArray[i] = scan.nextInt();
	            }
	List <Integer> game = Arrays.asList(gameArray);
	            System.out.println( (canWin(leap, game,0)) ? "YES" : "NO" );
	        }
	        scan.close();
				
	}
	
	public static boolean canWin(int leap, List gameArr , int index) {
        // Return true if you can win the game; otherwise, return false.		
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
