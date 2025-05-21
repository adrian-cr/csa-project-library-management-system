package com.cognizant.LibraryManagementSystem.services;

import com.cognizant.LibraryManagementSystem.models.Book;
import com.cognizant.LibraryManagementSystem.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRep;

    public List<Book> getAllBooks() {
        return bookRep.findAll();
    }

    public Book getBookById(Integer id) {
        return bookRep.findById(id).get();
    }

    public Book addBook(Book book) {
        return bookRep.save(book);
    }

    public void updateBook(Integer id, String title, String author) {
        if (bookRep.existsById(id)) {
            Book book = bookRep.findById(id).get();
            if (title != null) book.setTitle(title);
            if (author != null) book.setAuthor(author);
            bookRep.save(book);
        }
    }

    public void deleteBook(Integer id) {
        bookRep.deleteById(id);
    }
}
