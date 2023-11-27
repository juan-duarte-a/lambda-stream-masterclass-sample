package app.jdev.copy1;

public class ToLowerCase implements StringOperation {
    @Override
    public String operation(String string) {
        return string.toLowerCase();
    }
}