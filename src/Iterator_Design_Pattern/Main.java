package Iterator_Design_Pattern;

public class Main {
    public static void main(String[] args) {
        Book[] books = {
                new Book("The Alchemist"),
                new Book("1984"),
                new Book("Clean Code")
        };

        Library library = new Library(books);
        Iterator<Book> iterator = library.createIterator();

        while (iterator.hasNext()) {
            Book book = iterator.next();
            System.out.println(book.getTitle());
        }
    }
}
