package matrix;

public class SpiralTraversal {
    public static void main(String[] args) {
        int[][] arr={{10,20,30},{40,50,60},{70,80,90}};
        spiral(arr);
    }
    public static void spiral(int[][] arr){
        int top=0,bottom= arr.length-1,left=0,right= arr[1].length-1;
        while (top<=bottom&&left<=bottom){
            for(int i = left; i <= right; i++)
                System.out.print(arr[top][i] + " ");
            top++;

            for(int i = top; i <= bottom; i++)
                System.out.print(arr[i][right] + " ");
            right--;

            if(top <= bottom){
                for(int i = right; i >= left; i--)
                    System.out.print(arr[bottom][i] + " ");
                bottom--;
            }

            if(left <= right) {
                for (int i = bottom; i >= top; i--)
                    System.out.print(arr[i][left] + " ");
                left++;
            }
        }
    }
}
