package list.livros;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class CatalogBook {

    private List<Book> books = new ArrayList<>();

    public void addBook(final String author, final String title, final Integer publishYear){
        books.add(new Book(author, title, publishYear));
    }

    public List<Book> searchByAuthor(final String author){
        return books.stream().filter(Objects::nonNull).filter(book -> book.getAuthor().equals(author)).toList();
    }

    public List<Book> searchByIntervalPublishYear(final Integer startYear, final Integer endYear){
        return books.stream().filter(Objects::nonNull).filter(book -> book.getPublishYear() >= startYear).filter(book -> book.getPublishYear() <= endYear).toList();
    }

    public void printBooks(){
        System.out.println(books);
    }

    public static void main(String[] args) {
        CatalogBook book = new CatalogBook();

        book.printBooks();

        List<Book> bookList = book.searchByAuthor("Rodolfo");

        System.out.println("search " + bookList);

        book.addBook("Rodolfo", "Live", 2013);

        bookList = book.searchByAuthor("Rodolfo");

        System.out.println("search by author " + bookList);

        book.printBooks();

        book.addBook("Edilaine", "Live", 2024);

        bookList = book.searchByIntervalPublishYear(2025,2024);
        System.out.println("search by publish year" + bookList);

        List<Character> consoantesMeuNome = Arrays.asList('c', 'm', 'l', 'c', 'v', 'l', 'c', 'n', 't');
        System.out.println(consoantesMeuNome);
    }
}