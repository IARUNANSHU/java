package streamApi;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
public class StreamPractice{
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(1,23,43,1,54,3,2,4,43,53,9));
        System.out.println(list.stream().filter(x -> x%2==0).toList());

        //seperate odd and even numbers 
        List<Integer> l1 = new ArrayList<Integer>(Arrays.asList(1,22,43,10,54,3,2,4,43,53,9));
        Map<Boolean, List<Integer>> map1 = l1.stream().collect(Collectors.partitioningBy(x -> x%2 == 0));
        System.out.println(map1.entrySet().stream().filter(x -> x.getKey() == true).collect(Collectors.toList()));
        System.out.println(map1);


        //remove duplicate elements from list
        List<Integer> l2 = new ArrayList<>(Arrays.asList(1,2,3,2,4,1,4,2,5,3,2));
        System.out.println(l2.stream().distinct().toList());


        //Frequency of each character in string
        String s1 = "my name is jay";
        System.out.println(Arrays.stream(s1.split("")).filter(x -> !x.equals(" ")).collect(Collectors.groupingBy(x -> x, Collectors.counting())));


        //Frequency of each element in an array - l2
        System.out.println(l2.stream().collect(Collectors.groupingByConcurrent(x->x, Collectors.counting())));


        //sort the list in reverse order - l1
        System.out.println(l1.stream().sorted(Collections.reverseOrder()).toList());


        //join list of string with any symbol(-) - s1
        System.out.println(
            Arrays.stream(s1.split(" ")).collect(Collectors.joining("-"))
        );


        //print multiple of 5 from a list - l1
        System.out.println(
            l1.stream().filter(x -> x%5 == 0 ).toList()
        );


        //Maximum and minimum in a list - l1
        System.out.println(
            l1.stream().max(Comparator.naturalOrder()).get()
        );
        System.out.println(
            // l1.stream().max(Comparator.reverseOrder()).get()
            l1.stream().min(Comparator.naturalOrder()).get()
        );


        //merge 2 unsorted array into a single sorted array
        // l1.addAll(l2);
        // l1.stream().sorted(Comparator.reverseOrder()).forEach(x->System.out.print(" " + x));


        //Anagram 
        String str1 = "race";
        String str2 = "care";
        String str3 = Stream.of(str1.split("")).sorted().map(s -> s.toUpperCase()).collect(Collectors.joining());
        String str4 = Stream.of(str2.split("")).sorted().map(String::toUpperCase).collect(Collectors.joining());
        System.out.println(str3 + " " + str4);


        //Three max and min numbers from a list - l1
        System.out.println(l1.stream().sorted().limit(3).toList());
        System.out.println(l1.stream().sorted(Comparator.reverseOrder()).limit(3).toList());


        //sum of all digits of a number
        int a = 12345;
        System.out.println(
                Stream.of(String.valueOf(a).split("")).mapToInt(Integer::parseInt).sum()
            );

        
        //second largest number in a integer array
        System.out.println(
            l1.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get()
        );


        //sort list of string in incresing order of their length - s1
        System.out.println(
            Arrays.stream(s1.split(" ")).sorted(Comparator.comparingInt(x -> x.length())).toList()
        );


        //common elements between 2 arrays
        System.out.println(
            l1.stream().filter(x -> l2.contains(x)).toList()
        );


        //sum and average of all elements of an array
        System.out.println(l1.stream().mapToInt(x -> x).sum());
        System.out.println(l1.stream().mapToInt(x -> x).average().orElse(0));


        //reverse each word of a string - s1
        System.out.println(
            Arrays.stream(s1.split(" ")).map(word -> new StringBuffer(word).reverse()).collect(Collectors.joining(" "))
        );


        //sum of first 10 natural numbers
        System.out.println(IntStream.range(1, 11).sum());


        //reverse an integer array - not working
        // IntStream.rangeClosed(1, l1.size()).map(i -> l1.get(l1.size()-i)).toArray();


        //find strings which start with number
        List<String> l3 = new ArrayList<>(Arrays.asList("wfw","5tes","eqf","6wc","f3f"));
        System.out.println(l3.stream().filter(x -> Character.isDigit(x.charAt(0))).toList());


        //Pallindrome 
        String s2 = "stats";
        System.out.println(
            IntStream.range(0, s2.length()/2).noneMatch(i -> s2.charAt(i) != s2.charAt(s2.length()-i-1))
        );


        //find duplicate elements in an array - l2
        System.out.println(
            l2.stream().filter(x -> Collections.frequency(l2, x)>1).distinct().toList()
        );


        //last element of an array
        System.out.println(l1.stream().skip(l1.size()-1).findAny().get());


        //fibonacci4
        Stream.iterate(new int[] {0,1}, f -> new int[] {f[1], f[0] + f[1]})
        .limit(10)
        .map(f -> f[0])
        .forEach(f -> System.out.print(" "+ f));
    }
}