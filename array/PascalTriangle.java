package java_pratice.array;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args) {
        List < List<Integer>> triangle = new ArrayList<>();

        for (int i = 0 ; i< 5 ; i ++){
            List<Integer> newList = new ArrayList<>();

            for (int j = 0; j <= i; j++) {

                if (j == 0 || j == i){
                    newList.add(1);
                }else {
                    int val = triangle.get(i-1).get(j-1) + triangle.get(i-1).get(j);
                    newList.add(val);
                }
            }
            triangle.add(newList);
        }
        System.out.println(triangle);
    }
}
