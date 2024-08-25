package hashing;

import java.util.HashMap;
import java.util.Map;

public class CountFrequency {
    public static void main(String[] args) {
        int[] arr=new int[]{15,30,35,15,45,45,60};
            countfreq(arr);
    }
    public static void countfreq(int[] arr){
        Map<Integer,Integer>mp=new HashMap<>();
        for (int i=0;i< arr.length;i++){
            if (mp.containsKey(arr[i]))
                mp.put(arr[i], mp.get(arr[i])+1);
            else
                mp.put(arr[i],1 );
        }
        for (Map.Entry<Integer,Integer>itr:mp.entrySet())
            System.out.println(itr.getKey()+" "+ itr.getValue());
    }
}
