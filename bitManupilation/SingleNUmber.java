package java_pratice.bitManupilation;

import java.util.Arrays;

public class SingleNUmber {
    public static void main(String[] args) {
//       singleNumberWithDoubleOccurance();
//        singleNUmberWithTripleOccurance();
        singleNumberWithoutSort();
    }


    public static void singleNumberWithDoubleOccurance(){
        int [] a = {2,3,4,1,4,3,2};
        int result = 0;
        for (int i = 0; i < a.length; i++) {
            result = result ^ a[i];
        }

        System.out.println("result " + result);
    }

    public static void singleNUmberWithTripleOccurance(){
        int [] a = { 5,4,6,4,5,5,4};
        int b []  = Arrays.stream(a).sorted().toArray();
        int result =0;
        for (int i = 1; i < b.length; i =i +3) {
           if (b[i] != b[i-1]){
               result = b[i-1];
               break;
           }
            if ( i + 3 >= a.length ){
                result = b[b.length-1];
            }
        }

        System.out.println(result);
    }

    public static void singleNumberWithoutSort (){
        int a = 0 ;
        int b = 0;
        int x [] = { 5,4,3,4,5,5,4};
        for (int i = 0; i < x.length; i++) {
           a=  (a ^ x[i]) & ~b;
           b = (b^ x[i]) & ~a;
        }

        System.out.println(a);
    }
}
