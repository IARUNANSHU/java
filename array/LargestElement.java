package array;

public class LargestElement {
    public static void main(String[] args) {
        int arr[]={20,45,18,15,58,36,87};
        System.out.println(large(arr));
    }
    public  static int large(int arr[]){
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max=Math.max(arr[i],max);
        }
        return max;
    }
}
