package array;

public class DeleteElement {
    public static void main(String[] args) {
        int arr[]={13,24,57,34,89,39};
        delete(arr,57);

    }
    public static void delete(int arr[],int key){
        int i;
        for(i=0;i< arr.length;i++){
            if(arr[i]==key){
                break;
            }
        }
        if(i== arr.length){
            return;
        }
        for (int j = i; j < arr.length-1 ; j++) {
            arr[j]=arr[j+1];
        }
        for(int k:arr){
            System.out.println(k);
        }
    }
}
