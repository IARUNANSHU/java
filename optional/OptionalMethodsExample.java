package optional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
public class OptionalMethodsExample{
    public static void main(String[] args){
        String str = "jay";
        Optional<String>  str1 = Optional.ofNullable(str);
        System.out.println(str1);

        String[] s = new String[10];
        s[5] = "Hello world";
        Optional<String> a = Optional.ofNullable(s[5]);
        System.out.println(a);
        System.out.println(a.get());
        System.out.println(a.orElse("Hi"));
        System.out.println(a.isPresent());

        Optional<String> b = Optional.empty();
        System.out.println(b);

        Optional<String> c = Optional.of("Jay");
        System.out.println(c.get());

        //Arrays
        String[] s_arr = new String[10];
        Optional<String[]> x = Optional.of(s_arr);
        System.out.println(Arrays.toString(x.orElse(new String[]{"hhh","jj"}))); //.orElse() is of no use

        //List
        List<String> s_list = new ArrayList<>(Arrays.asList("kl","jo"));
        Optional<List<String>> y = Optional.ofNullable(s_list);
        System.out.println(y.orElseGet(ArrayList::new));
        System.out.println(y.orElse(Arrays.asList("fwqf"))); //.orElse() is of no use as there will be reference to object everytime
    }
}

