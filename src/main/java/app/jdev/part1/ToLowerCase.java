package app.jdev.part1;

public class ToLowerCase implements StringOperation {
    @Override
    public String operation(String string) {
        return string.toLowerCase();
    }
}