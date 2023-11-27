package app.jdev.entity;

import java.util.List;
import java.util.stream.IntStream;

import com.github.javafaker.Faker;

public class BookFactory {

    private static Faker faker = new Faker();

    public static Book createBook() {
        return new Book(faker.book().title(),
                faker.book().author(),
                faker.book().publisher(),
                faker.random().nextInt(1900, 2023),
                faker.random().nextInt(1000, 10000));
    }

    public static List<Book> createListOfBooks(int size) {
        return IntStream.range(0, size)
                .mapToObj(i -> createBook())
                .toList();
    }

}
