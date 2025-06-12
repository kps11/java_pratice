package java_pratice.array;
//https://leetcode.com/problems/unique-paths/description/
public class UniquePath {
    public static void main(String[] args) {
        int [] [] dp = new int[3][3];
        int rows = dp.length;
        int columns = dp[0].length;
        System.out.println(rows +" " + columns);
        int result = findUniquePath(rows, columns ,dp);
        System.out.println(result + " result");

    }

    public static int findUniquePath(int m , int n , int [] [] arr){

        //for rows
        for (int i = 0; i < m; i++) {
            arr[i][0] = 1;
        }

//        for columns
        for (int i = 0; i < n; i++) {
            arr[0][i] = 1;
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                arr[i][j] = arr[i-1][j] + arr[i] [j-1];
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i] [j] + " ");
            }
            System.out.println(" ");
        }

        return  arr[m-1] [n-1];

    }
}
