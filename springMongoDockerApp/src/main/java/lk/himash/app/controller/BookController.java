package lk.himash.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lk.himash.app.entity.Book;
import lk.himash.app.repository.BookRepository;

@RestController
@RequestMapping("/bookApi")
public class BookController {

	@Autowired
	private BookRepository bookRepo;
	
	@GetMapping("/getAllBooks")
	public List<Book> getAllBooks() {
		return bookRepo.findAll();
	}
	
	@PostMapping("/addBook")
	public Book addBook(@RequestBody Book book) {
		Book bookObj = bookRepo.save(book);
		return bookObj;
	}
	
	
}
