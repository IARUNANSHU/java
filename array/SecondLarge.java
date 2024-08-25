package array;

public class SecondLarge {
    public static void main(String[] args) {
        int arr[] = new int[]{10, 15, 37, 24, 97, 47};
        System.out.println(secondlrg(arr));
        // System.out.println(secondlarge(arr));
    }

    static int secondlarge(int arr[]) {
        int max = Integer.MIN_VALUE;
        int secondmax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(arr[i], max);
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != max) {
                secondmax = Math.max(arr[i], secondmax);
            }
        }
        return secondmax;
    }

    static int secondlrg(int arr[]) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for (int i : arr) {
            if (i > max1) {
                max2 = max1;
                max1 = i;
            } else if (i != max1 &&i > max2) {
                max2 = i;
            }
        }
        return max2;

    }
}