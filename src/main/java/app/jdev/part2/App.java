package app.jdev.part2;

import java.util.ArrayList;
import java.util.List;

public class App {

    public void start() {
        String s = StringOperation.giveMeAString();

        StringOperation toUpperCase = string -> string.toUpperCase();
        StringOperation toLowerCase = string -> string.toLowerCase();
        StringOperation reverse = string -> new StringBuilder(string).reverse().toString();

        System.out.println(toUpperCase.operation(s));
        System.out.println(toLowerCase.operation(s));
        System.out.println(reverse.operation(s));

        List<String> strings = new ArrayList<>(List.of("Hey!", "dog", "12345", "ab"));
        strings.sort((s1, s2) -> s1.length() - s2.length());
        System.out.println(strings);
    }

    public static void main(String[] args) {
        App app = new App();
        app.start();
    }

}

class OtherClass {
    public void method() {
        System.out.println(StringOperation.giveMeAString());
    }
}