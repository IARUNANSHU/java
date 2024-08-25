package array;

public class Sort012 {
    public static void main(String[] args) {
        int[] arr={1,1,2,2,0,0,2,1,1,0};
        sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }

    }
    public static int[] sort(int[] arr){
        int i=0;
        int j=0;
        int k= arr.length-1;
        while (j<=k){
            switch (arr[j]){
                case 0:
                    swap(arr,i,j);
                    i++;
                    j++;
                    break;
                case 1:
                    j++;
                    break;
                case 2:
                    swap(arr,j,k);
                    k--;
                    break;
            }
        }
        return arr;
    }
    public static void swap(int[] arr,int x,int y){
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
}
