package DZ_13;

import java.util.Objects;

public class Author {
    private final String name;
    private final String lastName;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Author{");
        sb.append(name).append(" ");
        sb.append(lastName);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(name, author.name) && Objects.equals(lastName, author.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName);
    }

    public Author(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return this.name;
    }

    public String getLastName() {
        return this.lastName;
    }
}
