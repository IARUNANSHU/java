package streamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamOperation {
    public static void main(String[] args) {
        List<Integer>li= Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);

        //Given a list of integers, separate odd and even numbers?
        System.out.println(li.stream().collect(Collectors.partitioningBy(p->p%2==0)));

        String str=null;
        Optional.ofNullable(str).ifPresentOrElse(System.out::println,()-> System.out.println("invalid"));

    }
}
