package Iterator_Design_Pattern;

public class Library implements BookCollection{

    private Book[] books;

    public Library(Book[] books) {
        this.books = books;
    }

    @Override
    public Iterator<Book> createIterator() {
        return new BookIterator(books);
    }
}
