package searching;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr=new int[]{10,20,30,40,50,60,70,80,90};
        System.out.println(binarysearch(arr,30));

    }
    static int binarysearch(int[] arr,int key){
        int i=0;
        int j= arr.length-1;
        while (i<j){
            int mid=(i+j)/2;
            if (key==arr[mid])
                return mid;
            else if (key<arr[mid]) {
                j=mid-1;
            }
            else i=mid+1;
        }
        return -1;
    }
}
