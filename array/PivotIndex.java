package java_pratice.array;

import java.util.Arrays;
//Problem:
//Given an array of integers, find the pivot index where the sum of all elements to the left of the index is equal to the sum of all elements to the right.
//
//        Example:
//Input: [1, 7, 3, 6, 5, 6]
//Output: 3 (because 1+7+3 = 11 and 5+6 = 11)
public class PivotIndex {
    public static void main(String[] args) {
        int [] arr = {1, 7, 3, 6, 5, 6};
        int sum = Arrays.stream(arr).sum();
        int left_sum = 0;
        for (int item : arr){
            if ( left_sum == sum - left_sum-item){
                System.out.println("item " + item);
                break;
            }else {
                left_sum = left_sum+ item;
            }
        }
    }
}
