import java.util.ArrayList;
import java.util.List;

public class BookManager implements BookOperations {
    private List<Book> books;

    public BookManager() {
        this.books = new ArrayList<>();
        // Dodanie pięciu początkowych książek
        books.add(new Book("The Catcher in the Rye", "J.D. Salinger", "9780316769488", 1951));
        books.add(new Book("To Kill a Mockingbird", "Harper Lee", "9780060935467", 1960));
        books.add(new Book("1984", "George Orwell", "9780451524935", 1949));
        books.add(new Book("Pride and Prejudice", "Jane Austen", "9781503290563", 1813));
        books.add(new Book("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565", 1925));
    }

    @Override
    public void addBook(Book book) {
        books.add(book);
    }

    @Override
    public void removeBook(String isbn) {
        books.removeIf(book -> book.getIsbn().equals(isbn));
    }

    @Override
    public void updateBook(String isbn, Book updatedBook) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getIsbn().equals(isbn)) {
                books.set(i, updatedBook);
                break;
            }
        }
    }

    @Override
    public List<Book> getBooks() {
        return new ArrayList<>(books);
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
