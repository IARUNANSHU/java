package array;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] arr={0,10,0,20,40,50,0,7,0,5,8,0,13};
        movezero(arr);
    }
    public static void movezero(int[] arr){
        int count=0;
        for(int i=0;i< arr.length;i++){
            if (arr[i]!=0){
                arr[count++]=arr[i];

            }
        }
        while (count< arr.length){
            arr[count++]=0;

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }


}
