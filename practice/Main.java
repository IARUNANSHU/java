package practice;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("a");
        list.add("b");
        System.out.println(System.identityHashCode(list));
        updatelist(list);

        System.out.println(System.identityHashCode(list));
        list.add("c");
        System.out.println(System.identityHashCode(list));
        System.out.println(list);
    }
    public  static void updatelist(List list){

        list.add("c");
        list.add("d");
//        list=null;
        System.out.println(list);


    }
}