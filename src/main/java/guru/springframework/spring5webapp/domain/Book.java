package guru.springframework.spring5webapp.domain;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
public class Book {
    @Id
    @GeneratedValue
    private UUID id;
    private String Title;
    private String isbn;
    @ManyToMany
    private List<Author> authors;
    @ManyToOne
    private Publisher publisher;

    protected Book() {
    }

    public Book(String title, String isbn, List<Author> authors, Publisher publisher) {
        Title = title;
        this.isbn = isbn;
        this.authors = authors;
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", Title='" + Title + '\'' +
                ", isbn='" + isbn + '\'' +
                ", authors=" + authors +
                '}';
    }
}
