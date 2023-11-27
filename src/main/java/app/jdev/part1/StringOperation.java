package app.jdev.part1;

@FunctionalInterface
public interface StringOperation {
    String operation(String string);

    static public String giveMeAString() {
        return "Take your String";
    }
}