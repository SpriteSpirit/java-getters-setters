import java.util.Objects;

public class Book {
    private String bookName;
    private Author author;
    private int publishedYear;

    public Book(String bookName, Author author, int publishedYear) {
        this.bookName = bookName;
        this.author = author;
        this.publishedYear = publishedYear;
    }

    public String getBookName() {
        return bookName;
    }
    public Author getAuthor() {
        return author;
    }

    public void setPublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;
    }

    public int getPublishedYear() {
        return publishedYear;
    }

    @Override
    public String toString() {
        return String.format("Book: %s%nAuthor: %s%nPublishedYear: %d%n", bookName, author, publishedYear);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book book)) return false;
        return getPublishedYear() == book.getPublishedYear() && Objects.equals(getBookName(), book.getBookName()) && Objects.equals(getAuthor(), book.getAuthor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBookName(), getAuthor(), getPublishedYear());
    }
}
