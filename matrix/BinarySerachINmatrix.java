package matrix;

public class BinarySerachINmatrix {
    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        System.out.println(binarysearch(arr, 2));
    }

    public static boolean binarysearch(int[][] arr,int key){
        int n= arr.length;
        int m= arr[0].length;
        int i=0,j=n*m-1;
        while (i<=j){
            int mid=(i+j)/2;
            int row=mid/m;
            int col=mid%m;
            if(arr[row][col]==key)
                return true;
            else if (arr[row][col]<key)
                i=mid+1;
                else j=mid-1;
        }
        return false;
    }
}
