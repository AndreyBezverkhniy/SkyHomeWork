package DZ_13;

import java.util.Objects;

public class Book {
    private final String name;
    private final Author author;
    private int year;

    Book(String name, Author author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Book{");
        sb.append("'").append(name).append("' ");
        sb.append(author).append(" ");
        sb.append(year).append(" год");
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year && Objects.equals(name, book.name) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author, year);
    }

    public String getName() {
        return this.name;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
