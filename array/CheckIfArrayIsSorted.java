package array;

public class CheckIfArrayIsSorted {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60};
        System.out.println(sortedarraycheck(arr));

    }
    public static boolean sortedarraycheck(int arr[]){
        for (int i = 1; i < arr.length; i++) {
            if (arr[i-1]>arr[i]){
               return false;
            }
        }
        return true;
    }
}
