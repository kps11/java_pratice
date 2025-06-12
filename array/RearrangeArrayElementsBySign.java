package java_pratice.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class RearrangeArrayElementsBySign {
    public static void main(String[] args) {
        int [] arr = {3,4,-5,-2,1,-4};
        reArrange(arr);

    }
    public  static  int [] reArrange(int [] arr){
        int [] pos = Arrays.stream(arr).filter(value -> value > 0).toArray();
        int [] neg = Arrays.stream(arr).filter(value -> value <0 ).toArray();
        List <Integer> result =new  ArrayList();

        for (int i = 0; i < pos.length; i++) {
            result.add(pos[i]);
            result.add(neg[i]);
        }

        return result.stream().mapToInt(Integer::intValue).toArray();

    }
}
