package array;

public class MaximumDifference {
    public static void main(String[] args) {
        int[] arr = {10, 20, 50, 30, 70, 60, 50, 90};
        maxdif(arr);
    }
    public static void maxdif(int[] arr){
        int diff=arr[1]-arr[0];
        int min=arr[0];
        for (int i = 1; i < arr.length; i++) {
            diff=Math.max(diff,arr[i]-min);
            min=Math.min(arr[i],min );
        }
        System.out.println(diff);
    }

}
