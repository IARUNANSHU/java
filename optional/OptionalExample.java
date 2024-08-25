package optional;

import java.util.NoSuchElementException;
import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        //beforeoptional();
        withjava8();
    }
    public static void beforeoptional(){
        String[] str=new String[10];
        String lowercase=str[5].toLowerCase();
        System.out.println(lowercase);
    }
    public static void withjava8(){
        String[] str=new String[10];
        str[5]="Arunanshu jena";

        Optional<String> empty=Optional.empty();
        System.out.println(empty);

        Optional<String> value=Optional.of(str[5]);
        System.out.println(value.get());

        Optional<String>nullvalue=Optional.ofNullable(str[4]);
        nullvalue.ifPresent(System.out::println);
        System.out.println(nullvalue.orElse("no value"));

        Optional<String> notnull=Optional.of("Arunanshu jena");
        Optional<String> isnull=Optional.empty();

        System.out.println(notnull.map(String::toUpperCase));
        System.out.println(isnull.map(String::toUpperCase));

        Optional<Optional<String>> nonEmpty=Optional.of(Optional.of("Arunanshu jena"));
        System.out.println(nonEmpty);
        System.out.println(nonEmpty.map(input->input.map(String::toUpperCase)));
        System.out.println(nonEmpty.flatMap(input->input.map(String::toUpperCase)));

        Optional<String> country=Optional.of("India");
        Optional<String> mycountry=Optional.empty();

        System.out.println(country.filter(g->g.equals("india")));
        System.out.println(country.filter(g->g.equalsIgnoreCase("INDIA")));
        System.out.println(mycountry.filter(g->g.equalsIgnoreCase("india")));

        if(country.isPresent()){
            System.out.println("value available");
        }
        if (mycountry.isPresent()){
            System.out.println("value not available");
        }
        country.ifPresent(c-> System.out.println("option available"));

        mycountry.ifPresent((c-> System.out.println("option not available")));

        System.out.println(country.orElse("no data avilable"));
        System.out.println(mycountry.orElse("data is empty"));
        System.out.println(mycountry.orElseGet(()->"no data found"));
        System.out.println(mycountry.orElseThrow(NoSuchElementException::new));
    }
}
