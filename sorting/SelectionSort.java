package sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {30, 12, 56, 34, 80, 56, 32, 90, 50};
        selection(arr);
        for (int x:arr){
            System.out.println(x);
        }
    }
    public static void selection(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int minin=i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j]<arr[minin]){
                    minin=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[minin];
            arr[minin]=temp;
        }
    }
}
