package array;

public class Leaderinanarray {
    public static void main(String[] args) {
        int[] arr={10,20,30,15};
        System.out.println(leader(arr));
    }
    public static int leader(int[] arr){
        int lead=arr[arr.length-1];
        for (int i = arr.length-2; i >0; i--) {
            lead=Math.max(lead,arr[i]);
        }
        return lead;
    }
}
