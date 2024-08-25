package array;

public class PairSum {
    public static void main(String args[])
    {
        int[] arr = { 1, 5, 7, -1, 5 };
        int K = 6;
        getPairsCount(arr, K);
    }

    public static void getPairsCount(int[] arr, int K)
    {

        int count = 0;
        for (int i = 0; i < arr.length; i++)
            for (int j = i + 1; j < arr.length; j++)
                if ((arr[i] + arr[j]) == K)
                    count++;

        System.out.printf("Count of pairs is "+ count);
    }
}
