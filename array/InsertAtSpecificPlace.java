package array;

public class InsertAtSpecificPlace {
    public static void main(String[] args) {
        int arr[]=new int[5];
        arr[0]=12;
        arr[1]=6;
        arr[2]=3;
        arr[3]=9;
        insertplace(arr,7,3);
    }
    public static void insertplace(int arr[],int key,int position){
        int i;
        for (i=arr.length-1 ; i >position ; i--) {
            arr[i]=arr[i-1];

        }
        arr[i]=key;
        for(int x:arr){
            System.out.println(x);
        }
    }
}
