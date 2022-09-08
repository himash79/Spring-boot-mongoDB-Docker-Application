package lk.himash.app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import lk.himash.app.entity.Book;

@Repository
public interface BookRepository extends MongoRepository<Book, String> {

}
