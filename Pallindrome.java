package java_pratice;

public class Pallindrome {
	static boolean checkPallindrome (String str) {
		char [] strToChar = str.toCharArray();
		int strLength = strToChar.length;
		boolean isPallindrome = true;
		for(int i =0 ; i< strLength ; i++) {
			if( strToChar[i] == strToChar[strLength-1-i]) {
				continue;
			}else {
				isPallindrome = false;
				break;
			}
			
		}
		System.out.println(str);
		return isPallindrome;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 
	boolean check = checkPallindrome("RACECAR");
	System.out.println(check);
	}

}
