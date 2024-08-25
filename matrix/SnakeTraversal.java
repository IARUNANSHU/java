package matrix;

public class SnakeTraversal {
    public static void main(String[] args) {
        int[][] arr={{10,20,30,130},{40,50,60,140},{70,80,90,150},{100,110,120,160}};
        spiralmove(arr);
    }
    public static void spiralmove(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(i%2==0){
                    System.out.print(arr[i][j]+" ");

                }
                if(i%2==1){
                    System.out.print(arr[i][arr.length-j-1]+" ");
                }
            }
            System.out.println();
        }
    }
}
