package java_pratice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaArraylists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int inputCount = sc.nextInt();
		List <List <Integer>> inputContainerList = new ArrayList<>();
		
		for (int i = 0; i < inputCount; i++) {
			int rowsize = sc.nextInt();
			List rowContainer = new ArrayList<>();
			
			for (int j = 0; j < rowsize; j++) {
				rowContainer.add(sc.nextInt());
			}
			inputContainerList.add(rowContainer);
		}
		
		System.out.println(inputContainerList);
		
		System.out.println("Enter for queries");
		int queriesCount = sc.nextInt();
	
		for (int i = 0; i < queriesCount; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			try {
			System.out.println(inputContainerList.get(x).get(y));
			}catch (Exception e ) {
				System.out.println("!ERROR");
			}
		}

	}

}
