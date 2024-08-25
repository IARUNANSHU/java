package array;

public class StockBuySell {
    public static void main(String[] args) {
        int[] arr ={10,20,50,60,30,40,20,10};
        profit(arr);
    }
    public static void profit(int[] arr){
        int prof=0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>arr[i-1])
                prof=prof+(arr[i]-arr[i-1]);
        }
        System.out.println(prof);
    }
}
