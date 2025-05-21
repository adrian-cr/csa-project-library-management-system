package com.cognizant.LibraryManagementSystem.controllers;

import com.cognizant.LibraryManagementSystem.models.Book;
import com.cognizant.LibraryManagementSystem.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/api/books")
public class BookController {
    private final BookService bs;

    @Autowired
    public BookController(BookService bs) {
        super();
        this.bs = bs;
    }

    @GetMapping
    public List<Book> getBooks(){
        return bs.getAllBooks();
    }

    @GetMapping(path="/{bookId}")
    public Book getBook(@PathVariable("bookId") Integer id) {
        return bs.getBookById(id);
    }

    @PostMapping
    public void addBook(@RequestBody Book book) {
        bs.addBook(book);
    }

    @PutMapping(path="/{bookId}")
    public void updateBook(
        @PathVariable("bookId") Integer id,
        @RequestParam(name="title", required=false) String title,
        @RequestParam(name="author", required=false) String author
    ) {
        bs.updateBook(id, title, author);
    }

    @DeleteMapping(path="/{bookId}")
    public void deleteBook(@PathVariable("bookId") Integer id) {
        bs.deleteBook(id);
    }
}
