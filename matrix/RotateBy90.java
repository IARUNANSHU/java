package matrix;

public class RotateBy90 {
    public static void main(String[] args) {
        int arr[][]={{10,20,30},{40,50,60},{70,80,90}};
        rotate(arr);
    }
    public static void rotate(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[1].length/2; j++) {
                int temp=arr[i][j];
                arr[i][j]=arr[i][arr.length-i-1];
                arr[i][arr.length-i-1]=temp;


            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[1].length; j++) {
                System.out.println(arr[i][j]);
            }
        }
    }
}
