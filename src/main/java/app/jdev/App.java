package app.jdev;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import app.jdev.entity.Book;
import app.jdev.entity.BookFactory;

public class App {

    public void start() {
        Stream<Integer> intStream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        intStream.filter(i -> i % 2 != 0).forEach(i -> System.out.println(i));

        List<Book> books = BookFactory.createListOfBooks(30);

        // books.stream().filter(book -> book.getYear() >= 1990)
        //               .sorted((book1, book2) -> book1.getTitle().compareTo(book2.getTitle()))
        //               .forEach(book -> System.out.println(book));

        List<String> authors = books.stream()
                .filter(book -> book.getPrice() > 7000)
                .map(book -> book.getAuthor())
                .distinct()
                .sorted()
                .toList();

        List<String> authors2 = new ArrayList<>();
        for (Book book : books) {
            if (book.getPrice() > 7000) {
                if (!authors2.contains(book.getAuthor())) {
                    authors2.add(book.getAuthor());
                }
            }
        }
        authors2.sort((a1, a2) -> a1.compareTo(a2));

        System.out.println(authors);

        int maxPrice = books.stream().mapToInt(book -> book.getPrice()).max().getAsInt();

        System.out.println(maxPrice);
    }

    public static void main(String[] args) {
        App app = new App();
        app.start();
    }

}