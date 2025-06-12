package java_pratice.array;

public class StockSell {
    public static void main(String[] args) {
//        int [] stock = {7,1,2,3,6,5};
        int [] stock = {7,6,5,4,3,2,1};
        int profit = sellStock(stock);
        System.out.println(profit);
    }

    public static int sellStock(int [] a){
        int max = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            min = Integer.min(min, a[i]);
            max = Integer.max(max, a[i] - min);
        }

        return max;
    }
}
