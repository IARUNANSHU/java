package array;


public class SearchInUnsortedArray {
    public static void main(String[] args) {
        int arr[]={45,12,89,23,67,45,35,90,56};
        System.out.println(search(arr, 35));
    }
    public static int search(int arr[],int key){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==key)
                return i;
        }
        return -1;
    }
}
