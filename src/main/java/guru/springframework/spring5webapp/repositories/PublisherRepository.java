package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface PublisherRepository extends CrudRepository<Publisher, UUID> {
}
