package java_pratice.array;

import java.util.ArrayList;
import java.util.List;
//https://leetcode.com/problems/spiral-matrix/description/
public class SprialMatrix {
    public static void main(String[] args) {
        int [] [] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        List ans = printSprialMatrix(matrix);
        System.out.println(ans);
    }
    public  static List<Integer> printSprialMatrix(int [] [] matrix){
        int n = matrix.length;///rows
        int m = matrix[0].length; //columns
        List <Integer> result = new ArrayList<>();
        int top = 0 , left =0, right = m-1 , bottom = n -1;
        while( top <= bottom && left <= right ){

            for (int i = left ; i <= right; i ++) {
                result.add(matrix[left][i]);
            }
            top ++;

            for (int i = top ; i <= bottom; i ++){
                result.add(matrix[i][right]);
            }
            right --;

            if ( top <= bottom){
                for (int i = right ; i >= left ; i --){
                    result.add(matrix[bottom][i]);
                }
                bottom --;
            }

            if (left <= right){
                for (int i = bottom; i>= top; i --){
                    result.add(matrix[i][left]);
                }
                left ++;
            }
        }

        return result;
    }
}

