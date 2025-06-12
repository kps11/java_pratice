package java_pratice.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindTheDuplicate {
    public static void main(String[] args) {
        int [] arr = {3,2,1,2,5};
        Map <Integer,Integer> map = new HashMap<>();
        int repeatNummber =0 ;
        for (int i = 0; i < arr.length; i++) {
            if (map.get(arr[i]) != null){
                repeatNummber = arr[i];
                break;
            }else {
                map.put(arr[i],1 );
            }
        }
        System.out.println(repeatNummber);

    }
}
