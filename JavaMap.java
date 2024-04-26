package java_pratice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	HashMap <String,String>mp = new HashMap<String , String>();
        
        Scanner sc = new Scanner (System.in );
        int sizeOfMap = sc.nextInt();
        sc.nextLine();
        
        for (int i =0 ; i< sizeOfMap ; i++) {
            String name = sc.nextLine();
            String phone_no = sc.nextLine();
            mp.put(name, phone_no);   
            sc.nextLine();
        }
        
        while (sc.hasNext()){
            String query = sc.nextLine();
             System.out.println( mp.get(query) !=null ?query + "="+ mp.get(query): "Not found");
        }
	}

}
