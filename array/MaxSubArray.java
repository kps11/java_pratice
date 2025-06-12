package java_pratice.array;

import java.util.ArrayList;
import java.util.List;

public class MaxSubArray {
    public static void main(String[] args) {
        int [] arr = {-2,1,-3,4,-1,2,1,-5,4};
//        int [] arr = {1,2,-3,4,-5,-6,7,8,-9,10};
        //Kadens algorithim for maxsubArray
        int currentMax = arr[0];
        List<Integer> al = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        int maxSoFar = arr[0];
        al.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
//            currentMax = Math.max(arr[i], arr[i] + currentMax);
//            maxSoFar = Math.max(maxSoFar, currentMax);

            if ( arr[i] > currentMax + arr[i]){
                currentMax = arr[i];
                al.clear();
                al.add(arr[i]);
            }else{
                currentMax = currentMax+ arr[i];
                al.add(arr[i] );
            }
            if ( currentMax > maxSoFar){
                maxSoFar = currentMax;
                result.clear();
                result.addAll(al);
            }

        }

        System.out.println(al + " "+ result+ " " + maxSoFar);
    }
}
