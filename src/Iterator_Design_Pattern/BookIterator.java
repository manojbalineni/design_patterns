package Iterator_Design_Pattern;

public class BookIterator implements Iterator<Book>{
    private Book[] books;
    private int position;

    public BookIterator(Book[] books) {
        this.books = books;
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        return position < books.length;
    }

    @Override
    public Book next() {
        return hasNext() ? books[position++] : null;
    }
}
