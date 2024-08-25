package streamApi;

import java.util.List;
import java.util.stream.Collectors;

public class Email {
    public static void main(String[] args) {
        List<String>li=List.of("arunanshu@gmail.com","anish@gmail.com","aruanshu@hotmail.com");
        System.out.println(li.stream().collect(Collectors.groupingBy(e->e.split("@")[1],Collectors.counting())));

    }
}
