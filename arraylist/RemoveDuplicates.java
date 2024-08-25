package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.LinkedHashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 3, 4, 4, 5, 7, 7, 7, 8, 9, 9));

        // Using a LinkedHashSet to maintain the order of elements while removing duplicates
        List<Integer> uniqueList = new ArrayList<>(new LinkedHashSet<>(list));

        System.out.println("List after removing duplicates: " + uniqueList);
    }
}
