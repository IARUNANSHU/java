package sorting;

public class CountingSort {
    public static int[] countSort(int[] arr) {
        
        int M = 0;

        for (int i = 0; i < arr.length; i++) {
            M = Math.max(M, arr[i]);
        }

        int[] arr1 = new int[M + 1];

        for (int i = 0; i < arr.length; i++) {
            arr1[arr[i]]++;
        }

        for (int i = 1; i <= M; i++) {
            arr1[i] += arr1[i - 1];
        }

        int[] arr2 = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            arr2[arr1[arr[i]] - 1] = arr[i];
            arr1[arr[i]]--;
        }

        return arr2;
    }

    public static void main(String[] args) {
        int[] inputArray = {4, 3, 12, 1, 5, 5, 3, 9};
        int[] outputArray = countSort(inputArray);

        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(outputArray[i] + " ");
        }
    }
}
