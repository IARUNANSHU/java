package streamApi;

import java.util.Comparator;
import java.util.List;

public  class Fp01 {
    public static void main(String[] args) {
        List<Integer>l=List.of(10,20,40,36,47,68,78);
        printall(l);
        List<String>li=List.of("math","history","geography");
        individualprint(li);
        containkey(li);
        contain4letter(li);
        squareofnumber(l);
        numberofcharacter(li);
        System.out.println(reducemethod(l));
        System.out.println(squareandsum(l));
        sortbylength(li);
        sortbyreverse(li);
    }

    public  static boolean odd(int number){
        return number%2!=0;
    }
    public static void print(int number){
        System.out.println(number);
    }
    public static void printm(String s){
        System.out.println(s);
    }
    //q1
    private static void printall(List<Integer> numbers){
        numbers.stream()
                .filter(Fp01::odd)
                .forEach(Fp01::print);
    }
    //q2
    private static void individualprint(List<String> li){
        li.stream()
                .forEach(Fp01::printm);
    }
    //q3
    private static void containkey(List<String> li){
        li.stream()
                .filter(p->p.contains("math"))
                .forEach(System.out::println);
    }
    //q4
    private static void contain4letter(List<String>li){
        li.stream()
                .filter(p->p.length()>7)
                .forEach(System.out::println);
    }
    //q5
    private static void squareofnumber(List<Integer> li){
        li.stream()
                .filter(p->p%2==0)
                .map(p->p*p)
                .forEach(System.out::println);
    }
    //q6
    private static void numberofcharacter(List<String> li){
        li.stream()
                .forEach(p-> System.out.println(p.length()));
    }
    //q7
    private static int reducemethod(List<Integer> li){
        return li.stream()
                .reduce(0,(a,b)->a+b);
    }
    private static int reducemetho(List<Integer> li){
        return li.stream()
                .reduce(0,(a,b)->a>b ? a:b);
    }
    private static int minimum(List<Integer> li){
        return li.stream()
                .reduce(Integer.MAX_VALUE,(a,b)->a>b ? a:b);
    }
    private static int squareandsum(List<Integer> li){
        return li.stream()
                .map(a->a*a)
                .reduce(0,Integer::sum);
    }
    private static int sumofoddnumber(List<Integer> li){
        return li.stream()
                .filter(a->a%2!=0)
                .reduce(0,(a,b)->a+b);
    }
    private static void sortbylength(List<String> li){
        li.stream()
                .sorted(Comparator.comparing(a->a.length()))
                .forEach(System.out::println);
    }
    private static void sortbyreverse(List<String> li){
        li.stream()
                .sorted(Comparator.naturalOrder())
                .forEach(System.out::println);
    }
}