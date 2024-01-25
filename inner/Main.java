package academy.olga.homework21.inner;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Биография");
        Book.Author author = book.new Author("Vasua", 10);
        System.out.println(book);
        System.out.println(author);
    }
}
