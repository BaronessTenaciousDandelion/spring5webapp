package guru.springframework.spring5webapp.domain;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
public class Book {
    @Id
    @GeneratedValue
    private UUID id;
    private String title;
    private String isbn;
    @ManyToMany
    private List<Author> authors;
    @ManyToOne
    private Publisher publisher;

    protected Book() {
    }

    public Book(String title, String isbn, List<Author> authors, Publisher publisher) {
        this.title = title;
        this.isbn = isbn;
        this.authors = authors;
        this.publisher = publisher;
    }

    public UUID getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getIsbn() {
        return isbn;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", isbn='" + isbn + '\'' +
                ", authors=" + authors +
                ", publisher=" + publisher +
                '}';
    }
}
