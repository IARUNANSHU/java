package arraylist;

import java.util.ArrayList;
import java.util.List;

public class PairSum {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        int key=10;
        pairs(arr,key);
    }
    public static void pairs(int[] arr,int key){
        List<String>li=new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]+arr[j]==key){
                    li.add("("+arr[i]+","+arr[j]+")");
                }
            }
        }
        System.out.println(li);
    }
}
