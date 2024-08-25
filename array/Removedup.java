package array;

public class Removedup {
    public static void main(String[] args) {
        int[] arr={10,20,20,30,30,30,40,40,50,50,60};
        removedup(arr);


    }
    public static int removedup(int arr[]){
        int j=0;
        for (int i = 1; i < arr.length; i++) {

            if (arr[j]!=arr[i]){
                j++;
                arr[j]=arr[i];

            }
        }
        return j+1;
    }
}
