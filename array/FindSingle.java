package array;

public class FindSingle {
    public static void main(String[] args) {
        int[] arr={2, 3 ,4, 5,3,5,2};

        int res=arr[0];

        for (int i = 1; i < arr.length; i++) {
            res=res^arr[i];
        }

        System.out.println(res);
    }
}
