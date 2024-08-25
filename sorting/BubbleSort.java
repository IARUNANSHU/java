package sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={30,12,56,34,80,56,32,90,50};
        bubble(arr);
        for (int i:arr){
            System.out.println(i);
        }
    }
    public static void bubble(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j]<arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }


}
