package array;

public class LeftRotateByDPlaces {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50,60,70,80,90};
        rotatebydplace(arr,4, arr.length);
    }
    public static void rotatebydplace(int[] arr, int d, int n){
        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
        reverse(arr, 0, n - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    static void reverse(int arr[], int low, int high) {
        while (low < high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }

    }

}
