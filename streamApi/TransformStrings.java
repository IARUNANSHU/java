package streamApi;

import java.util.List;
import java.util.stream.Collectors;

public class TransformStrings {
    public static void main(String[] args) {
        List<String> strings = List.of("apple", "banana", "cherry", "date");

        List<String> transformed = strings.stream()
                .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1))
                .collect(Collectors.toList());

        System.out.println(transformed);
    }
}

