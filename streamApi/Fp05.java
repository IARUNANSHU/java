package streamApi;

import java.util.List;
import java.util.stream.Collectors;

public class Fp05 {
//    1. Find the employee with the highest salary from a list of employee objects using streams.
//    2. Concatenate a list of strings into a single string, separated by commas, using streams.
//    3. Find the first non-repeating character in a string using streams.
//    4. Filter out movies of a specific genre and collect them into a set using streams..
//    5. Find the first name of the oldest person in a list of Person objects using streams.
//    6. Filter out null values from a list of strings using streams.
//    7. Find the sum of the squares of a list of integers using streams.
//    8. Skip the first 7 elements in a list and then print the rest using streams.
//    9. Generate an infinite sequence of random numbers and print the first 10 using streams.
//    10. Check if any string in a list starts with a specific prefix using streams.

    public static void main(String[] args) {
        List<String> li=List.of("santosh","ravi","shashank");
        System.out.println(li.stream().collect(Collectors.joining(" ")));
        System.out.println(li.stream().anyMatch(s -> s.startsWith("a")));
    }

}
