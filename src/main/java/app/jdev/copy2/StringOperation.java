package app.jdev.copy2;

@FunctionalInterface
public interface StringOperation {
    String operation(String string);

    static public String giveMeAString() {
        return "Take your String";
    }
}