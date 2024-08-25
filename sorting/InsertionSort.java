package sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr={30,12,56,34,80,56,32,90,50};
        insert(arr);
        for (int x:arr){
            System.out.println(x);
        }
    }
    public static void insert(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int key=arr[i];
            int j=i-1;
            while (j>=0&&arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }
}
