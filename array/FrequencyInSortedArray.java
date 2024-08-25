package array;

public class FrequencyInSortedArray {
    public static void main(String[] args) {
        int[] arr={10,20,30,30,30,30,40,40,40,50,60,80,80};
        freqency(arr);
    }
    public static void freqency(int[] arr){
        int freq=1;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]!=arr[i-1]) {
                System.out.println(freq);
                freq = 1;
            }
            else
            freq++;
        }

    }
}
