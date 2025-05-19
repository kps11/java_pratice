package java_pratice.array;
//https://leetcode.com/problems/search-a-2d-matrix/description/
import java.util.Arrays;
import java.util.stream.IntStream;

public class TwoDmatrixSearch {
    public static void main(String[] args) {
        int [] [] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 3;
        int [] result = {};
        boolean isAvailable = false;
        System.out.println(matrix.length);
        for (int i = 0; i < matrix.length; i++) {
            result = IntStream.concat(Arrays.stream(result), Arrays.stream(matrix[i]))
                    .toArray();
        }

        for (int i = 0; i < result.length; i++) {
            if ( target == result[i]){
                isAvailable = true;
            }
        }
        System.out.println(isAvailable);
    }
}
