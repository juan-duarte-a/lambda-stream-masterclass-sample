package app.jdev.part1;

import java.util.Comparator;

public class App {

    public void start() {
        ToLowerCase stringOperation = new ToLowerCase();

        String s = StringOperation.giveMeAString();
        System.out.println(stringOperation.operation(s));

        StringOperation toUpperCase = new StringOperation() {
            @Override
            public String operation(String string) {
                return string.toUpperCase();
            }
        };

        Comparator<String> comparator = new Comparator<>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        };

        System.out.println(toUpperCase.operation(s));
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