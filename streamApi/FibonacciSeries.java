package streamApi;

import java.util.stream.Stream;

public class FibonacciSeries {
    public static void main(String[] args) {
        Stream.iterate(new int[]{0,1},fib->new int[]{fib[1],fib[0]+fib[1]}).limit(5).map(e->e[0]).forEach(System.out::println);
    }
}
