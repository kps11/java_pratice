package java_pratice.array;
//https://leetcode.com/problems/rotate-image/description/
public class MatrixRotation {
    public static void main(String[] args) {
        int [] [] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        matrixTranspose(matrix);
    }
    public static void matrixTranspose(int [] [] a){
        int temp=0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a[0].length; j++) {
                temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }

        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length/2; j++) {
               temp = a[i][j];
               a[i][j] = a[i][a.length-j-1];
                a[i][a.length-j-1] = temp;
            }
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j]);
            }
            System.out.println(" ");
        }
    }
}
