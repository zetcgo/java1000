package library;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Library {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Clean Code", 25000, false));
        books.add(new Book("Design Patterns", 40000, false));
        books.add(new Book("Effective Java", 35000, false));
        books.add(new Book("Head First Java", 33000, false));
        books.add(new Book("Introduction to Algorithms", 45000, false));
        books.add(new Book("Java Programming", 30000, false));
        books.add(new Book("Java Concurrency in Practice", 37000, false));
        books.add(new Book("The Art of Computer Programming", 60000, false));
        books.add(new Book("The Pragmatic Programmer", 32000, false));
        books.add(new Book("You Don't Know JS", 28000, false));
        System.out.println("=== Initial Books ===");
        books.forEach(System.out::println);

        Collections.shuffle(books);
        books.subList(0, 5).forEach(Book::setRented);
        books.sort(Comparator.comparing(book -> book.title));

        System.out.println("=== Books Left ===");
        books.stream().filter(book -> !book.rented).forEach(System.out::println);
    }
}
