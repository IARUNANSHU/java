package streamApi;

import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class Fp06 {
    public static void main(String[] args) {
        List<Integer> li=List.of(10,20,30,40,50,60,70,80);
        System.out.println(li.stream().map(x->x*x).reduce(0,(a,b)->a+b));

        li.stream().skip(7).forEach(System.out::println);

        Random random=new Random();
        Stream.generate(random::nextInt).limit(10).forEach(System.out::println);
    }
}
