package array;

public class RemoveDuplicateFromSortedArray {
    public static void main(String[] args) {
        int arr[]= {10,20,30,40,40,50,50,50,70,70,90};
        duplicateRemove(arr);

    }
    public static void duplicateRemove(int[] arr){
        int count=1;
        for (int i = 1; i < arr.length-1; i++) {
            if(arr[count-1]!=arr[i]){
                arr[count]=arr[i];
                count++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
