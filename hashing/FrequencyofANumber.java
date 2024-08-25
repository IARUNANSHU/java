package hashing;

import java.util.HashMap;
import java.util.Map;

public class FrequencyofANumber {
    public static void main(String[] args) {
        int[] arr={10,20,30,10,20,30,40,50};
        freq(arr);
    }
    public static void freq(int[] arr){
        Map<Integer,Integer>mp=new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            mp.put(arr[i], mp.getOrDefault(arr[i],0)+1 );
        }
        for (Map.Entry<Integer,Integer>en:mp.entrySet()){
            System.out.println(en.getKey()+" ,"+en.getValue());
        }
    }
}
