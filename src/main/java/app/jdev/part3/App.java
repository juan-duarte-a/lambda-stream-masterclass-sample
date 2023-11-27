package app.jdev.part3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class App {

    public void start() {
        String s = "Take your String";

        Function<String, String> toUpperCase = string -> string.toUpperCase();
        Function<String, String> toLowerCase = string -> string.toLowerCase();
        Function<String, String> reverse = string -> new StringBuilder(string).reverse().toString();

        System.out.println(toUpperCase.apply(s));
        System.out.println(toLowerCase.apply(s));
        System.out.println(reverse.apply(s));

        List<String> strings = new ArrayList<>(List.of("Hey!", "dog", "12345", "ab"));
        strings.sort((s1, s2) -> s1.length() - s2.length());
        strings.forEach(string -> System.out.println(string));

        Predicate<Integer> isEven = i -> i % 2 == 0;

        System.out.println(isEven.test(3));
        System.out.println(isEven.test(8));
    }

    public static void main(String[] args) {
        App app = new App();
        app.start();
    }

}